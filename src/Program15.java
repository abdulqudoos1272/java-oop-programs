import java.util.Scanner;

public class Program15 {
    public static void fun1(int x){
        try{
            fun2(x);
        }
        catch(Exception w){
            System.out.println(w.getMessage());
        }        
    }
    public static void fun2(int y)throws Exception {
        if(y%2==0){
            throw new Exception("Even");
        }
        else{
            throw new Exception("Odd");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check it is even or odd using Exception Handeling");
        int a=sc.nextInt();
        Program15.fun1(a);
    }
};
