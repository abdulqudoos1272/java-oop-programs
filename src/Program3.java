import java.util.Scanner;
class SIH{
    protected Scanner sc = new Scanner(System.in);
    protected int a,b;
    protected String op;
    protected void get(){
        System.out.println("Enter the value of first number: ");
        this.a = sc.nextInt();
        System.out.println("Enter the value of second number: ");
        this.b = sc.nextInt();
        System.out.println("Choose the Operation (+,-,*,/): ");
        sc.nextLine();
        this.op = sc.nextLine();
    }
};
class SIH1 extends SIH{
    public void calculator(){
        get();
        switch (this.op) {
            case "+"->{
                System.out.println("Sum of two number is : "+(this.a+this.b));
            }
            case "-"->{
                System.out.println("Subtraction of two number is : "+(this.a-this.b));
            }
            case "*"->{
                System.out.println("Multiplication of two number is : "+(this.a*this.b));
            }
            case "/"->{
                try{
                    System.out.println("Division of two number is : "+(this.a/this.b));
                } 
                catch(Exception e){
                    System.out.println("Division by zero is not allowed.");
                }
            }
            default -> {
                System.out.println("Invalid operation selected.");
            }
        }

    }
}
public class Program3 {
    public static void main(String [] args){
        SIH1 h1=new SIH1();
        h1.calculator();
    }
    
};
