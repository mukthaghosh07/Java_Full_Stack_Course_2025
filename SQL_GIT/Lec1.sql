# how to create a database in SQL
create database sample1;
drop database temp1;
use sample1;
# how to create a table in SQL
CREATE TABLE student( id INT PRIMARY KEY , 
name VARCHAR(50)
);

INSERT INTO student(id, name) 
VALUES
(1,"muktha"),
(2,"ankit"),
(3,"mina");

SELECT * FROM student;


#constraints (UNIQUE, PRIMARY KEY, NOT NULL)
CREATE TABLE studentinfo( id INT PRIMARY KEY , 
name VARCHAR(50),
age int NOT NULL,
citypin INT UNIQUE
);

#DEFAULT  
CREATE TABLE studentconst( id INT PRIMARY KEY , 
salary INT DEFAULT 25000
);

INSERT INTO studentconst(id) VALUES(101);

SELECT * FROM studentconst;