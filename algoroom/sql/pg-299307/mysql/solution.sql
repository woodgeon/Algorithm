select id, 
    case
        when ifnull(size_of_colony, 0) <= 100 then 'LOW'
        when ifnull(size_of_colony, 0) <= 1000 then 'MEDIUM'
        else 'HIGH'
    end as "SIZE"
from ecoli_data
order by id asc;