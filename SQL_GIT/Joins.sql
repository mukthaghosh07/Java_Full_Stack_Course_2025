CREATE DATABASE Joins;
use Joins;

CREATE TABLE student2 ( id INT PRIMARY KEY,
name VARCHAR(20)
);

CREATE TABLE course ( student_id INT PRIMARY KEY,
course VARCHAR(20)
);

INSERT INTO student2(id,name) VALUES
(101,"muktha"),
(102,"ankit"),
(103,"sailen"),
(104,"sumitha"),
(105,"payal");

INSERT INTO course(student_id,course) VALUES
(104,"science"),
(102,"math"),
(106,"social"),
(103,"commerce"),
(105,"accounts");

SELECT * FROM student2;
SELECT * FROM course;

#inner joins
SELECT * FROM 
student2 INNER JOIN course
ON student2.id=course.student_id;

#outer joins 
#left joins
SELECT * FROM
student2 as s
LEFT JOIN course as c
ON s.id=c.student_id;

# right join 
SELECT * FROM
student2 as s
RIGHT JOIN course as c
ON s.id=c.student_id;

# full join
SELECT * FROM 
student2 as s
LEFT JOIN course as c
ON s.id=c.student_id
UNION
SELECT * FROM 
student2 as s
RIGHT JOIN course as c
ON s.id=c.student_id;















