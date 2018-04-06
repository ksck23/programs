import java.util.*;

class LinkedListListSimple {

    public static void main (String args[]) {

        LinkedList<String> names = new LinkedList<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");

        ListIterator<String> itr = names.listIterator();

        System.out.println("Printing names in order: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Printing names in reverse order: ");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
