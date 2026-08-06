select floor(price / 10000) * 10000 as "PRICE_GROUP", count(*)
from product
group by price_group
order by price_group asc;