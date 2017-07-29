package multiThread;

/**
 * Created by Dimaster on 01.08.2017.
 */
public class StudentThread implements Runnable{
    @Override
    public void run() {
        NumbersOfStoreaches storeaches = new NumbersOfStoreaches();
        for (int i = 100; i <= 1200; i++){
            storeaches.addNumber(i);
//            System.out.println( Thread.currentThread().getName() + " ----- "+ i);
            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
