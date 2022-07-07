package task3;

public class SynchroClass {
    private int bufferedInfo = 5;

    public synchronized void putInfo(){
        if(bufferedInfo == 10){

        }
        else{
            bufferedInfo++;
            System.out.println("+ info");
            System.out.println("Current info = " + bufferedInfo);
        }
    }

    public synchronized void extractInfo(){
        if(bufferedInfo == 0){

        }
        else{
            bufferedInfo--;
            System.out.println("- info");
            System.out.println("Current info = " + bufferedInfo);
        }
    }
}
