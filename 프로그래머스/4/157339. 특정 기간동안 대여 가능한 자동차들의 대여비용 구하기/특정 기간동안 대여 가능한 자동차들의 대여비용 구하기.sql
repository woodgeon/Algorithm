select c.car_id, c.car_type, (daily_fee * 30 * (1 - d.DISCOUNT_RATE / 100)) as "FEE"
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_DISCOUNT_PLAN d
on c.car_type = d.car_type
and d.duration_type = '30일 이상'
where c.car_type in ('세단', 'SUV')
    and c.car_id not in (
        select car_id
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        where START_DATE <= '2022-11-30'
            and END_DATE >= '2022-11-01'
    )
group by c.car_id, c.car_type
having fee >= 500000 and fee <= 2000000
order by fee desc, c.car_type asc, c.car_id desc;