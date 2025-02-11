CREATE DATABASE day2;
use day2;

#------------------------------------------------------------------------------------------------------------------------------

# Generally we know that the caluse are many types but 
# main caluse which is used in advanced SQL problems
# ORDERBY, GROUPBY

#------------------------------------------------------------------------------------------------------------------------------




CREATE TABLE studentinfo( rollno INT PRIMARY KEY , 
fullname VARCHAR(50),
marks INT NOT NULL,
grade VARCHAR(2),
city VARCHAR(20)
);

# ALTER (CREATING A NEW COLUMN)

ALTER TABLE studentinfo ADD COLUMN code VARCHAR(8);

INSERT INTO studentinfo(rollno,fullname,marks,grade,city) 
VALUES
(101,"muktha",56,'A','hyderabad'),
(102,"ankit",45,'A','Pune'),
(103,"mina",32,'A','Mumbai'),
(104,"shina",11,'A','delhi'),
(105,"hina",45,'A','goa'),
(106,"nina",43,'A','chennai'),
(107,"sailen",78,'A','hyderabad'),
(108,"sumitha",87,'b','Pune'),
(109,"reeta",67,'c','Mumbai'),
(110,"ankitha",43,'F','delhi'),
(111,"payal",56,'C','goa'),
(112,"neha",77,'B','chennai');

# Select 
SELECT * FROM studentinfo;

#ORDER BY  ASCENDING
  SELECT * FROM studentinfo
  ORDER BY marks ASC; 
  
  
#ORDER BY  DESCENDING
  SELECT * FROM studentinfo
  ORDER BY marks DESC LIMIT 3; 
  
  
    SELECT * FROM studentinfo
  ORDER BY marks; 
  #AS CLAUSE
  
  SELECT rollno AS "idno" ,marks as "score" from studentinfo;
  
  
  #IS NULL
  SELECT * FROM studentinfo WHERE grade IS  NULL;
  
  #IS NOT NULL
  SELECT * FROM studentinfo WHERE grade IS NOT NULL;
  
  #GROUP BY
  
  SELECT grade, COUNT(fullname)
  FROM studentinfo
  GROUP BY grade
  ORDER BY grade;
  
  #HAVING
  
SELECT city, COUNT(rollno)
FROM studentinfo
  GROUP BY city
HAVING MAX(marks)>20;
  
  #-----------------------------------------------------------------------------------------------------------------
  
  CREATE TABLE studentname( firstname VARCHAR(20),
  lastname VARCHAR(20)
);

INSERT INTO studentname(firstname,lastname) 
VALUES
('muktha','ghosh'),
('ankit','pandey'),
('payal','samanta'),
('neha','reddy'),
('reeta','pandey');


SELECT * FROM studentname;

SELECT firstname,lastname FROM studentname ORDER BY lastname,firstname ;
  
#---------------------------------------------------------------------------------------------------------
# AGGREGATE FUNCTIONS
SELECT MAX(marks) FROM studentinfo;
SELECT MIN(marks) FROM studentinfo;
SELECT AVG(marks) FROM studentinfo;
SELECT COUNT(marks) FROM studentinfo;

#---------------------------------------------------------------------------------------------------------
#GROUP BY
SELECT city, COUNT(fullname) FROM studentinfo GROUP BY city;
# multiple 
SELECT city,grade, COUNT(fullname) FROM studentinfo GROUP BY city,grade;

#---------------------------------------------------------------------------------------------------------
# write a query to find avg marks in each cuty in ascending order
SELECT city, AVG(marks)
FROM studentinfo
GROUP BY city
ORDER BY AVG(marks)DESC;


#---------------------------------------------------------------------------------------------------------
# let's have a combine look

SELECT city
FROM  studentinfo
WHERE grade="A"
GROUP BY city
HAVING Max(marks) >=20
ORDER BY city DESC;


 #---------------------------------------------------------------------------------------------------------
 # ASSIGNMENT 
 
 
CREATE TABLE studentass( customer_id INT PRIMARY KEY,
customer VARCHAR(30), 
mode VARCHAR(40), 
city VARCHAR(25)
 );
  
INSERT INTO studentass (customer_id, customer, mode, city) VALUES
(101, 'Olivia Barrett', 'Netbanking', 'Portland'),
(102, 'Ethan Sinclair', 'Credit Card', 'Miami'),
(103, 'Maya Hernandez', 'Credit Card', 'Seattle'),
(104, 'Liam Donovan', 'Netbanking', 'Denver'),
(105, 'Sophia Nguyen', 'Credit Card', 'New Orleans'),
(106, 'Caleb Foster', 'Debit Card', 'Minneapolis'),
(107, 'Ava Patel', 'Debit Card', 'Phoenix'),
(108, 'Lucas Carter', 'Netbanking', 'Boston'),
(109, 'Isabella Martinez', 'Netbanking', 'Nashville'),
(110, 'Jackson Brooks', 'Credit Card', 'Boston');


SELECT * FROM studentass;


SELECT mode , COUNT(customer)
FROM studentass
GROUP BY mode ;
 
 SET SQL_SAFE_UPDATES=0;
 
 UPDATE studentass 
 SET city="London" 
 WHERE city="Boston";

SELECT * FROM studentass;

SET SQL_SAFE_UPDATES=1;






CREATE TABLE dept (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE teacher (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES dept(id)
);

  