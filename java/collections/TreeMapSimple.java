import java.util.*;

class TreeMapSimple {

    public static void main (String args[]) {

        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(103, "Amit");
        tmap.put(100, "Ravi");
        tmap.put(101, "Vijay");
        tmap.put(102, "Rahul");

        for (Map.Entry m:tmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Note: Tree Map contains unique elements and maintains ascending order");
    }
}
