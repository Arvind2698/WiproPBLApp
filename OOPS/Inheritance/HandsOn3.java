package OOPS.Inheritance;

import java.util.Scanner;

public class HandsOn3 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Creating a college student...");
        System.out.println("Enter student name");
        String studentName=sc.next();
        System.out.println("Enter student DOB");
        String studentDOB=sc.next();
        System.out.println("Enter student ID");
        int studentId=sc.nextInt();
        System.out.println("Enter student's college name");
        String collegeName=sc.next();
        System.out.println("Enter student's current year");
        String currentYear=sc.next();

        CollegeStudent stu=new CollegeStudent(collegeName, currentYear, studentName, studentDOB, studentId);

        System.out.println("Student Details: ");
        System.out.println("Student Name: "+stu.getName()+"\nStudent DOB: "+stu.getDOB()+"\nStudent ID: "+stu.getStudentId()+"\nStudent College: "+stu.getCollegeName()+"\nStudent Year Of Study: "+stu.getCurrentYear());

        sc.close();
    }
}

class PersonClass{
    private String name;
    private String DOB;

    public PersonClass(String name,String DOB){
        this.name=name;
        this.DOB=DOB;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
    }
    public String getDOB(){
        return this.DOB;
    }
}

class Teacher extends PersonClass{
    private double salary;
    private String subject;

    Teacher(double salary,String subject,String name,String DOB){
        super(name, DOB);
        this.salary=salary;
        this.subject=subject;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
}

class Student extends PersonClass{
    private int studentId;

    public Student(String name,String DOB,int studentId){
        super(name, DOB);
        this.studentId=studentId;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public int getStudentId(){
        return this.studentId;
    }
}

class CollegeStudent extends Student{
    private String collegeName;
    private String currentYear;

    public CollegeStudent(String collegeName,String currentYear,String name,String DOB,int studentId){
        super(name, DOB, studentId);
        this.collegeName=collegeName;
        this.currentYear=currentYear;
    }

    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
    public void setCurrentYear(String currentYear){
        this.currentYear=currentYear;
    }
    public String getCurrentYear(){
        return this.currentYear;
    }
}