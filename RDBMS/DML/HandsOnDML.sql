CREATE TABLE MY_EMPLOYEE
AS
SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY
FROM EMPLOYEES
WHERE 1=2;

-- Test the table creation by viewing the structure using describe command
DESC MY_EMPLOYEE;

--INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('201','MICHAEL','HARTSTEIN','20','13000');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('201','MICHAEL','HARTSTEIN','20','13000');

SELECT * FROM MY_EMPLOYEE;

--Insert one record without listing the column names in the insert statement where salary value remain undetermined. Check whether data is inserted
INSERT INTO MY_EMPLOYEE VALUES ('202','PAT','FAY',20,NULL);

--Insert one record with listing the column names avoiding salary column in the insert statement where salary value remain undetermined. Check whether data is inserted
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID) VALUES ('203','SUSAN','MARVIS','40');

-- Use the above Script to insert the below given records
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('205','SHELLEY','HIGGINS','110','12000');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('100','STEVEN','KING','90','24000');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('101','NEENA','KOCHHAR','90','17000');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('102','LEX DE','HAAN','90','17000');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('111','ISMAEL','SCIARRA','100','7700');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('112','JOSE MANNUEL','URMAN','100','7800');
INSERT INTO MY_EMPLOYEE (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,DEPARTMENT_ID,SALARY) VALUES ('204','HERMANN','BAER','70','10000');

SELECT * FROM MY_EMPLOYEE;

--Create a query to increase salary by 10% for all employees in dept 90
UPDATE MY_EMPLOYEE SET SALARY=0.1*SALARY+SALARY 
WHERE DEPARTMENT_ID=90;

--Create a query to update Last_name of emp 202 to Higgins.
UPDATE MY_EMPLOYEE SET LAST_NAME='HIGGINS'
WHERE EMPLOYEE_ID=202;

--Delete employees whose name either first or last name has char seq of �man�
DELETE FROM MY_EMPLOYEE
WHERE FIRST_NAME LIKE '%MAN%' OR LAST_NAME LIKE '%MAN%';