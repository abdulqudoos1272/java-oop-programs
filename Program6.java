import java.util.Scanner;
abstract class Animal{
    protected Scanner sc=new Scanner(System.in);
    protected int leg,eye;
    protected String name,food;
    Animal(){
        System.out.println("Constructior of an Abstract class");
    }
    abstract public void get();
    abstract public void display();
};
class Hen extends Animal{
    public void get(){
        System.out.println("Enter Name of Animal");
        this.name=sc.nextLine();
        System.out.println("Enter Favaurite food");
        this.food=sc.nextLine();
        System.out.println("Enter Numbers of eye");
        this.eye=sc.nextInt();
        System.out.println("Enter Numbers of Leg");
        this.leg=sc.nextInt();
    }
    public void display(){
        System.out.println("Name of Animal is : "+this.name);
        System.out.println("Favaurite food is : "+this.food);
        System.out.println("Numbers of eye are : "+this.eye);
        System.out.println("Numbers of Leg are : "+this.leg);

    }    
};
public class Program6 {;
    public static void main(String[] args){
        Hen h1=new Hen();
        h1.get();
        h1.display();
    }    
};
