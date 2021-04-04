package EmployeeManagementSystem;

public class Employee{
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private String address;
    private long empMobile;

    Employee(String empFirstName,String empLastName,String empEmail,String address,long empMobile){
        this.empFirstName=empFirstName;
        this.empLastName=empLastName;
        this.empEmail=empEmail;
        this.address=address;
        this.empMobile=empMobile;
    }

    public String getEmpFirstName(){
        return this.empFirstName;
    }
    public String getEmpLastName(){
        return this.empLastName;
    }
    public String getEmail(){
        return this.empEmail;
    }
    public String getAddress(){
        return this.address;
    }
    public long getEmpMobile(){
        return this.empMobile;
    }
}