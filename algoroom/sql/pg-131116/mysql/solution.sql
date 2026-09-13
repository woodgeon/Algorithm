select f.CATEGORY, f.price as MAX_PRICE, f.PRODUCT_NAME
from FOOD_PRODUCT f
where PRICE = (
    select max(PRICE)
    from FOOD_PRODUCT sub
    where sub.CATEGORY = f.CATEGORY
) and f.CATEGORY in ('과자', '국', '김치', '식용유')
order by MAX_PRICE desc;