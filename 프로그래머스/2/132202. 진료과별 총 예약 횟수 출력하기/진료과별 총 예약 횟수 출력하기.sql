-- 코드를 입력하세요
SELECT MCDP_CD, COUNT(1) AS COUNT
FROM APPOINTMENT
WHERE APNT_YMD BETWEEN '20220501' AND '20220601'
GROUP BY 1
ORDER BY 2, 1;