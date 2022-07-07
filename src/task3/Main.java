package task3;

public class Main {
    public static void main(String[] args) {
        SynchroClass rClass = new SynchroClass();
        Hacker hacker = new Hacker(rClass);
        User user = new User(rClass);
        Thread hackThread = new Thread(hacker);
        Thread userThread = new Thread(user);
        hackThread.start();
        userThread.start();
    }
}
