-- ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
-- 온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일
select o.user_id, o.product_id
from (
SELECT user_id, product_id, COUNT(*) AS cnt
FROM ONLINE_SALE
GROUP BY user_id, product_id
) o 
where o.cnt >= 2
order by o.user_id asc, o.product_id desc