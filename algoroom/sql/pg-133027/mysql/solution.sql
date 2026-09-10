select h.flavor
from (
    select flavor, sum(TOTAL_ORDER) as "TOTAL_ORDER"
    from first_half
    group by flavor
) h join
(
    select flavor, sum(TOTAL_ORDER) as "TOTAL_ORDER"
    from july
    group by flavor
) j
on h.flavor = j.flavor
order by (h.TOTAL_ORDER + j.TOTAL_ORDER) desc
limit 3;
