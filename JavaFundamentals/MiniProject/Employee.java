package employee;

public class Employee{
    private int empNo;
    private String empName;
    private String DOJ;
    private String department;
    private int basic;
    private int HRA;
    private int IT;
    private DA designationCode;
    private int netSalary;

    public Employee(int empNo,String empName,String DOJ,String department,int basic,int HRA,int IT,DA designationCode){
        this.empNo=empNo;
        this.empName=empName;
        this.DOJ=DOJ;
        this.department=department;
        this.basic=basic;
        this.HRA=HRA;
        this.IT=IT;
        this.designationCode=designationCode;
        this.generateSalary();
    }
    public void generateSalary(){
        this.netSalary= this.basic+this.HRA+this.designationCode.getDAamount()-this.IT;
    }
    public int getEmpNo(){
        return this.empNo;
    }
    public String getEmpName(){
        return this.empName;
    }
    public String getDOJ(){
        return this.DOJ;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getDesignation(){
        return this.designationCode.getDesignation();
    }
    public int getNetSalary(){
        return this.netSalary;
    }
}