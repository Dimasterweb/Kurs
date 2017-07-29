package collections;



import java.util.*;

/**
 * Created by Admin on 27.07.2017.*
 */
public class ListUtilsRelise implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if (strings == null){
            throw new IllegalArgumentException("strings == null");
        }
        ArrayList<String> result = new ArrayList<>();
        for (String s : strings){
            result.add(s);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException("data == null");
        }
        List<Double> res = new ArrayList<>(data);
        Collections.sort(res, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return -o1.compareTo(o2);
            }
        });
        return res;
    }
}
