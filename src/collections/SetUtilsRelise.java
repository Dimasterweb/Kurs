package collections;

import java.util.*;

/**
 * Created by Admin on 29.07.2017.8
 */
public class SetUtilsRelise implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        if (collection1 == null || set2 == null){
            throw new NullPointerException("collection1 == null || set2 == null");
        }
        Set<String> strings = new HashSet<String>();
        for (Iterator<Integer> iterator = collection1.iterator();iterator.hasNext();){
            strings.add(Integer.toString(iterator.next()));
        }
        SortedSet<String> result = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        result.addAll(set2);
        result.addAll(strings);
        return result;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        return null;
    }
}
