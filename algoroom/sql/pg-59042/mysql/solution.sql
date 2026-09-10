select o.animal_id, o.name
from ANIMAL_OUTS o left join ANIMAL_INS i
on o.ANIMAL_ID = i.ANIMAL_ID
where i.ANIMAL_ID is null
order by o.animal_id asc;
