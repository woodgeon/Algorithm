select i.item_id, i.item_name, i.rarity
from item_info i
where not exists (
    select 1
    from item_tree t
    where i.item_id = t.parent_item_id
)
order by item_id desc;