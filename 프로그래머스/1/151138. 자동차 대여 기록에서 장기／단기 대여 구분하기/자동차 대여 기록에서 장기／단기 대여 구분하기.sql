select history_id, car_id, start_date, end_date, case
    when datediff(end_date, start_date) + 1 >= 30 then '장기 대여'
    else '단기 대여'
    end as "RENT_TYPE"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE between date '2022-09-01' and date '2022-09-30'
order by history_id desc;