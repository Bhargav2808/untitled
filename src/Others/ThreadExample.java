package Others;

public class ThreadExample extends Thread{

    public static void main( String args[] ) throws InterruptedException {
        Thread t1 =Thread.currentThread();
        System.out.println(t1);
        t1.setName("Bhargav Thread");
        System.out.println(t1);

        for (int i=0; i<5; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
