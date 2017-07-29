package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dimaster on 23.07.2017.*
 */
public class CollectionUtilsRelise implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("a == null || b == null");
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("a == null || b == null");
        }
        Collection<Integer> result = new ArrayList<>();
        if (a.size() > b.size()) {
            result.addAll(a);
            result.retainAll(b);
        } else {
            result.addAll(b);
            result.retainAll(a);
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("a == null || b == null");
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("a == null || b == null");
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.removeAll(b);

        return result;
    }
}
