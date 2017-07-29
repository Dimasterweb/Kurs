package multiThread;

import java.util.ArrayList;

/**
 * Created by Dimaster on 01.08.2017.
 */
public class NumbersOfStoreaches {
    private static ArrayList<Integer> storeaches = new ArrayList<>();

    public  void addNumber (int a){
        synchronized (storeaches){
            storeaches.add(a);
            System.out.println(storeaches);
        }

    }
}
