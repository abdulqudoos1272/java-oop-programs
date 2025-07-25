
class Car{
    protected String name;
    protected int seats;
    protected Long engine_num;
    Car(){
    }
};
class Toyota extends Car{
    public static String company="Toyota";
    public Toyota(String nam,int sea,Long eng_n){
        this.name=nam;
        this.seats=sea;
        this.engine_num=eng_n;
    }
    public void display(){
        System.out.println("Car Company is : "+company);
        System.out.println("Car Name is : "+this.name);
        System.out.println("Car Seat capacity is : "+this.seats);
        System.out.println("Engine Number is : "+this.engine_num);
    }
};
class Suzuki extends Car{
    public static String company="Suzuki";
    public Suzuki(String nam,int sea,Long eng_n){
        this.name=nam;
        this.seats=sea;
        this.engine_num=eng_n;
    }
    public void display(){
        System.out.println("Car Company is : "+company);
        System.out.println("Car Name is : "+this.name);
        System.out.println("Car Seat capacity is : "+this.seats);
        System.out.println("Engine Number is : "+this.engine_num);
    }
};
public class Program5 {
    public static void main(String[] args) {
        Toyota t1=new Toyota("GLI",5,65432345L);
        Suzuki s1=new Suzuki("Mehran", 4, 123456L);
        t1.display();
        s1.display();
    }    
}
