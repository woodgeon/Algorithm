select id, (
    select count(*)
    from ecoli_data as b
    where b.parent_id = a.id
) as "CHILD_COUNT"
from ecoli_data as a
order by id asc;