create table tm_provider
(
t_id number(4) primary key,
name varchar2(40),
fm_cost number(4),
hm_cost number(4),
location varchar2(40)
)
truncate table tm_provider
insert into tm_provider values(1,'Aman Tiffin Services',100,60,'Powai')
insert into tm_provider values(2,'Poppy Tiffin Services',120,65,'Powai')
insert into tm_provider values(3,'Chirag Tiffin Services',140,80,'Powai')

insert into tm_provider values(4,'Dhanur Tiffin Services',200,110,'Andheri')
insert into tm_provider values(5,'KK Tiffin Services',180,100,'Andheri')
insert into tm_provider values(6,'Farhan Tiffin Services',160,90,'Andheri')

insert into tm_provider values(7,'Ganesh Tiffin Services',130,70,'Thane')
insert into tm_provider values(8,'Harish Tiffin Services',170,85,'Thane')

select * from tm_provider