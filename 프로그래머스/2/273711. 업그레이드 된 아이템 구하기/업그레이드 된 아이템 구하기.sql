select item_id, item_name, rarity
from item_info
-- 아이디를 가져와서 출력하라.
where item_id in (
    select item_id
    from item_tree
    -- 그 아이디가 item_tree 테이블 안에 부모테이블로 존재하는
    where parent_item_id in (
        -- item_info 테이블에서 레어 등급인 아이템의 id를 가져와서
        select item_id
        from item_info
        where rarity = 'RARE'
    )
)
order by item_id desc;