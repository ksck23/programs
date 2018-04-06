import java.util.*;

class ArrayListSimple {

    public static void main (String args[]) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        Iterator itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
