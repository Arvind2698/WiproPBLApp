package JavaFundamentals.MiniProject;

public class EmployeeInformation {
    public static void main(String[] args){

        DA designationCode1=new DA("e", "Engineer", 20000);
        Employee emp1=new Employee(1001, "Ashish", "01/04/2009", "R&D", 20000, 8000, 3000, designationCode1);

        DA designationCode2=new DA("c", "Consultant", 32000);
        Employee emp2=new Employee(1002, "Sushma", "23/08/2012", "PM", 30000, 12000, 9000, designationCode2);

        DA designationCode3=new DA("k", "Clerk", 12000);
        Employee emp3=new Employee(1003, "Rahul", "12/11/2008", "Acct", 10000, 8000, 1000, designationCode3);

        DA designationCode4=new DA("r", "Receptionist", 15000);
        Employee emp4=new Employee(1004, "Chahat", "29/01/2013", "Front Desk", 12000, 6000, 2000, designationCode4);

        DA designationCode5=new DA("m", "Manager", 40000);
        Employee emp5=new Employee(1005, "Ranjan", "16/07/2005", "Egg", 50000, 20000, 20000, designationCode5);

        DA designationCode6=new DA("e", "Engineer", 20000);
        Employee emp6=new Employee(1006, "Suman", "01/01/2000", "Manufacturing", 23000, 9000, 4400, designationCode6);

        DA designationCode7=new DA("c", "Consultant", 32000);
        Employee emp7=new Employee(1007, "Tanmay", "12/06/2006", "PM", 29000, 12000, 10000, designationCode7);

        Employee[] empTable={emp1,emp2,emp3,emp4,emp5,emp6,emp7};

        if(args.length!=1){
            System.out.println("Please Enter Valid EMPID for search");
            return;
        }

        int empToSearch=Integer.parseInt(args[0]);
        boolean found=false;

        for(int i=0;i<7;i++){
            Employee emp=empTable[i];
            if(emp.getEmpNo()==empToSearch){
                found=true;
                System.out.println("EmpNo. "+" EmpName "+" Department "+" Designation "+" Salary ");
                System.out.println(emp.getEmpNo()+"     "+emp.getEmpName()+"       "+emp.getDepartment()+"      "+emp.getDesignation()+"        "+emp.getNetSalary());
                break;
            }
        }

        if(!found){
            System.out.println("There is no employee with empid: "+empToSearch);
        }
    }
}

class Employee{
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

class DA{
    private String DAcode;
    private String designation;
    private int DAamount;
    public DA(String DAcode,String designation,int DAamount){
        this.DAamount=DAamount;
        this.DAcode=DAcode;
        this.designation=designation;
    }
    public String getDAcode(){
        return this.DAcode;
    }
    public String getDesignation(){
        return this.designation;
    }
    public int getDAamount(){
        return this.DAamount;
    }
}