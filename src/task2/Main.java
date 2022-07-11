package task2;


public class Main {
    public static void main(String[] args) {
        ReentrantLockerClass rClass = new ReentrantLockerClass();
        Hacker hacker = new Hacker(rClass);
        User user = new User(rClass);
        Thread hackThread = new Thread(hacker);
        Thread userThread = new Thread(user);
        hackThread.start();
        userThread.start();
    }
}
