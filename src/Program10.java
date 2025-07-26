class A{
    public int a,b;
    public int Sum(){
        return a+b;
    }
};
class B extends A{
    public B(int aa,int bb){ //Override the Function Sum
        this.a=aa;
        this.b=bb;
    }
    public int Sum(){
        return ((a+b+20)*2);
    }
};
public class Program10 {
    public static void main(String[] args){
        B b1=new B(10, 30);
        System.out.println("Perform Sum and mul Operation on a and b value : "+b1.Sum());
    }
};
