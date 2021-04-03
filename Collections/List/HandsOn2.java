package Collections.List;

import java.util.ArrayList;

public class HandsOn2 {
    public static void main(String[] arg){
        EmployeeDB empDB=new EmployeeDB();

        empDB.AddEmployee(new Employee(1, "Arvind", "r.arvind007@gmail.com", "male", 20000));
        empDB.AddEmployee(new Employee(2, "Kelvin", "kelvin@gmail.com", "male", 10000));
        empDB.AddEmployee(new Employee(3, "Melvin", "melvin@gmail.com", "male", 25000));
        empDB.AddEmployee(new Employee(4, "Felix", "felix@gmail.com", "male", 60000));

        System.out.println(empDB.DeleteEmployee(2));
        System.out.println(empDB.DeleteEmployee(9));

        System.out.println(empDB.showPayList(2));
        System.out.println(empDB.showPayList(3));
        System.out.println(empDB.showPayList(9));
    }
}

class Employee{
    private int empId;
    private String empName;
    private String empEmail;
    private String gender;
    private float salary;

    Employee(int empId,String empName,String empEmail,String gender,float salary){
        this.empId=empId;
        this.empName=empName;
        this.empEmail=empEmail;
        this.gender=gender;
        this.salary=salary;
    }

    public int getEmpId(){
        return this.empId;
    }

    public String getEmployee(){
        return("Employee Name: "+this.empName+"\nEmployee Id: "+this.empId+"\nEmployee Salary: "+this.salary);
    }
}

class EmployeeDB{
    ArrayList<Employee> employeeCollection=new ArrayList<>();

    public boolean AddEmployee(Employee e){
        try{
            employeeCollection.add(e);
            return true;
        }catch(Exception exception){
            return false;
        }
    }

    public boolean DeleteEmployee(int empId){
        try{
            for(int i=0;i<employeeCollection.size();i++){
                Employee e=employeeCollection.get(i);
                if(e.getEmpId()==empId){
                    employeeCollection.remove(i);
                    return true;
                }
            }
        }catch(Exception exception){
            return false;
        }

        return false;
    }

    public String showPayList(int empId){
        for(int i=0;i<employeeCollection.size();i++){
            Employee e=employeeCollection.get(i);
            if(e.getEmpId()==empId){
                return e.getEmployee();
            }
        }

        return "Employee not found";
    }
}

