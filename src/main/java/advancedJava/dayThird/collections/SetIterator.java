package advancedJava.dayThird.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> setS = new HashSet<>();
        setS.add("1");
        setS.add("D");
        setS.add("3");

        Iterator<String> setIterator = setS.iterator();
        boolean b = setIterator.hasNext();

    }
}
