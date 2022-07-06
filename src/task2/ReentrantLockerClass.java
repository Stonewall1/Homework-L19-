package task2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockerClass {

    private int bufferedInfo = 5;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void putInfo(){
        lock.lock();
        try{
            while(bufferedInfo == 10) {
                condition.await();
            }
            bufferedInfo++;
            System.out.println("+ info");
            System.out.println("Current info = " + bufferedInfo);

            condition.signalAll();
            lock.unlock();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void extractInfo(){
        lock.lock();
        try{
            while(bufferedInfo == 0) {
                condition.await();
            }
            bufferedInfo--;
            System.out.println("- info");
            System.out.println("Current info = " + bufferedInfo);

            condition.signalAll();
            lock.unlock();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
