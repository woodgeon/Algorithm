select month(START_DATE) as "MONTH", car_id as "CAR_ID", count(*) as "RECORDS"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where START_DATE >= '2022-08-01'
        and START_DATE < '2022-11-01'
    group by car_id
    having count(*) >= 5
)
    and START_DATE >= '2022-08-01'
    and START_DATE < '2022-11-01'
group by month(START_DATE), car_id
order by month(START_DATE) asc, car_id desc;