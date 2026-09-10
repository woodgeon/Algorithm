select year(o.SALES_DATE) as "YEAR", month(o.SALES_DATE) as "MONTH", i.gender as "GENDER", count(distinct o.USER_ID) as "USERS" 
from user_info i join online_sale o
on i.user_id = o.user_id
where i.gender is not null
group by year(o.SALES_DATE), month(o.SALES_DATE), i.gender
order by year(o.SALES_DATE) asc, month(o.SALES_DATE) asc, i.gender asc;