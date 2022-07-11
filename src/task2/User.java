package task2;

public class User implements Runnable{
    ReentrantLockerClass C;

    public User(ReentrantLockerClass c) {
        C = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            C.putInfo();
        }
    }
}
