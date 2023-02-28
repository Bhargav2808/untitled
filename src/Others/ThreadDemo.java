package Others;

class ThreadExample2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Child Interupted");
            }
        }
        System.out.println("Hello World");
    }

    Thread t;

    ThreadExample2() {
        t = new Thread(this, "Demo Thread");
        System.out.println(t);
    }
}



public class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        ThreadExample2 nt = new ThreadExample2();
        nt.t.start();
        for (int i=0; i<5; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
