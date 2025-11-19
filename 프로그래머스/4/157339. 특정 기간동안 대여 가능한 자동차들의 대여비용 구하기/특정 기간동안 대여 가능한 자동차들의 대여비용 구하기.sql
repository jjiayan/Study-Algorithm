SELECT 
    c.car_id,
    c.car_type,
    (c.daily_fee * (100 - p.discount_rate) * 0.01 * 30) AS fee
FROM
    CAR_RENTAL_COMPANY_CAR c
JOIN
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
      ON c.car_type = p.car_type
     AND p.duration_type = '30일 이상'
WHERE 
    c.car_type IN ('세단', 'SUV')
    AND NOT EXISTS (
        SELECT 1
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY h
        WHERE h.car_id = c.car_id
          AND h.start_date <= DATE '2022-11-30'
          AND h.end_date >= DATE '2022-11-01'
    )
    AND (c.daily_fee * (100 - p.discount_rate) * 0.01 * 30) >= 500000
    AND (c.daily_fee * (100 - p.discount_rate) * 0.01 * 30) < 2000000
ORDER BY 
    fee DESC,
    c.car_type ASC,
    c.car_id DESC;
