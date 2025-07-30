class ABC extends Thread {
    private static Long money = 5000L;
    public static synchronized void fun1(){
        if (money>0) {
            System.out.println(Thread.currentThread().getName() + " Withdraws 2500 Rupees");
            money -= 2500;
        } else {
            System.out.println(Thread.currentThread().getName() + " No Money to Withdraw");
        }
    }
    @Override
    public void run() {
            fun1();
    }
};
public class Program23 {
    public static void main(String[] args) {
        ABC b1 = new ABC();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(b1);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
};
