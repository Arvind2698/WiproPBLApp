package OOPS.AbstractionAndEncapsulation;

public class HandsOn1 {
    public static void main(String[] args){
        Author author1=new Author("Arvind","arvind@gmail.com",'M');
        Author author2=new Author("Kelvin","kelvin@gmail.com",'M');
        Author author3=new Author("Kate","kate@gmail.com",'F');

        Book book1=new Book("Life and Beyond", author1 , 600 , 10);
        Book book2=new Book("How To Sleep", author2 , 300 , 40);
        Book book3=new Book("What To Eat", author3 , 400 , 20);

        Book[] bookStore={book1,book2,book3};

        for(int i=0;i<3;i++){
            Book b=bookStore[i];
            System.out.println("The Title of the book is: "+b.getName()+"\nThe Author of the Book is:"+b.getAuthorName()+"\nThe Price of the book is: "+b.getPrice()+"\nAvailable quantity is: "+b.getQty());
            if(i==2){

            }else{
                System.out.println("---------------------------------------------");
            }
        }
    }
}

class Author{
    private String name;
    private String email;
    private char gender;

    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public Character getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
}
class Book{
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name,Author author,double price,int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setAuthor(Author author){
        this.author=author;
    }

    public String getAuthorName(){
        return this.author.getName();
    }
    public String getAuthorEmail(){
        return this.author.getEmail();
    }
    public Character getAuthorGender(){
        return this.author.getGender();
    }
}
