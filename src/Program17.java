@FunctionalInterface
interface Lam{
    public int fun1(int x,int y,int z);
};
public class Program17 {
    public static void main(String[] args){
        Lam l1=(int x,int y,int z)->{
            if(x>y && x>z){
                return x;
            }
            else if(y>x && y>z){
                return y;
            }
            else{
                return z;
            }
        };
        System.out.println("Grater Value is : "+l1.fun1(23, 28, 98));
    }
};
