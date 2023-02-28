package Others;

public class ThreadDemo2{
    public static void main(String[] args) throws InterruptedException {
        ThreadExample3 nt = new ThreadExample3();
        nt.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

class ThreadExample3 extends Thread{
    ThreadExample3(){
        super("Demo Thread");
        System.out.println(this);
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Out");
    }
}
