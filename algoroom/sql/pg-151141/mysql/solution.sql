select h.history_id, floor(c.DAILY_FEE * (datediff(h.END_DATE, h.START_DATE) + 1) * ((100 - ifnull(p.DISCOUNT_RATE, 0)) / 100)) as "FEE"
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID and c.CAR_TYPE = '트럭'
left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
on c.CAR_TYPE = p.CAR_TYPE
and p.DURATION_TYPE = case
    when datediff(h.END_DATE, h.START_DATE) + 1 >= 90 then '90일 이상'
    when datediff(h.END_DATE, h.START_DATE) + 1 >= 30 then '30일 이상'
    when datediff(h.END_DATE, h.START_DATE) + 1 >= 7 then '7일 이상'
    else null 
end
order by FEE desc, h.history_id desc;