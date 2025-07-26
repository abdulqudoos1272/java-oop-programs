class Delivery_Address{
    public String Del_Add;
    public Delivery_Address(){}
    public Delivery_Address(String address){
        this.Del_Add=address;
    }
};
class order{
    Delivery_Address d=new Delivery_Address("XYZ");
    private Long order_id;
    private String order_name;
    order(Long i,String o_n){
        this.order_id=i;
        this.order_name=o_n;
    }
    public void show(){
        System.out.println("Order id is : "+this.order_id);
        System.out.println("Order Name is : "+this.order_name);
        System.out.println("Order Delivery Address : "+this.d.Del_Add);
    }
};
public class Program13 {
    public static void main(String[] args){
        order o1=new order(3453L,"abc");
        o1.show();
    }
};
