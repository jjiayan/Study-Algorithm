select c.car_id, TO_CHAR(ROUND(c.a, 1), 'FM9999990.0') as AVERAGE_DURATION
from (
    select car_id, avg(end_date - start_date + 1) as a
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    group by car_id
    ) c
where c.a >= 7
order by round(c.a, 1) desc, c.car_id desc


