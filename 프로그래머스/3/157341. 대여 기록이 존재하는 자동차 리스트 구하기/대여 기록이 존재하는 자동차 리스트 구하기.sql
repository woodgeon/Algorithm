select distinct car_id as "CAR_ID"
from CAR_RENTAL_COMPANY_CAR
where car_id in (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where START_DATE between date '2022-10-01' and date '2022-10-31'
)
    and car_type = '세단'
order by car_id desc;