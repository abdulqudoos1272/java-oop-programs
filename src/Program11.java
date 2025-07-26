import java.util.*;
class Attributes{
    protected Scanner sc=new Scanner(System.in);
    protected String car_com;
    protected String car_name;
    protected int wheels,seats,model;
};
class Car extends Attributes{   //Association represent a relationship betwween clases
    public void get(){
        System.out.println("Enter Name of Car Company");
        this.car_com=sc.nextLine();
        System.out.println("Enter Car Name");
        this.car_name=sc.nextLine();
        System.out.println("How much wheels of car");
        this.wheels=sc.nextInt();
        System.out.println("How much Seats of car");
        this.seats=sc.nextInt();
        System.out.println("Enter Model of Car");
        this.model=sc.nextInt();
    }
    public void show(){
        System.out.println("Car Company : "+this.car_com);
        System.out.println("Car Name : "+this.car_name);
        System.out.println("Number of wheels : "+this.wheels);
        System.out.println("Number of Seats : "+this.seats);
        System.out.println("Car Model Number : "+this.model);
    }
};
public class Program11 {
    public static void main(String[] args){
        Car c1=new Car();
        c1.get();
        c1.show();
    }  
};
