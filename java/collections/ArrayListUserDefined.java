import java.util.*;

/*
 * Student Class Definition
 */
class Student {
    int rollno;
    String name;
    int age;
    Student (int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListUserDefined {

    public static void main (String args[]) {

        Student s1 = new Student(101, "Vijay", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Shyam", 25);

        // existing students list
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // new students list
        Student s4 = new Student(104, "Shiva", 25);
        Student s5 = new Student(105, "Kalyan", 27);

        ArrayList<Student> newstudents = new ArrayList<Student>();
        newstudents.add(s4);
        newstudents.add(s5);

        // adding new students to "students" list
        students.addAll(newstudents);

        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
