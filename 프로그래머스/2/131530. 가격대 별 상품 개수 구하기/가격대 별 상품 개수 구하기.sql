-- PRODUCT_ID, PRODUCT_CODE, PRICE
-- 상품 ID, 상품코드, 판매가
-- max 85000, min 15000

select price * 10000 as price_group, count(price) as products
from (
    SELECT product_id, product_code, trunc(price / 10000, 0) as price
    from PRODUCT
    )
group by price
order by price