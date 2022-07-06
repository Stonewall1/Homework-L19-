package task1;

public class MyThread implements Runnable{
    private final String X;

    public MyThread(String x) {
        X = x;
    }

    @Override
    public void run() {
        choose(this.X);
    }

    private void choose(String X) {
        switch (X) {
            case "1" -> System.out.print(" !");
            case "2" -> System.out.print("world");
            case "3" -> System.out.print("Hello , ");
        }
    }
}
