select o.animal_id as "ANIMAL_ID", o.name as "NAME"
from ANIMAL_INS i join ANIMAL_OUTS o
on i.animal_id = o.animal_id
where i.datetime > o.datetime
order by i.datetime asc;