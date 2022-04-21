REM   Script: Activity5
REM   Update

insert all 
into salesman values(5001,James Hoog,New York,15) 
into salesman values(5002,Nail Knite,Paris,13) 
into salesman values(5005,Pit Alex,London,11) 
into salesman values(5006,McLyon,Paris,14) 
into salesman values(5007,Paul Adam,Rome,13) 
into salesman values(5003,Lauson Hen,San Jose,12) ;

insert all 
into salesman values(5001,James Hoog,New York,15) 
into salesman values(5002,Nail Knite,Paris,13) 
into salesman values(5005,Pit Alex,London,11) 
into salesman values(5006,McLyon,Paris,14) 
into salesman values(5007,Paul Adam,Rome,13) 
into salesman values(5003,Lauson Hen,San Jose,12) 
select 1 from dual;

insert all 
into salesman values(5001,'James Hoog','New York',15) 
into salesman values(5002,'Nail Knite','Paris',13) 
into salesman values(5005,'Pit Alex','London',11) 
into salesman values(5006,'McLyon','Paris',14) 
into salesman values(5007,'Paul Adam','Rome',13) 
into salesman values(5003,'Lauson Hen','San Jose',12) 
select 1 from dual;

select * from salesman;

select * from salesman;

insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12)  
select 1 from dual;

describe salesman


insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12) 
into salesman values(100) 
select 1 from dual;

insert all  
into salesman values(5001,'James Hoog','New York',15)  
into salesman values(5002,'Nail Knite','Paris',13)  
into salesman values(5005,'Pit Alex','London',11)  
into salesman values(5006,'McLyon','Paris',14)  
into salesman values(5007,'Paul Adam','Rome',13)  
into salesman values(5003,'Lauson Hen','San Jose',12) 
into salesman values(100) 
select 1 from dual;

insert all  
into salesman values(5001,'James Hoog','New York',15,100)  
into salesman values(5002,'Nail Knite','Paris',13,100)  
into salesman values(5005,'Pit Alex','London',11,100)  
into salesman values(5006,'McLyon','Paris',14,100)  
into salesman values(5007,'Paul Adam','Rome',13,100)  
into salesman values(5003,'Lauson Hen','San Jose',12,100) 
 
select 1 from dual;

select * from salesman;

update salesman set grade =200 where salesman_city='Rome';

update salesman set grade =300 where salesman_name='James Hoog';

update salesman set salesman_name ='Pierre' where salesman_name='McLyon';

select * from salesman;