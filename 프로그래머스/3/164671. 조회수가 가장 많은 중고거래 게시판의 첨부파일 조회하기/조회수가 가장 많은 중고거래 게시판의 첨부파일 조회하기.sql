-- 코드를 입력하세요
SELECT '/home/grep/src/' || b.board_id || '/' || f.file_id || f.file_name || f.file_ext as FILE_PATH
from used_goods_board b join used_goods_file f
on b.board_id = f.board_id
where views in (select max(views) from used_goods_board)
order by file_path desc