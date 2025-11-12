-- PRODUCT: PRODUCT_ID, PRODUCT_CODE, PRICE
--          상품 ID, 상품코드, 판매가
-- OFFLINE_SALE: OFFLINE_SALE_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
--               오프라인 상품 판매 ID, 상품 ID, 판매량, 판매일
-- SELECT p.PRODUCT_CODE, sum(p.PRICE * o.SALES_AMOUNT) as sales
-- from PRODUCT p join OFFLINE_SALE o
-- on p.PRODUCT_ID = o.PRODUCT_ID
-- group by p.PRODUCT_CODE
-- order by sales asc
select p.product_code, p.price * o.total_sales_amount as sales
from product p join (
                    select product_id, sum(sales_amount) as total_sales_amount
                    from offline_sale
                    group by product_id
                    ) o
on p.product_id = o.product_id
order by sales desc, p.product_code asc
