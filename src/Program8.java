import java.util.Scanner;
class A{
    private Scanner sc=new Scanner(System.in);
    static String colg_name="ABC";
    private String name,course;
    private int age;
    public void get(){
        System.out.println("Enter Name : ");
        this.name=sc.nextLine();
        System.out.println("Enter Age : ");
        this.age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course : ");
        this.course=sc.nextLine();
    }
    public void show(){
        System.out.println("College Name is : "+colg_name);
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("COurse : "+this.course);
    }
};
public class Program8{
    public static void main(String[] args){
        A a1=new A();
        A a2=new A();
        A a3=new A();
        a1.get();
        a2.get();
        a3.get();
        a1.show();
        a2.show();
        a3.show();
 
    }
};