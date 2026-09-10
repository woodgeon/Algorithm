select i.animal_id as "ANIMAL_ID", i.name as "NAME"
from ANIMAL_INS i join ANIMAL_OUTS o
on i.animal_id = o.animal_id
where o.datetime < i.datetime
order by i.datetime asc;