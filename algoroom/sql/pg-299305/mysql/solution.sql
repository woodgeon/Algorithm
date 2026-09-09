select id, (select count(*) from ecoli_data where e.id = parent_id) as "CHILD_COUNT"
from ecoli_data e
order by id asc;
