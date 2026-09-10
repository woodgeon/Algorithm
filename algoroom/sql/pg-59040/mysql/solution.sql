select animal_type as "ANIMAL_TYPE", count(ifnull(name, 0)) as "count"
from animal_ins
group by animal_type
order by animal_type asc;