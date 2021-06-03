select * from employee;


select e.empno,
      e.empname,
       t.titleno as title_no, 
       t.titleName as title_name, 
       e.manager as   manager_no,
       m.empname as manager_name,
       e.salary,
       d.deptNo,
       d.deptName,
       d.floor
from employee e join title t on e.title=t.titleno
left join employee m on e.manager =m.empno 
join department d on e.dept = d.deptNo;




select empno, empname, title, manager, salary, dept, hiredate
  from employee
 where empno = 1003;

insert into employee(empno, empname, title, manager, salary, dept)
values (1004, '이나연', 3, 1003, 1000000, 1);

delete from employee
 where empno = 1004;

update employee
   set empname = '이나영', title = 5, manager = 4377, salary=3000000, dept=1
 where empno = 1004;

select * from employee;

select * from title;

select * from department;

select * from manager;
  