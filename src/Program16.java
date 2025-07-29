@FunctionalInterface
interface A{
    public int fun1(int x,int y);
};
public class Program16 {
    public static void main(String[] args){
        A a1=new A(){
            @Override
            public int fun1(int x,int y){
                return (x+y);
            }
        };
        System.out.println(a1.fun1(32, 8));
    }
};
