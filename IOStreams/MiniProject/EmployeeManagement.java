package EmployeeManagementSystem;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import EmployeeManagementSystem.Employee;

public class EmployeeManagement {
    public static void main(String[] arg) throws Exception{

        FileOutputStream fos=new FileOutputStream("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\MiniProject\\Data\\EmployeeInformation.txt");
        ObjectOutputStream obs=new ObjectOutputStream(fos);

        FileInputStream fis=new FileInputStream("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\MiniProject\\Data\\EmployeeInformation.txt");
        ObjectInputStream obi=new ObjectInputStream(fis);

        Scanner sc=new Scanner(System.in);
        int option=0;

        while(option != -1){
            System.out.println("Main Menu");
            System.out.println("1. Add Employee\n2. Display All\n3. Exit");
            option=sc.nextInt();

            switch(option){
                case 1:
                    try{
                        System.out.println("Enter Employee Id");
                        int Id=sc.nextInt();
                        System.out.println("Enter Employee Name");
                        String name=sc.next();
                        System.out.println("Enter Employee Age");
                        int age=sc.nextInt();
                        System.out.println("Enter Employee Salary");
                        double salary=sc.nextDouble();

                        Employee emp=new Employee(name, Id, age, salary);
                        obs.writeObject(emp);

                        System.out.println("Employee Added Successfully");
                    }catch(InputMismatchException e){
                        System.out.println("Input format error...");
                    }
                    break;
                case 2:
                    Employee empR=null;
                    try{
                        empR=(Employee)obi.readObject();
                    }catch(EOFException e){
                        System.out.println("Employee Information File is Empty");
                        break;
                    }

                    try{
                        while(true){
                            System.out.println(empR.getId()+" "+empR.getName()+" "+empR.getAge()+" "+empR.getSalary());
                            empR=(Employee)obi.readObject();
                        }
                    }catch(Exception e){
                        System.out.println(e);
                    }
                case 3:
                    option=-1;
                    System.out.println("Thankyou for using the Employee management system!!!!!");
                    break;
                default:
                    System.out.println("Please Select a Correct Option");
            }
        }

    }
}
