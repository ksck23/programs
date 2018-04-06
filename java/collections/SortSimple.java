import java.util.*;

class SortSimple {

    public static void main (String args[]) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(123);
        numbers.add(100);
        numbers.add(98);
        numbers.add(110);

        Collections.sort(numbers);

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
