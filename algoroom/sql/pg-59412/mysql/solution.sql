select hour(DATETIME) as "HOUR", count(*) as "COUNT"
from animal_outs
where hour(DATETIME) between 9 and 19
group by hour(DATETIME)
order by hour(DATETIME) asc;