select i.FOOD_TYPE, i.REST_ID, i.REST_NAME, i.FAVORITES
from REST_INFO i
where i.FAVORITES = (
    select max(FAVORITES)
    from REST_INFO sub
    where sub.FOOD_TYPE = i.FOOD_TYPE
)
order by i.FOOD_TYPE desc;