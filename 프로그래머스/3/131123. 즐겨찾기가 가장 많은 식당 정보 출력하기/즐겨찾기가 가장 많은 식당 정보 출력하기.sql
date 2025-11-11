-- REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS, TEL
-- 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호
select FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO
where (food_type, favorites) in 
                    (SELECT FOOD_TYPE, MAX(FAVORITES) as FAVORITES
                    FROM REST_INFO
                    group by food_type ) 
order by food_type desc