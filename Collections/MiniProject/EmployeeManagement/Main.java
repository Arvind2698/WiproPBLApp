package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import EmployeeManagementSystem.Employee;

;

public class Main {
    public static void main(String[] arg){
        ArrayList<Employee> EmployeeDB=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter the number of employees you want to add");
            int num=sc.nextInt();
            for(int i=0;i<num;i++){
                System.out.println("Enter employee "+i+" details");
                System.out.println("Enter employee first name: ");
                String firstName=sc.next();
                System.out.println("Enter employee last name: ");
                String lastName=sc.next();
                System.out.println("Enter employee mobile number: ");
                long number=sc.nextLong();
                System.out.println("Enter employee email: ");
                String email=sc.next();
                System.out.println("Enter employee address: ");
                String address=sc.next();
                Employee e=new Employee(firstName, lastName, email, address , number);
                EmployeeDB.add(e);
            }
        }catch(Exception e){
            System.out.println("Error with the input please try again");
        }

        Collections.sort(EmployeeDB,new EmployeeManagementSystem.CompareClass());

        System.out.format("%-15s %-15s %-15s %-30s %-15s\n" ,"Firstname" ,"Lastname" ,"Mobile" ,"Email" ,"Address" );

        for(int i=0;i<EmployeeDB.size();i++){
            Employee e=EmployeeDB.get(i);
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n" ,e.getEmpFirstName() ,e.getEmpLastName() ,e.getEmpMobile(),e.getEmail() , e.getEmail() );
        }

    }
}

class CompareClass implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        if(o1.getEmpFirstName().compareTo(o2.getEmpFirstName()) > 0 ){
            return 1;
        }else{
            return -1;
        }
        // return 0;
    }
}
