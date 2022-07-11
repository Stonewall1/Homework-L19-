package task2;

public class Hacker implements Runnable{
    ReentrantLockerClass C;

    public Hacker(ReentrantLockerClass c) {
        C = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            C.extractInfo();
        }
    }
}
