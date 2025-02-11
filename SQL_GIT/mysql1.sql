CREATE database temp1;

use temp1;

CREATE TABLE student1( 
id INT PRIMARY KEY, 
name CHAR(20), 
age INT NOT NULL
);


insert into student1 values(101,"mukthaa",21);
insert into student1 values(102,"ankitt",22);

 SELECT * FROM student1;
 