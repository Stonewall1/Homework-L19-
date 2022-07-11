package task3;

public class Hacker implements Runnable{
    SynchroClass C;

    public Hacker(SynchroClass c) {
        C = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            C.extractInfo();
        }
    }
}
