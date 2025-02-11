CREATE DATABASE Assigment1;
use Assigment1;

CREATE TABLE students( rollno INT PRIMARY KEY , 
fullname VARCHAR(50),
marks INT NOT NULL,
grade VARCHAR(2),
city VARCHAR(20)
);

INSERT INTO students(rollno,fullname,marks,grade,city) 
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
SELECT * FROM students;
SELECT city FROM students; #-> it will print all the city 
SELECT DISTINCT city FROM students; #-> it will print city without repetition 

#clauses(condition)
SELECT fullname,marks FROM students
WHERE marks>=30;

#AND
 SELECT * FROM students
 WHERE marks>=25 AND city="goa";
 
#OR (atleast 1 condition staisfy hua toh it will print the value)
 SELECT * FROM students
 WHERE marks>=25 OR city="pune";
 
#BETWEEN
 SELECT * FROM students
 WHERE marks BETWEEN 40  AND 50;
#IN
 SELECT * FROM students
 WHERE city IN ("pune","delhi");
#NOT IN
 SELECT * FROM students
 WHERE city NOT IN ("pune","delhi");
 
 
 #LIMIT
  SELECT * FROM students LIMIT 5;
  
   #LIMIT with WHERE clause
  SELECT * FROM students WHERE marks>50 LIMIT 5;
  
  
  #ORDER BY 
  SELECT * FROM students
  ORDER BY marks ASC; 
  
  
  
  