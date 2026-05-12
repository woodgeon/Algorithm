/* Write your PL/SQL query statement below */
select v.customer_id, COUNT(*) as "count_no_trans"
from visits v left join transactions t
on v.visit_id = t.visit_id
where t.visit_id is NULL
group by v.customer_id;