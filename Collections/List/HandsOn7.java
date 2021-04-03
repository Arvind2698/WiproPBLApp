package Collections.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class HandsOn7 {
    public static void main(String[] arg){
       Vector<EmployeeVector> vector=new Vector<>();

       vector.add(new EmployeeVector(1, "Arvind", "r.arvind007@gmail.com", "male", 20000));
       vector.add(new EmployeeVector(2, "Kelvin", "kelvin@gmail.com", "male", 10000));
       vector.add(new EmployeeVector(3, "Melvin", "melvin@gmail.com", "male", 25000));
       vector.add(new EmployeeVector(4, "Felix", "felix@gmail.com", "male", 60000));

       Iterator<EmployeeVector> itr=vector.iterator();

       while(itr.hasNext()){
           System.out.println(itr.next().getEmployee());
       }

       Enumeration<EmployeeVector> e=Collections.enumeration(vector);

       while(e.hasMoreElements()){
           System.out.println(e.nextElement().getEmployee());
       }
    }
}

class EmployeeVector{
    private int empId;
    private String empName;
    private String empEmail;
    private String gender;
    private float salary;

    EmployeeVector(int empId,String empName,String empEmail,String gender,float salary){
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