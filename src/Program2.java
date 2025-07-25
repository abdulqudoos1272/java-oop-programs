class Polymor{
    Polymor(){
        System.out.println("WELCOME");
    }
    public void display(String a){
        System.out.println("My Name is : "+a);
    }
    public void display(int a){
        System.out.println("My Age is : "+a);
    }
    public void display(float a){
        System.out.println("My Current CGPA is : "+a);
    }
};
public class Program2 {
    public static void main(String []args){
        Polymor p1=new Polymor();
        p1.display("Abdul Qudoos");
        p1.display(22);
        p1.display(3.25f);
    }
};