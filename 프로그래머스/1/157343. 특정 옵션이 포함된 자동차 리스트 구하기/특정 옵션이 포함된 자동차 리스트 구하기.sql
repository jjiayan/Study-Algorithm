-- -- 코드를 입력하세요
-- SELECT c.car_id, c.car_type, c.daily_fee, r.options
-- from car_rental_company_car c join (select car_id, options from car_rental_company_car) r
-- on c.car_id = r.car_id
-- where '네비게이션' in r.options

select car_id, car_type, daily_fee, options
from car_rental_company_car
where options like '%네비게이션%'
order by car_id desc