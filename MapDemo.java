import java.util.*;


public class MapDemo{
        public static void main(String[] args) {

            // creating an Set
            SortedSet<Integer> bl
                    = new TreeSet<Integer>();

            // using add() gives vale to what we are adding
            bl.add(1);
            bl.add(2);
            bl.add(3);
            bl.add(4);

            // arr is our value
            System.out.println("Set: " + bl);

            System.out.println("HashCode value: " + bl.hashCode());
        }
}





//            HashSet<Integer> setA = new HashSet<>();
//            setA.addAll(Arrays.asList(1, 2, 3, 4));
//
//            HashSet<Integer> setB = new HashSet<>();
//            setB.addAll(Arrays.asList(1, 4, 5, 6, 7));
//
//            System.out.println(
//                    "SetA: " + setA.toString());
//            System.out.println(
//                    "SetB: " + setB.toString());
//
//            HashSet<Integer> result = new HashSet<>();
//            result.addAll(setA);
//            result.addAll(setB);
//
//            System.out.println("union: " + result.toString());
//        }






