--Create a report that displays the last name and salary of employees who earn more than $12,000.
SELECT LAST_NAME , SALARY 
FROM EMPLOYEES 
WHERE SALARY > 12000;

--Create a report that displays the last name and department number for employee number 176.
SELECT LAST_NAME,DEPARTMENT_ID 
FROM EMPLOYEES 
WHERE EMPLOYEE_ID=179;

-- To find high-salary and low-salary employees. Create a query to display the last name and salary for any employee whose salary is not in the range of $5,000 to $12,000
SELECT LAST_NAME,SALARY 
FROM EMPLOYEES 
WHERE SALARY NOT BETWEEN 5000 AND 12000;

--Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. Order the query in ascending order by the hire date.
SELECT LAST_NAME,JOB_ID,HIRE_DATE 
FROM EMPLOYEES 
WHERE LAST_NAME IN ('Matos' , 'Taylor')
ORDER BY HIRE_DATE ASC;

-- Display the last name and department ID of all employees in departments 20 or 50 in ascending alphabetical order by name.
SELECT LAST_NAME,DEPARTMENT_ID 
FROM EMPLOYEES 
WHERE DEPARTMENT_ID=20 OR DEPARTMENT_ID=50
ORDER BY LAST_NAME ASC;

-- List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
--Employee and Monthly Salary, respectively.
SELECT LAST_NAME AS "EMPLOYEE", SALARY AS "MONTHLY SALARY" 
FROM EMPLOYEES
WHERE SALARY BETWEEN 5000 AND 12000 
AND DEPARTMENT_ID=20 OR DEPARTMENT_ID=50;

-- Create a report that displays the last name and hire date for all employees who were hired in 1994.
SELECT LAST_NAME,HIRE_DATE 
FROM EMPLOYEES 
WHERE HIRE_DATE LIKE '%94'

-- Create a report to display the last name and job title of all employees who do not have a manager.
SELECT LAST_NAME,JOB_ID 
FROM EMPLOYEES 
WHERE MANAGER_ID IS NULL;

-- Create a report to display the last name, salary, and commission of all employees who earn commissions. 
--Sort data in descending order based on salary and commissions. Use the column’s numeric position in the ORDER BY clause.
SELECT LAST_NAME,SALARY,COMMISSION_PCT 
FROM EMPLOYEES 
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY 2 DESC,3 DESC;

-- Create a report that displays the last name and salary of employees who earn more than an amount that the user specifies after a prompt. 
--If you enter 12000, it should display all employees earning more than 12000.
--Eg: Salary_value: 12000
SELECT LAST_NAME,SALARY 
FROM EMPLOYEES 
WHERE SALARY > &SALARY;

--Create a query that prompts the user for a manager ID and generates the employee ID, last name, salary and department for that manager’s employees and
--prompts a column name by which result should be sorted.
SELECT EMPLOYEE_ID,LAST_NAME,SALARY,DEPARTMENT_ID 
FROM EMPLOYEES 
WHERE MANAGER_ID = &MANAGER_ID
ORDER BY EMPLOYEE_ID;

-- Display all employee last names in which the third letter of the name is “a”
SELECT LAST_NAME 
FROM EMPLOYEES 
WHERE LAST_NAME LIKE '__a%';

-- Display the last names of all employees who have both an “a” and an “e” in their last name.
SELECT LAST_NAME 
FROM EMPLOYEES 
WHERE LAST_NAME LIKE '%a%' AND LAST_NAME LIKE '%e%'; 

--Display the last name, job, and salary for all employees whose jobs are either those of a sales representative or of a stock clerk, and whose salaries are not equal to $2,500, $3,500, or $7,000.
SELECT LAST_NAME,JOB_ID,SALARY 
FROM EMPLOYEES 
WHERE JOB_ID IN ('ST_CLERK','SA_REP') AND SALARY NOT IN (2500,3500,7000);