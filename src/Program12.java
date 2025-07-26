import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

class company{
    public String company_name;
    public String company_address;
    public company(){}
    public company(String name,String address){
        this.company_name=name;
        this.company_address=address;
    }        
};
class Employee{
    company c1=new company("ABC","XYZ");
    Scanner sc=new Scanner(System.in);
    private String Emp_name,Emp_pro;
    private Long Emp_salary;
    public void get_info_Employee(){
        System.out.println("Enter Employee Name : ");
        this.Emp_name=sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        this.Emp_salary=sc.nextLong();
        System.out.println("Enter Employee Profession : ");
        sc.nextLine();
        this.Emp_name=sc.nextLine();
    }
    public void show_info_Employee(){ 
        System.out.println("Company Name : "+this.c1.company_name);
        System.out.println("Employee Name is : "+this.Emp_name);
        System.out.println("Employee Salary is : "+this.Emp_salary);
        System.out.println("Employee  is Profession is : "+this.Emp_pro);
        System.out.println("Company Name : "+this.c1.company_address);
    }
};
public class Program12 {
    public static void main(String[] arg){
        Employee e=new Employee();
        e.get_info_Employee();
        e.show_info_Employee();
    }
};
