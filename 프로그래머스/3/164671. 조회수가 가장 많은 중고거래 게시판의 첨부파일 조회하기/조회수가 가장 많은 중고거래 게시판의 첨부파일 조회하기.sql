select concat('/home/grep/src/', f.BOARD_ID, '/', f.FILE_ID, f.FILE_NAME, f.FILE_EXT)
from USED_GOODS_FILE f join (
    select board_id
    from USED_GOODS_BOARD
    order by views desc
    limit 1
) b
on f.board_id = b.board_id
order by f.file_id desc;

 