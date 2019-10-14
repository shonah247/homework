import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        //ArrayList

        ArrayList al = new ArrayList();
        al.add("Ray Ray");
        al.add("Sarah");
        al.add("mikaila");
        al.add("renzo");
        al.add("Bailey");
        al.add("Ryan");
        al.add("Carlos");
        al.add("David");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
        } //this is iterating the elements of a collection by for each loop
    }
}
