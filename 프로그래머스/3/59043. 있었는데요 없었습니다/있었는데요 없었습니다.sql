select i.animal_id, i.name
from animal_ins i join animal_outs o
on i.animal_id = o.animal_id
where i.datetime > o.datetime -- 날짜가 크다 = 더 오래 지났다
order by i.datetime asc;