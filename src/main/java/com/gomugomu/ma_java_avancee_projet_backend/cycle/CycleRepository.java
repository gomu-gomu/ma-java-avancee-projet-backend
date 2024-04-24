package com.gomugomu.ma_java_avancee_projet_backend.cycle;

import java.util.List;
import java.util.UUID;

import com.gomugomu.ma_java_avancee_projet_backend.dashboard.CycleSuccessResponse;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CycleRepository extends JpaRepository<Cycle, UUID> {

  @Query("SELECT COUNT(DISTINCT cycle.year) FROM Cycle cycle")
  Integer countYears();

  @Query(value = """
        WITH ExamResults AS (
          SELECT c.year AS CycleYear, se.score
          FROM "studentExams" se
          JOIN exams e ON se."examId" = e.id
          JOIN cycles c ON e."cycleId" = c.id
        ),
        PassFailCounts AS (
          SELECT CycleYear, COUNT(*) AS TotalExams, COUNT(CASE WHEN score >= 10 THEN 1 END) AS PassingExams
          FROM ExamResults
          GROUP BY CycleYear
        )
        SELECT CycleYear, ROUND((CAST(PassingExams AS DECIMAL) / CAST(TotalExams AS DECIMAL)) * 100, 2) AS SuccessPercentage
        FROM PassFailCounts
        ORDER BY CycleYear ASC;
      """, nativeQuery = true)
  List<CycleSuccessResponse> cycleSuccess();

}