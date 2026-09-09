select t.item_id, i.item_name, i.rarity
from item_info i join item_tree t
on i.item_id = t.item_id
where t.parent_item_id is not null
order by t.item_id desc, i.item_name desc, i.rarity desc;