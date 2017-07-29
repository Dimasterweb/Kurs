package lesson_9;

import java.util.*;

/**
 * Created by Dimaster on 16.07.2017.
 */
public class MainCollection {
    public static void main(String[] args) {
        HashMap<String,Integer> footbal = new HashMap<>();
        footbal.put("Hahtar", 10);
        footbal.put("Real", 13);
        footbal.put("Barcelona", 17);

        System.out.println(footbal.entrySet());

        Set<Map.Entry<String, Integer>> danie = footbal.entrySet();
        for (Iterator<Map.Entry<String, Integer>> iter = danie.iterator();iter.hasNext();){
            Map.Entry<String, Integer> para = iter.next();
            System.out.println(para.getKey());
            System.out.println(para.getValue());
        }



        if (footbal.containsKey("Hahtar")){
            footbal.put("Hahtar",footbal.get("Hahtar") + 10);
        }


        System.out.println(footbal.entrySet());



    }
}
