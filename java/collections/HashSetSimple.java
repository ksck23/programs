import java.util.*;

class HashSetSimple {

    public static void main (String args[]) {

        HashSet<String> names = new HashSet<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Note: Hash Set contains unique elements but doesn't preserve the order");
    }
}
