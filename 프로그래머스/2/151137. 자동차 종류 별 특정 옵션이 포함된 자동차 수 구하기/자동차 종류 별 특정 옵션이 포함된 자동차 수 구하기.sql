-- 코드를 입력하세요
SELECT car_type, count(car_type) as cars from CAR_RENTAL_COMPANY_CAR
WHERE REGEXP_LIKE(options, '통풍|열선|가죽')
group by car_type
order by car_type
