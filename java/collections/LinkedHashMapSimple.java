import java.util.*;

class LinkedHashMapSimple {

    public static void main (String args[]) {

        LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
        hmap.put(103, "Amit");
        hmap.put(100, "Ravi");
        hmap.put(101, "Vijay");
        hmap.put(102, "Rahul");

        for (Map.Entry m:hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Note: Linked Hash Map contains unique elements but doesn't maintain any order");
    }
}
