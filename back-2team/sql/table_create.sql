-- user tabel 생성
-- String email, String password, String nickname, String phone, String interest
create table user(
    unum int primary key auto_increment, 
    email varchar(30) not null, 
    password varchar(20) not null, 
    nickname varchar(20) not null,
    phone varchar(20),
    interest varchar(50)
    
);
drop table user;

-- 게시물 tabel 생성
-- int unum, String title, String img, String contents, int likes, int hits, int comments, String date, String privacy
-- unum,title,img,contents,likes,hits,comments,date,privacy
create table post(
	pnum int primary key auto_increment,
    unum int not null,
    title varchar(30),
    img varchar(50),
    contents varchar(1000),
	
    hits int default 0, 	-- 조회수
    comments int default 0,	-- 댓글수? 댓글 테이블의 숫자를 세야하는 건가?
    date datetime,
    privacy varchar(30) default 'all', -- 공개범위 (only me, only follower, all)
	constraint fk_unum foreign key(unum) references user(unum)
);
	insert into post(unum,title,img,contents,date)
    values ('4','아침 부터 산책','img','멍멍이 산책',sysdate());
	insert into post(unum,title,img,contents,date)
    values ('1','고양이123','img','오늘 고양이',current_timestamp());

select pnum,unum,title,img,contents,likes,hits,comments,date,privacy from post;

drop table post;
-- 펫 tabel 생성
create table pet(
	petnum int primary key auto_increment,
    unum int not null,
    name varchar(30),
    animal varchar(30),
    gender varchar(30),
    breed varchar(30),
    age int,
    firstday datetime,
    img varchar(50),
    intro varchar(100),
	constraint fk_pet_unum foreign key(unum) references user(unum)
);

drop table pet;

desc user;
select * from user;

insert into user (email, password, nickname,phone,interest) values ('qwe@gmail.com' , 'qwer1234', '가나다','010','강아지,고양이,물고기');
insert into user (email, password, nickname,phone,interest) values ('123@gmail.com' , 'qwer1234', '13','010','물고기');

desc post;
select * from post;

update post set hits = hits+1
		where pnum = 4;
        
desc pet;
select * from pet;

        
select pnum,unum,title,img,contents,likes,hits,comments,date,privacy
		from post
		where unum = 1;
        
-- 해시태그 tabel
create table tag(
	tnum int  primary key auto_increment,
	word varchar(50)
);

select * from tag;

insert into tag (word)
		values ("파랑");

insert into tag (word) values ("강아지");
insert into tag (word) values ("강아지집");
insert into tag (word) values ("야옹");
insert into tag (word) values ("고양이");
insert into tag (word) values ("물고기");
-- 게시물_해시태그_테이블

create table post_tag(
	no int primary key auto_increment,
	postnum int,
    tagnum int,
    constraint fk_post_tag_pnum foreign key(postnum) references post(pnum),
    constraint fk_post_tag_tnum foreign key(tagnum) references tag(tnum)
);
select tagnum from post_tag where postnum = 1;


select word from tag where tnum in (select tagnum from post_tag where postnum = 1) order by tnum;
 select
		pnum,unum,title,img,contents,likes,hits,comments,date,privacy
		from post;

select * from post_tag limit 3; -- 3개
insert into post_tag (postnum, tagnum) values (1,1);
select *  from post_tag where postnum = 1;

-- tag에 강아지집이 들어있는 모든 포스트 가져오기
select *  from post_tag where tagnum = 2;
select tnum from tag where word = '강아지집';

select postnum from post_tag where tagnum =(select tnum from tag where word = '강아지집');



-- 해시태그 참조
-- https://velog.io/@juna-dev/%ED%95%B4%EC%8B%9C%ED%83%9C%EA%B7%B8-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-9ak4xocihh

-- 댓글 tabel

-- 다이어리 tabel

