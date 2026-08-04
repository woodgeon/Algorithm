select animal_type, count(*)
from ANIMAL_INS
where animal_type = 'Dog'
    or animal_type = 'Cat'
group by animal_type
order by animal_type asc;
