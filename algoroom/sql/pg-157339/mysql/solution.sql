select c.car_id, c.car_type, floor(((c.DAILY_FEE * 30) * ((100 - p.DISCOUNT_RATE) / 100))) as "FEE"
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
on c.CAR_TYPE = p.CAR_TYPE
where c.CAR_TYPE in ('세단', 'SUV') 
    and DURATION_TYPE = '30일 이상'
    and c.car_id not in (
        select car_id
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        where end_date >= '2022-11-01' and start_date <= '2022-11-30'
    )
    and ((c.DAILY_FEE * 30) * ((100 - p.DISCOUNT_RATE) / 100)) between 500000 and 2000000
order by FEE desc, c.car_type asc, c.car_id desc;