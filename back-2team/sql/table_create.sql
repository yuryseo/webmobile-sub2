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
    likes int default 0,	-- 좋아요 수
    hits int default 0, 	-- 조회수
    comments int default 0,	-- 댓글수? 댓글 테이블의 숫자를 세야하는 건가?
    date datetime,
    privacy varchar(30) default 'all', -- 공개범위 (only me, only follower, all)
	constraint fk_unum foreign key(unum) references user(unum)
);
	insert into post(unum,title,img,contents,date)
    values ('1','우리 강아지 자랑','img','내용',sysdate());
	insert into post(unum,title,img,contents,date)
    values ('1','고양이','img','내용',current_timestamp());

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
	constraint fk_pet_unum foreign key(unum) references user(unum)
);

drop table pet;

desc user;
select * from user;

insert into user (email, password, nickname,phone,interest) values ('qwe@gmail.com' , 'qwer1234', '가나다','010','강아지,고양이,물고기');

desc post;
select * from post;

desc pet;
select * from pet;


-- 해시태그 tabel
-- 댓글 tabel
-- 다이어리 tabel

