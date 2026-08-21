select ANIMAL_ID, NAME
from animal_ins
where lower(name) like lower('%el%') and animal_type = 'Dog'
order by name asc, animal_id asc;