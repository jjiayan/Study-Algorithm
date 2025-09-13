-- 코드를 입력하세요
-- 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회
-- 댓글 작성일을 기준으로 오름차순 정렬해주시고, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬
select b.title, b.board_id, r.reply_id, r.writer_id, r.contents, to_char(r.created_date, 'YYYY-MM-DD') as created_date
from used_goods_board b join used_goods_reply r
on b.board_id = r.board_id
where to_char(b.created_date, 'YYYY-MM') = '2022-10'
order by r.created_date asc, b.title asc