select item_id, item_name, rarity
from item_info
-- 해당 아이템 트리의 아이디를
where item_id in (
    select item_id
    from item_tree
    -- 부모가 레어인 아이템을 찾아서
    where parent_item_id in (
        select item_id
        from item_info
        where rarity = 'RARE'
    )
)
order by item_id desc;