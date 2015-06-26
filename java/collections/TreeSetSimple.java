import java.util.*;

class TreeSetSimple {

    public static void main (String args[]) {

        TreeSet<String> names = new TreeSet<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Note: Tree Set contains unique elements and also sorts them");
    }
}
