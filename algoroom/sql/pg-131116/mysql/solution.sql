select f.category as "CATEGORY", f.price as "MAX_PRICE", f.product_name as "PRODUCT_NAME"
from food_product f
where f.price = (
    select max(sub.price)
    from food_product sub
    where sub.category = f.category
) and f.category in ('과자', '국', '김치', '식용유')
order by MAX_PRICE desc;