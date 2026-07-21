select r.product_id as "PRODUCT_ID", r.product_name as "PRODUCT_NAME", sum(r.price * o.amount) as "TOTAL_SALES"
from FOOD_PRODUCT r join FOOD_ORDER o
on r.product_id = o.product_id
where o.produce_date between date '2022-05-01' and date '2022-05-31'
group by r.product_id, r.product_name
order by TOTAL_SALES desc, PRODUCT_ID asc;