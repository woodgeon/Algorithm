select p.product_code as "PRODUCT_CODE", p.price * sales_amount as "SALES"
from product p join (
    select product_id, sum(sales_amount) as "sales_amount"
    from OFFLINE_SALE
    group by product_id 
) o
on p.product_id = o.product_id
order by sales desc, p.product_code asc;