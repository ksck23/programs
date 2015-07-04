import java.util.*;

/*
 * Student Class Definition
 */
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;
    Student (int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo (Student obj) {

        Student st = (Student)obj;

        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }

}

public class SortComparable {

    public static void main (String args[]) {

        Student s1 = new Student(103, "Vijay", 23);
        Student s2 = new Student(101, "Ravi", 21);
        Student s3 = new Student(102, "Shyam", 25);

        // existing students list
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
