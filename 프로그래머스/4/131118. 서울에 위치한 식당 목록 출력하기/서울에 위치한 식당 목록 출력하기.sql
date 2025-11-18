-- REST_INFO
-- REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS, TEL
-- 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호
-- REST_REVIEW
-- REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT,REVIEW_DATE
-- 리뷰 ID, 식당 ID, 회원 ID, 점수, 리뷰 텍스트, 리뷰 작성일
select i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, address, r.score
from 
    (SELECT REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, address FROM REST_INFO
    WHERE ADDRESS LIKE '서울%') i 
    join
    (select rest_id, round(avg(review_score), 2) as score from REST_REVIEW 
    where rest_id in (select rest_id from rest_info where address like '서울%')
    group by rest_id) r
on i.rest_id = r.rest_id
order by r.score desc, i.favorites desc
