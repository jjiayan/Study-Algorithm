SELECT distinct c.car_id
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY d
on c.car_id = d.car_id
where c.car_type = '세단' and to_char(d.start_date, 'MM') = '10'
order by c.car_id desc