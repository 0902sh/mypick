create table movie
(
	movie_name	varchar(100),
	open_date 	varchar(8) default '99991231',
	rating		int(2)
);

-- Y2K
-- 날짜타입의 컬럼을 6자리로 만들었었음 701001
-- 99년에서 00년으로 넘어갈 때 문제가 생겨 프로젝트를 다수 수행

-- 영화테이블에 장르(genre)를 추가해달라고 함!
-- alter
alter table movie add column genre varchar(20);

--100세 관람가 => rating이 3자리로 변경되어야 함
alter table movie modify column rating int(3);

-- 영화 이름만 결정됨
insert into movie(rating, movie_name) values(13, 'scream');
insert into movie(rating, movie_name) values(18, '%');

select *
from movie
where movie_name like '%cr%'  -- cr이 포함된 데이터
;

select *
from movie
where movie_name like '%\%%'  -- \%는 %라는 글자를 의미
;

-- desc : 테이블의 정보를 보여주는 명령어
desc movie;

insert into movie values('파묘', '20240222', 12, 'Horror');
insert into movie values('오리엔트특급살인', '20171129', 12, 'Drama');
insert into movie(movie_name, genre) values('반칙의제왕', 'Comedy');

select *
from   movie
where  1 = 1
-- if 영화이름으로 검색하면 and movie_name like '%검색어%'
-- if 장르로 검색하면 and genre like '%검색어%'
-- if 개봉일자로 검색하면 and open_date like '%검색어%'
;

select movie_name
	 , open_date
	 , genre
from   movie
limit  1
;

-- where절 추가
select *
from   movie
-- 2024년 이후 개봉한 영화 조회
where  open_date >= '20240101'
-- '99991231'은 미정이니까 빼자
and	  ( open_date <> '99991231'	-- != , <> : 같지 않다
or	   genre = 'Drama')
;

-- update
-- '반칙의제왕' 개봉일이 확정되었다!! 20240914일로

select *
from	movie
where movie_name = '반칙의제왕'

update movie
set    open_date = '20240914'
;
-- 12세 관람가 영화가 10세
-- 10세 관람가로 바꾸라고 지시가 내려왔다.
-- 12세 관람가 영화를 10세 관람가로 업데이트하시오.
select *
from   movie
where  rating = 12
;
update movie
set rating = 10
where rating = 12
;

-- '오리엔트특급살인' 영화의 재개봉일이 잡혔다.
-- '파묘'의 개봉일과 같다고 한다. 개봉일을 수정하시오.
select open_date
from	movie
where movie_name = '파묘'
;

update movie
set	   open_date = '20240222'
where  movie_name = '오리엔트특급살인'
;

select *

insert into movie(movie_name, open_date)
values('베테랑2','20240913')

-- 장르도 없는 영화는 지우고 싶다.
select *
from   movie;

delete from movie
where genre is null and rating is null;

-- genre가 null인 영화는 'TBD'으로 genre를 변경하시오.

update movie
set genre = 'TBD'
where genre is null

