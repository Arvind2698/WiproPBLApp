package WrapperClass;

public class HandsOn4 {
   public static void main(String[] arg) throws CloneNotSupportedException{
        Employee e=new Employee(1001, "Arvind", 1000);

        Employee eClone=e.clone();

        eClone.setEmpId(1002);
        eClone.setEmpName("Kelvin");
        eClone.setSalary(2000);

        e.display();

        eClone.display();

        e.display();
   }
}

class Employee implements Cloneable{

    private int empId;
    private String empName;
    private int salary;

    public Employee clone() throws CloneNotSupportedException{
        Employee c= (Employee) super.clone();
        return c;
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    Employee(int empId,String empName,int salary){
        this.empId=empId;
        this.salary=salary;
        this.empName=empName;
    }

    public void display(){
        System.out.println("Employee Name: "+this.empName+"\nEmployee ID: "+this.empId+"\nEmployee salary: "+this.salary);
    }
}