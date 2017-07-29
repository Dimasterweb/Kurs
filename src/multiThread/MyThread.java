package multiThread;

/**
 * Created by Dimaster on 01.08.2017.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        NumbersOfStoreaches storeaches = new NumbersOfStoreaches();
        for (int i = 90; i <= 1000; i++){
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
