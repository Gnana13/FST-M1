REM   Script: Activity3
REM   Select

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

select * from salesman;

select * from salesman;

select * from salesman;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city = 'Paris';

select salesman_id, commission from salesman where salesman_name ='Paul Adam';