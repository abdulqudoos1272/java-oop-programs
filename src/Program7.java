import java.util.Scanner;

interface A{
    static int b=10;
    public 
    abstract void get();
};
interface B{
    static int c=10;
    static int d=20;
    abstract void show();
};
class C implements A,B{
    private int a;
    private Scanner sc=new Scanner(System.in);
    public void get(){
        System.out.println("Enter Value of a : ");
        this.a=sc.nextInt();
    }
    public void  show(){
        System.out.println("Sum of a,b,c, and d is : "+(this.a+A.b+B.c+B.d));
    }
};
public class Program7 {
    public static void main(String[] args){
        C c1=new C();
        c1.get();
        c1.show();
    }    
};
