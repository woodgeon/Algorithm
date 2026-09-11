select animal_id, name, date_format(DATETIME, '%Y-%m-%d') as "날짜"
from animal_ins
order by animal_id asc;