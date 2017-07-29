package multiThread;

/**
 * Created by Dimaster on 01.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new StudentThread());
        thread2.start();
        NumbersOfStoreaches storeaches = new NumbersOfStoreaches();
        for (int i = 0; i <= 100; i++){
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
