-- ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
-- 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부
-- 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회
SELECT ANIMAL_TYPE, COUNT(*) AS COUNT 
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC