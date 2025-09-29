SELECT history_id, car_id, to_char(start_date, 'YYYY-MM-DD') AS START_DATE, to_char(end_date, 'YYYY-MM-DD') AS END_DATE, 
            CASE WHEN
            (end_date - start_date + 1) >= 30
            THEN '장기 대여' ELSE '단기 대여' END RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE to_char(start_date, 'YYYY-MM') = '2022-09'
ORDER BY history_id desc