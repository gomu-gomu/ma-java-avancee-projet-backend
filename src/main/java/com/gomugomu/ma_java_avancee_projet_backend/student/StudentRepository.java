package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gomugomu.ma_java_avancee_projet_backend.dashboard.TopStudentsResponse;

public interface StudentRepository extends JpaRepository<Student, UUID> {

    @Query(value = """
              WITH LatestCycle AS (
                  SELECT MAX(year) AS LatestYear
                  FROM "cycles"
              ),
              RankedScores AS (
                  SELECT
                      s."userId" AS id,
                      AVG(se.score) AS score,
                      g.name AS grade,
                      sec.name AS sector,
                      s."lastName",
                      s."firstName"
                  FROM "studentExams" se
                  INNER JOIN "students" s ON se."studentId" = s.id
                  INNER JOIN "studentCycles" sc ON sc."studentId" = s.id
                  INNER JOIN "cycles" c ON sc."cycleId" = c.id AND c.year = (SELECT LatestYear FROM LatestCycle)
                  INNER JOIN "classes" cls ON c."classId" = cls.id
                  INNER JOIN "grades" g ON cls."gradeId" = g.id
                  INNER JOIN "sectors" sec ON g."sectorId" = sec.id
                  GROUP BY s."userId", g.name, sec.name, s."lastName", s."firstName"
              )
              SELECT "id", "score", "grade", "sector", "lastName", "firstName"
              FROM RankedScores
              ORDER BY "score" DESC
            """, nativeQuery = true)
    List<TopStudentsResponse> findTopStudents();

    default List<TopStudentsResponse> getTopStudents(Short max) {
        return findTopStudents().stream().limit(max).collect(Collectors.toList());
    }
}