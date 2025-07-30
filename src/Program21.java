class A implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
            Thread.sleep(1000);
            //Thread.yield();//Yielding the thread to allow other threads to run
            }
            catch(Exception w){
                System.out.println(w.getMessage());
            }
        }
    }
};
public class Program21 {
    public static void main(String[] args){
        A a1=new A();
        A a2=new A();
        Thread t1=new Thread(a1);
        Thread t2=new Thread(a2);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        t2.start();
        for(int j=1;j<=5;j++){
            System.out.println("Main");
              try{
            Thread.sleep(1000);
            }
            catch(Exception w){
                System.out.println(w.getMessage());
            }
        }

    }
};
