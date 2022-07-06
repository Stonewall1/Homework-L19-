package task1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("1"));
        Thread t2 = new Thread(new MyThread("2"));
        Thread t3 = new Thread(new MyThread("3"));
        try {
            t3.start();
            t3.join();
            t2.start();
            t2.join();
            t1.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
