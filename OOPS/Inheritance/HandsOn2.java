package OOPS.Inheritance;

import java.util.Scanner;

public class HandsOn2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee name");
        String name=sc.next();
        System.out.println("Enter the Employee salary");
        double salary=sc.nextDouble();
        System.out.println("Enter the Employee date of joining");
        String DOJ=sc.next();
        System.out.println("Enter the Employee insurance number");
        String insurance=sc.next();

        Employee emp=new Employee(salary, DOJ, insurance, name);
        System.out.println("Employee Name: "+emp.getName()+"\nEmployee Salary: "+emp.getSalary()+"\nEmployee DOJ: "+emp.getDOJ()+"\nEmployee Insurance Number: "+emp.getInsurance());

        sc.close();
    }
}

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class Employee extends Person{
    private double salary;
    private String DOJ;
    private String insurance;

    public Employee(double salary,String DOJ,String insurance,String name){
        super(name);
        this.salary=salary;
        this.DOJ=DOJ;
        this.insurance=insurance;
    }

    public String getDOJ(){
        return this.DOJ;
    }
    public void setDOJ(String DOJ){
        this.DOJ=DOJ;
    }

    public String getInsurance(){
        return this.insurance;
    }
    public void setInsurance(String insurance){
        this.insurance=insurance;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}