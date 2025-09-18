-- USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
SELECT u.user_id, u.nickname, b.total_sales
from used_goods_user u join (select writer_id, sum(price) as total_sales from used_goods_board
                             where status = 'DONE' 
                             group by writer_id
                            ) b
                             
on u.user_id = b.writer_id
where b.total_sales >= 700000
order by b.total_sales asc
