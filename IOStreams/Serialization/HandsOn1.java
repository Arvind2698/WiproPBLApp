package IOStreams.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class HandsOn1 {
    public static void main(String[] arg) throws IOException, ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name");
        String name=sc.next();
        Date date=new Date();
        System.out.println("Enter employee department");
        String department=sc.next();
        System.out.println("Enter employee designation");
        String designation=sc.next();
        System.out.println("Enter employee salary");
        double salary=sc.nextDouble();

        Employee emp=new Employee(name, date, department, designation, salary);

        FileOutputStream fos=new FileOutputStream("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\serialization.txt");
        ObjectOutputStream obs=new ObjectOutputStream(fos);
        obs.writeObject(emp);

        FileInputStream fis=new FileInputStream("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\serialization.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Employee empR=(Employee)ois.readObject();
        System.out.println("Employee Name: "+empR.getName()+"\nEmployee DOB: "+empR.getDate()+"\nEmployee Department: "+empR.getDepartment()+"\nEmployee Designation: "+empR.getDesignation()+"\nEmployee Salary: "+empR.getSalary());

        ois.close();
        obs.close();
        sc.close();
    }
}

class Employee implements Serializable{
    private String name;
    private Date DOB;
    private String department;
    private String designation;
    private double salary;

    public String getName(){
        return this.name;
    }
    public Date getDate(){
        return this.DOB;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getDesignation(){
        return this.designation;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setDate(Date date){
        this.DOB=date;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public Employee(String name,Date date,String department,String designation,double salary){
        this.name=name;
        this.DOB=date;
        this.department=department;
        this.designation=designation;
        this.salary=salary;
    }
}
