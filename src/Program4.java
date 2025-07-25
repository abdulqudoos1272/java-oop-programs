import java.util.Scanner;
class A{
    protected Scanner sc = new Scanner(System.in);
    protected float a;
    public A(){
        System.out.println("                     CONSTRUCTORS");
        System.out.println("I am a Consructor of Class A");
    }
    public void get1(){
        System.out.println("Enter value of  a : ");
        this.a=sc.nextFloat();
    }
};
class B extends A {
    protected float b;
    public B(){
        System.out.println("I am a Consructor of Class B");
    }
    public void get2(){
        System.out.println("Enter value of  b : ");
        this.b=sc.nextFloat();
    } 
};
class C extends B {
    protected float c;
    public C(){
        System.out.println("I am a Consructor of Class C");
    }
    public void get3(){
        System.out.println("Enter value of  c : ");
        this.c=sc.nextFloat();
    }
};
class D extends C {
    protected float d;
    public D(){
        System.out.println("I am a Consructor of Class D");
    }
    public void get4(){
        System.out.println("Enter value of  d : ");
        this.d=sc.nextFloat();
    }
    public void display(){
        System.out.println("Sum of a,b,c, and d is : "+(this.a+this.b+this.c+this.d));
    }
};
public class Program4 {
    public static void main(String[] args) {
        D d1=new D();
        d1.get1();
        d1.get2();
        d1.get3();
        d1.get4();  
        d1.display();
    }   
}
