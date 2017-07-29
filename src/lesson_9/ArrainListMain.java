package lesson_9;

import java.util.ArrayList;

/**
 * Created by Dimaster on 29.03.2010.
 */
public class ArrainListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i<=10000; i++){
            list.add("abc" + i);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time to add = " + (timeEnd - timeStart));

        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i<=10000; i++){
            list.get(i);
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("Time to get = " + (timeEnd1 - timeStart1));

        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i<=10000; i++){
            list.remove(0);
        }
        long timeEnd2 = System.currentTimeMillis();
        System.out.println("Time to remove = " + (timeEnd2 - timeStart2));
    }
}
