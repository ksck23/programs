import java.util.*;

class LinkedHashSetSimple {

    public static void main (String args[]) {

        LinkedHashSet<String> names = new LinkedHashSet<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Note: Linked Hash Set contains unique elements but doesn't preserve the order");
    }
}
