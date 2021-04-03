package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HandsOn2 {
    public static void main(String[] arg){


        HashSet<Employee> set=new HashSet<>();
        set.add(new Employee(1, "Arvind", "r.arvind007@gmail.com", "male", 20000));
        set.add(new Employee(2, "Kelvin", "kelvin@gmail.com", "male", 10000));
        set.add(new Employee(3, "Melvin", "melvin@gmail.com", "male", 25000));
        set.add(new Employee(4, "Felix", "felix@gmail.com", "male", 60000));

        Iterator<Employee> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getEmployee());
        }
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

    // public int getEmpId(){
    //     return this.empId;
    // }

    public String getEmployee(){
        return("Employee Name: "+this.empName+"\nEmployee Gender: "+this.gender+"\nEmployee Id: "+this.empId+"\nEmployee Salary: "+this.salary+"\nEmployee Email: "+this.empEmail);
    }
}