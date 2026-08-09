select warehouse_id, warehouse_name, address, ifnull(freezer_yn, 'N')
from food_warehouse
where warehouse_name like '%경기%'
order by warehouse_id asc;