import java.util.Scanner;
class Car {
    private Scanner sc=new Scanner(System.in);
    private String name;
    private String color;
    private int seats_capacity,model_number;
    private int engine_number;
    public Car(){}
    public Car(String name,String color,int seats_capacity,int model_number,int engine_number) {
        this.name=name;
        this.color=color;
        this.seats_capacity=seats_capacity;
        this.model_number=model_number;
        this.engine_number=engine_number;
    }
    //If donot pass value using constructor use get_car_info Function
    public void get_car_info(){
        sc.nextLine();
        System.out.println("Enter Car Name : ");
        this.name=sc.nextLine();
        System.out.println("Enter Car color : ");
        this.color=sc.nextLine();
        System.out.println("Enter Car Seats Capacity : ");
        this.seats_capacity=sc.nextInt();
        System.out.println("Enter Model Number : ");
        this.model_number=sc.nextInt();
        System.out.println("Enter Engine Number : ");
        this.engine_number=sc.nextInt();
    }
    public void display_car_info(){
        System.out.println("Car Name is : "+this.name);
        System.out.println("Car color is : "+this.color);
        System.out.println("Engine Nuumber is : "+this.engine_number);
        System.out.println("Seats Capacity is : "+this.seats_capacity);
        System.out.println("Model Number is : "+this.model_number);
    }
};
public class Program1 {
    public static void main(String[] args) {
        /*Car c1=new Car("Suzuki","White",5,2022,123456789);*/
        Car c1=new Car();
        c1.get_car_info();
        c1.display_car_info();

    }
}