select food_type, rest_id, rest_name, favorites
from rest_info i
where i.favorites = (
    select max(favorites)
    from rest_info sub
    where sub.food_type = i.food_type
)
order by food_type desc;