select p.PRODUCT_ID, p.PRODUCT_NAME, p.PRICE * o.AMOUNT as "TOTAL_SALES"
from FOOD_PRODUCT p join (
    select PRODUCT_ID, sum(AMOUNT) as "AMOUNT"
    from FOOD_ORDER
    group by PRODUCT_ID
) o
on p.PRODUCT_ID = o.PRODUCT_ID
where p.PRODUCT_ID in (
    select PRODUCT_ID
    from FOOD_ORDER
    where PRODUCE_DATE between date '2022-05-01' and date '2022-05-31'
)
order by TOTAL_SALES desc, p.PRODUCT_ID asc;