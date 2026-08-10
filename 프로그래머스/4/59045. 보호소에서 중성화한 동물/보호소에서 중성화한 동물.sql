select i.animal_id, i.animal_type, i.name
from animal_ins i join animal_outs o
on i.animal_id = o.animal_id
and i.sex_upon_intake like 'Intact%'
where o.sex_upon_outcome like 'Spayed%'
    or o.sex_upon_outcome like 'Neutered%';