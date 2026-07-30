WITH SCORES AS (
    SELECT EMP_NO, AVG(SCORE) AS SCORE FROM HR_GRADE
    GROUP BY EMP_NO
    ORDER BY EMP_NO
),
GRADES AS (
    SELECT EMP_NO, SCORE, CASE WHEN SCORE >= 96 THEN 'S'
                               WHEN SCORE >= 90 THEN 'A'
                               WHEN SCORE >= 80 THEN 'B'
                               ELSE 'C'
                          END AS GRADE
    FROM SCORES
)

SELECT S.EMP_NO, H.EMP_NAME, S.GRADE, CASE WHEN S.SCORE >= 96 THEN H.SAL * 0.2
                                           WHEN S.SCORE >= 90 THEN H.SAL * 0.15
                                           WHEN S.SCORE >= 80 THEN H.SAL * 0.1
                                           ELSE 0
                                      END AS BONUS
FROM GRADES S JOIN HR_EMPLOYEES H ON S.EMP_NO = H.EMP_NO