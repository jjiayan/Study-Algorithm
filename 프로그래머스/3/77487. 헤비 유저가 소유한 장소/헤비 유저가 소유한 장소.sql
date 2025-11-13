-- 코드를 입력하세요
SELECT P.ID, P.NAME, Q.HOST_ID
FROM PLACES P JOIN (
                SELECT HOST_ID, COUNT(HOST_ID) AS CNT
                FROM PLACES 
                GROUP BY HOST_ID
                HAVING COUNT(HOST_ID) >= 2
                ) Q
ON P.HOST_ID = Q.HOST_ID
ORDER BY P.ID ASC
