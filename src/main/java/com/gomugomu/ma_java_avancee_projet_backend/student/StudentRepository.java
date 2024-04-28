package com.gomugomu.ma_java_avancee_projet_backend.student;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gomugomu.ma_java_avancee_projet_backend.dashboard.TopStudentsResponse;
import com.gomugomu.ma_java_avancee_projet_backend.dashboard.StudentInfoResponse;
import com.gomugomu.ma_java_avancee_projet_backend.dashboard.StudentScoresResponse;

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

    @Query(value = """
        WITH StudentLatestCycle AS (
            SELECT 
                sc."cycleId",
                MAX(c.year) AS "cycleYear"
            FROM "studentCycles" sc
            JOIN cycles c ON sc."cycleId" = c.id
            WHERE sc."studentId" = :id
            GROUP BY sc."cycleId"
            ORDER BY MAX(c.year) DESC
            LIMIT 1
        )
        SELECT
            c.year AS "year",
            cls.name AS "className",
            g.name AS "grade",
            sec.name AS "sector"
        FROM StudentLatestCycle slc
        JOIN cycles c ON slc."cycleId" = c.id
        JOIN classes cls ON c."classId" = cls.id
        JOIN grades g ON cls."gradeId" = g.id
        JOIN sectors sec ON g."sectorId" = sec.id;
    """, nativeQuery = true)
    List<StudentInfoResponse> getStudentInfo(@Param("id") UUID id);

    @Query(value = """
        SELECT
            c.year AS "year",
            sub.name AS "subject",
            AVG(se.score) AS "score"
        FROM students s
        JOIN "studentExams" se ON s.id = se."studentId"
        JOIN exams e ON se."examId" = e.id
        JOIN subjects sub ON e."subjectId" = sub.id
        JOIN cycles c ON e."cycleId" = c.id
        JOIN classes cls ON c."classId" = cls.id
        JOIN grades g ON cls."gradeId" = g.id
        JOIN sectors sec ON g."sectorId" = sec.id
        WHERE s.id = :id
        GROUP BY c.year, sub.name, g.name, sec.name
        ORDER BY sub.name;
    """, nativeQuery = true)
    List<StudentScoresResponse> getStudentScores(@Param("id") UUID id);
} 