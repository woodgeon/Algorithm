select count(distinct name) as "COUNT"
from animal_ins
where name is not null;