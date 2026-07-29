select product_id, product_name, product_cd, category, price
from (
    select *
    from food_product
    order by price desc
)
where rownum < 2;