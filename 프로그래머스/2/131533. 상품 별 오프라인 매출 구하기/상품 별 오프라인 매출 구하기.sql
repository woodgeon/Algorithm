select p.product_code as "PRODUCT_CODE", p.price * o.sales_amount as "SALES"
from product p join(
    select product_id, sum(sales_amount) as "sales_amount"
    from offline_sale
    group by product_id
) o
on p.product_id = o.product_id
group by p.product_code
order by sales desc, product_code asc;