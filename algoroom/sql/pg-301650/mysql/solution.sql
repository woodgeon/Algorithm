select c.id
from ecoli_data a join ecoli_data b
    on a.id = b.parent_id and a.parent_id is null
    join ecoli_data c
    on b.id = c.parent_id
order by id asc;
