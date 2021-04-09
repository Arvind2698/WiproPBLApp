--Determine the structure of the DEPARTMENTS table and its contents.
DESC departments;

--Create a query to display the last name, job ID, hire date, and employee ID for each employee, with the employee ID appearing first. Provide an alias STARTDATE for the HIRE_DATE column.
SELECT EMPLOYEE_ID,lAST_NAME,JOB_ID,HIRE_DATE AS "STARTDATE" FROM EMPLOYEES;

--Create a query to display all unique job IDs from the EMPLOYEES table.
SELECT DISTINCT JOB_ID FROM EMPLOYEES;

--Create a query to display employee id, last name, job id and hiredate from employee table with more describing column names.  Name the column headings 
--Emp # , Employee , Job and Hire Date respectively
SELECT EMPLOYEE_ID AS "EMP #",lAST_NAME AS "EMPLOYEE",JOB_ID AS "JOB",HIRE_DATE AS "HIRE DATE" FROM EMPLOYEES;

 --Create a report of all employees and their job IDs. Display the last name concatenated with the job ID (separated by a comma and space) and name the column as "Employee and Title"
SELECT LAST_NAME || ' , ' || JOB_ID AS "EMPLOYEE AND TITLE" FROM EMPLOYEES; 