import java.util.*;

class HashtableSimple {

    public static void main (String args[]) {

        Hashtable<Integer, String> hmap = new Hashtable<Integer, String>();
        hmap.put(103, "Amit");
        hmap.put(100, "Ravi");
        hmap.put(101, "Vijay");
        hmap.put(102, "Rahul");

        for (Map.Entry m:hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Note: Hashtable contains unique elements with order and it is synchronized");
    }
}
