CREATE DATABASE jfs;
use jfs;


SET SQL_SAFE_UPDATES = 0;
CREATE TABLE tab1(
    did INT ,
    dname VARCHAR(50)
);

CREATE TABLE tab2 (
    empid INT,
    name VARCHAR(50),
    salary FLOAT,
    attendance BOOLEAN,
  
    joiningdate DATE,
    time_join TIMESTAMP
   
);

INSERT INTO tab1 (did, dname)
VALUES (1, 'python developer'), (2, ' software engineer');

SELECT did, dname FROM tab1;

INSERT INTO tab2 (empid, name, salary, attendance, joiningdate, time_join)
VALUES (101, 'muktha', 60000.50, TRUE, '2024-02-09', '2024-02-01 09:00:00'),
(102, 'sumitha', 75000.75, FALSE, '2024-01-15', '2024-01-15 10:30:00');


SELECT empid, name, salary, attendance, joiningdate, time_join FROM tab2;



#---------------------------------------------------------
CREATE TABLE emp1 (
    eid INT ,
    name VARCHAR(20),
    age INT,
    dept VARCHAR(50),
    Salary FLOAT
);

INSERT INTO emp1 (eid, name, age, dept, Salary)  
VALUES  
(101, 'muktha', 21, 'HR', 530000.23),  
(102, 'ankit', 23, 'IT', 703000.63),  
(103, 'sumitha', 28, 'Finance', 650100.36),  
(104, 'sailen', 35, 'Marketing', 600020.36),  
(105, 'mina', 26, 'IT', 720020.00);  

SELECT * FROM emp1;


SELECT eid, name, age, dept, Salary FROM emp1;

#---------------------------------------------------------

UPDATE emp1 
SET Salary = 60000.2;

SELECT  eid, name, age, dept, Salary FROM emp1;

UPDATE emp1 
SET Salary = 70000.23 
WHERE eid = 101;

SELECT  eid, name, age, dept, Salary FROM emp1;

#---------------------------------------------------------

SELECT * FROM emp1 
WHERE dept = 'Finance';


#---------------------------------------------------------
DELETE FROM emp1;
#---------------------------------------------------------

DELETE FROM emp1 
WHERE eid = 102;
#---------------------------------------------------------

TRUNCATE TABLE 	emp1;

#------------------------------------------------------------------
#DATE: 6th Feb 2025 
#------------------------------------------------------------------
SELECT * FROM emp1;
#----------NOT NULL
CREATE TABLE const1 (
    eid INT NOT NULL ,
    name VARCHAR(20),
    age INT
   
);

INSERT INTO const1 (eid, name, age)  
VALUES  
(101, 'muktha', 23),  
(102, 'java', 23),  
(103, 'mina', 28);

SELECT eid,age FROM const1;
#----------UNIQUE
CREATE TABLE const2 (
    cid INT UNIQUE,
    fullname VARCHAR(20),
    salary FLOAT
   
);

INSERT INTO const2 (cid, fullname, salary)  
VALUES  
(103, 'muktha', 37673.8),  
(104, 'cinema', 7367.3),  
(105, 'hina', 3453.6);

SELECT * FROM const2;

#----------PRIMARY KEY 
CREATE TABLE const3 (
    pid INT PRIMARY KEY ,
    name VARCHAR(10)
);

INSERT INTO const3 (pid, name)  
VALUES  
(103, 'muktha'),  
(104, 'cinema'),  
(105, 'hina');

SELECT * FROM const3;
#----------FOREIGN  KEY 

CREATE TABLE const4 (
    pid INT, 
    full_name VARCHAR(20),
    FOREIGN KEY (pid) REFERENCES const3(pid) 
);

INSERT INTO const4 (pid, full_name)  
VALUES  
(103, 'mukthaghosh'),  
(104, 'hinakhan');

SELECT * FROM const4;


#----------check 

CREATE TABLE const5 (
    id INT UNIQUE,
    name VARCHAR(20),
    salary INT CHECK(salary>10000)
   
);

INSERT INTO const5 (id, name, salary)  
VALUES  
(111, 'qwrtt', 37672),  
(113, 'dbndn', 15000), 
(125, 'jhdcj', 32453);

SELECT * FROM const5;
#----------default


CREATE TABLE const6 (
    id INT UNIQUE,
    name VARCHAR(20),
    salary INT DEFAULT 350000
   
);

INSERT INTO const6 (id, name)  
VALUES  
(103, 'muktha'),  
(104, 'cinema'),  
(105, 'hina');

SELECT * FROM const6;


DROP TABLE const5;


#----------------------------------------------------------------------------------------------------------------------------------------
# HAVING, GROUPY, DISTINCT, LIMIT /////////////// DATE 10/02/2025
#----------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE table6 (
    id INT UNIQUE,
    name VARCHAR(20),
    salary INT, 
    age INT
   
);
INSERT INTO  table6(id,name,salary,age) VALUES 
(101,'muktha',150000,15),
(102,'kudu',23000,21),
(103,'ankit',458888,34),
(104,'payal',327273,20),
(105,'sumitha',23524,57),
(106,'sailen',37367,68),
(107,'pandey',23524,38),
(108,'payal',23524,42),
(109,'shreya',23000,57);


SELECT * FROM table6;


#-----------------------//////ORDER BY ////////
--------------------------------------------------------------------
SELECT * FROM table6 ORDER BY salary ASC;
# we are using multiple column 

SELECT name, age FROM table6 ORDER BY age ASC;

#AGGREGATE FUNCTIONS 
SELECT MIN(salary) AS minimum_salary from table6;
SELECT MAX(salary) AS maximum_salary from table6;
SELECT AVG(salary) AS average_salary from table6;
SELECT SUM(salary) AS total_salary from table6;
SELECT COUNT (salary) AS total_empolyee from table6;


#GROUP BY CLAUSE
SELECT salary, COUNT(name) FROM table6 GROUP BY salary;

#using multiple column
SELECT salary,age, COUNT(name) FROM table6 GROUP BY salary,age;

# HAVING CLAUSE

SELECT salary , COUNT(name) FROM table6 GROUP BY salary HAVING salary>=20000;

SELECT name, MAX(salary) FROM table6 GROUP BY salary, name HAVING salary>=1000;


#DISTINCT

SELECT DISTINCT * FROM table6;

# LIMIT
SELECT * FROM table6 LIMIT 2;
SELECT  name,salary FROM table6 LIMIT 2,1;

SELECT * FROM table6 ORDER BY salary DESC LIMIT 3,1;



#----------------------------------------------------------------------------------------------------------------------------------------
#JOINS LIVETECH JAVA FULL STACK -DATE : 11/02/2025
#----------------------------------------------------------------------------------------------------------------------------------------

#Joins allows us to retrive the data from two or more related tables
# TYPES OF JOINS 
CREATE TABLE student3 ( id INT PRIMARY KEY,
name VARCHAR(20)
);

CREATE TABLE course1 ( student_id INT PRIMARY KEY,
course VARCHAR(20)
);

INSERT INTO student3(id,name) VALUES
(101,"muktha"),
(102,"ankit"),
(103,"sailen"),
(104,"sumitha"),
(105,"payal");

INSERT INTO course1(student_id,course) VALUES
(104,"science"),
(102,"math"),
(106,"social"),
(103,"commerce"),
(105,"accounts");

SELECT * FROM student3;
SELECT * FROM course1;

#inner joins
SELECT * FROM 
student3 INNER JOIN course1
ON student3.id=course1.student_id;

#outer joins 
#left joins
SELECT * FROM
student3
LEFT JOIN course1
ON student3.id=course1.student_id;

# right join 
SELECT * FROM
student3 
RIGHT JOIN course1
ON student3.id=course1.student_id;

# full join

SELECT * FROM
student3
FULL JOIN course1 ;


#INDEX
CREATE INDEX stu1 on course1(student_id);


# VIEW 
CREATE VIEW student011 AS SELECT  id,name FROM student3;

SELECT * FROM student011;
