with car_data as (
    select h.history_id, c.car_type, c.car_id, c.daily_fee, datediff(h.end_date, h.start_date) + 1 as "rent_date",
    case
        when datediff(h.end_date, h.start_date) + 1 >= 90 then '90일 이상'
        when datediff(h.end_date, h.start_date) + 1 >= 30 then '30일 이상'
        when datediff(h.end_date, h.start_date) + 1 >= 7 then '7일 이상'
        else null
    end as "duration_type"
    from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
    on c.CAR_ID = h.CAR_ID
    where c.car_type = '트럭'
)

select c.history_id as "HISTORY_ID", 
    floor((c.daily_fee * c.rent_date) * (100 - ifnull(p.discount_rate, 0)) / 100) as "FEE"
from car_data c left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
on c.car_type = p.car_type
and c.DURATION_TYPE = p.DURATION_TYPE
group by c.history_id
order by fee desc, history_id desc;