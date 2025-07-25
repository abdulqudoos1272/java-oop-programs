class A{
    public String pub="Public Variable is accessible inside and outside class";
    protected String pro="Protected Variable is only accessible in inherent classes";
    private String pri="Public Variable is only accessible by class that define";
    public void display(){
        System.out.println(pri);
    }
};
class B extends A{
    public void display1(){
        System.out.println(pro);
    }
}
public class Program9 {
    public static void main(String[] args){
        B b1=new B();
        System.out.println(b1.pub);
        b1.display1();
        b1.display();
    }    
};
