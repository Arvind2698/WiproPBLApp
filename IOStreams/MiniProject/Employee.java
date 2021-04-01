package EmployeeManagementSystem;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable {

    private int Id;
    private String name;
    private int age;
    private double salary;

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.Id;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public Employee(String name,int Id,int age,double salary){
        this.name=name;
        this.Id=Id;
        this.age=age;
        this.salary=salary;
    }

}
