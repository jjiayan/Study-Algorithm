-- 코드를 입력하세요
SELECT u.user_id, u.nickname, 
        u.city || ' ' || u.street_address1 || ' ' || u.street_address2 as "전체주소", 
        substr(u.TLNO, 1, 3) || '-' || substr(u.TLNO, 4, 4) || '-' || substr(u.TLNO, 8, 4) as "전화번호"
from used_goods_user u join (
                            select writer_id, count(writer_id) as cnt
                            from used_goods_board
                            group by writer_id
                            ) b
on u.user_id = b.writer_id
where b.cnt >= 3
order by u.user_id desc


