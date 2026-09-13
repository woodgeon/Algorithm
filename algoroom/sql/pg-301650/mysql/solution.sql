select c.id
from ECOLI_DATA a join ECOLI_DATA b on a.id = b.PARENT_ID
    join ECOLI_DATA c on b.id = c.parent_id
where a.parent_id is null
order by id asc;

-- 1세대는 parent가 null이어야함.