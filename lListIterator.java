import java.util.ArrayList;
import java.util.ListIterator;

public class lListIterator {
    public static void main(String[] args)
    {

        ArrayList<Integer> aList
                = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        System.out.println("Elements of ArrayList: ");
        for (Integer i : aList) {
            System.out.println(i);
        }
        ListIterator<Integer> l
                = aList.listIterator();
        l.next();
        l.set(20); //only List Iterator can help change an element without actually changing it duh

        System.out.println("I changed the Array list to: ");
        for (Integer i : aList) {
            System.out.println(i);
        }
    }
}
