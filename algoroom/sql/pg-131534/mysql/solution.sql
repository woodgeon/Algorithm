select year(o.SALES_DATE) as "YEAR", month(o.SALES_DATE) as "MONTH", count(distinct o.user_id) as "PURCHASED_USERS", round(count(distinct o.user_id) / (select count(*) from user_info where year(joined) = 2021), 1) as "PUCHASED_RATIO"
from USER_INFO i join ONLINE_SALE o
on i.user_id = o.user_id
where year(i.joined) = 2021
group by year(o.SALES_DATE), month(o.SALES_DATE)
order by year(o.SALES_DATE) asc, month(o.SALES_DATE) asc;
