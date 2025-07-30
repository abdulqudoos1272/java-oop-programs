class Bank implements Runnable{
    private Long money=5000L;
    @Override
    public synchronized void run(){
        synchronized(this){
        if(money>0){
            System.out.println(Thread.currentThread().getName()+ " Withdras 2500 Rupees");
            money-=2500;
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " No Money to Withdraw");
        }
    }
}
};
public class Program22 {
    public static void main(String[] args){
        Bank b1=new Bank();
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b1);
        Thread t3=new Thread(b1);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
};