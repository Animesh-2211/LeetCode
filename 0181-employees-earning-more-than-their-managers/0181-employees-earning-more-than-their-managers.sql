# Write your MySQL query statement below
Select e.name  As Employee
From Employee e
 JOIN Employee m ON e.managerID=m.id
 WHERE
e.salary>m.salary;