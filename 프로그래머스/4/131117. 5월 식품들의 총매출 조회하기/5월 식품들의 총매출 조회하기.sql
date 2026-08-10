select p.product_id as "PRODUCT_ID", p.product_name as "PRODUCT_NAME", sum(p.price * o.amount) as "TOTAL_SALES"
from food_product p join food_order o
on p.product_id = o.product_id
where o.produce_date between date '2022-05-01' and date '2022-05.31'
group by p.product_id, p.product_name
order by total_sales desc, product_id asc;