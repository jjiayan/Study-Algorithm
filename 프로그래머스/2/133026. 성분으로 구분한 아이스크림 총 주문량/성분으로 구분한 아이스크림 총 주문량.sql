-- 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회
-- FIRST_HALF
-- SHIPMENT_ID, FLAVOR, TOTAL_ORDER
-- 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량
-- ICECREAM_INFO
-- FLAVOR, INGREDITENT_TYPE
-- 아이스크림 맛, 아이스크림의 성분 타입
select i.ingredient_type, sum(f.total_order) as total_order
from first_half f join icecream_info i
on f.flavor = i.flavor
group by i.ingredient_type
order by total_order asc