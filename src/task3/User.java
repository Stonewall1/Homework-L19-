package task3;


public class User implements Runnable{
    SynchroClass C;

    public User(SynchroClass c) {
        C = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            C.putInfo();
        }
    }
}
