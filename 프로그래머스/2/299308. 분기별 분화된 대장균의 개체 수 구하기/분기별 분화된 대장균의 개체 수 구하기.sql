select case
    when month(DIFFERENTIATION_DATE) in (01, 02, 03) then '1Q'
    when month(DIFFERENTIATION_DATE) in (04, 05, 06) then '2Q'
    when month(DIFFERENTIATION_DATE) in (07, 08, 09) then '3Q'
    else '4Q'
    end as "QUARTER",
    count(*) as "ECOLI_COUNT"
from ecoli_data
group by QUARTER
order by QUARTER asc;
               
               