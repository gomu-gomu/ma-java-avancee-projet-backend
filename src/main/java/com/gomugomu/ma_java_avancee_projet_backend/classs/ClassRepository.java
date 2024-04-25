package com.gomugomu.ma_java_avancee_projet_backend.classs;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gomugomu.ma_java_avancee_projet_backend.dashboard.TopClassesResponse;

public interface ClassRepository extends JpaRepository<Class, UUID> {

  @Query(value = """
      WITH LatestCycle AS (
          SELECT id AS "cycleId"
          FROM cycles
          WHERE year = (SELECT MAX(year) FROM cycles)
      ),
      StudentScores AS (
          SELECT
              c.id AS classId,
              c.name AS "className",
              g.name AS "grade",
              sec.name AS "sector",
              s.id AS studentId,
              AVG(se.score) AS averageScore
          FROM "studentExams" se
          INNER JOIN students s ON se."studentId" = s.id
          INNER JOIN "studentCycles" sc ON sc."studentId" = s.id
          INNER JOIN LatestCycle lc ON sc."cycleId" = lc."cycleId"
          INNER JOIN cycles cy ON sc."cycleId" = cy.id
          INNER JOIN classes c ON cy."classId" = c.id
          INNER JOIN grades g ON c."gradeId" = g.id
          INNER JOIN sectors sec ON g."sectorId" = sec.id
          GROUP BY c.id, c.name, g.name, sec.name, s.id
      ),
      ClassSuccess AS (
          SELECT
              "className",
              "grade",
              "sector",
              COUNT(*) AS totalStudents,
              COUNT(CASE WHEN averageScore > 10 THEN 1 ELSE NULL END) AS "successfulStudents"
          FROM studentScores
          GROUP BY "className", "grade", "sector"
      ),
      SuccessPercentage AS (
          SELECT
              "className",
              "grade",
              "sector",
              "successfulStudents",
              totalStudents,
              ROUND((CAST("successfulStudents" AS DECIMAL) / totalStudents) * 100, 2) AS "successRate"
          FROM ClassSuccess
      )
      SELECT "className", "grade", "sector", "successRate"
      FROM SuccessPercentage
      ORDER BY "successRate" DESC""", nativeQuery = true)
  List<TopClassesResponse> findTopClasses();

  default List<TopClassesResponse> getTopClasses(Short max) {
    return findTopClasses().stream().limit(max).collect(Collectors.toList());
  }
}