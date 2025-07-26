import java.util.Scanner;
public class Program14 {
    public static void main(String[] args)/*If you have doubt this function throws an exception use" throws Exception" or try and catch*/
    {
        Scanner sc=new Scanner(System.in);
        Float a,b;
        System.out.println("Enter value of a : ");
        a=sc.nextFloat();
        System.out.println("Enter value of b : ");
        b=sc.nextFloat();
        System.out.println("Sum of a and b is : "+(a+b));
        System.out.println("Sub of a and b is : "+(a-b));
        System.out.println("Mul of a and b is : "+(a*b));
        try{
        System.out.println("Division of a and b is : "+(a/b));
        }
        catch(Exception q){
            System.out.println(q);
        }
        finally{
            System.out.println("Program Execution Completed");
        }
    }
};
