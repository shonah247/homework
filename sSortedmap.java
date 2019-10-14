import java.util.*;

public class sSortedmap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<Integer, String>();

        sm.put(new Integer(2), "practice");
        sm.put(new Integer(3), "practice");
        sm.put(new Integer(1), "practice");
        sm.put(new Integer(4), "makes");
        sm.put(new Integer(5), "perfect");
        Set s = sm.entrySet();

        // Using iterator in SortedMap
        Iterator i = s.iterator();

        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();

            int key = (Integer) m.getKey();
            String value = (String) m.getValue();

            System.out.println("Key : " + key +
                    "  value : " + value);
        }

    }
}
