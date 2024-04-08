import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 8.5f));
        students.add(new Student("Alice", 9.2f));
        students.add(new Student("Bob", 7.8f));

        for (Student student : students) {
            System.out.println("Testare pentru " + student.getNume() + ":");
            System.out.println("element.equals(element): " + student.equals(student));
            System.out.println("((Object)element).equals(element): " + ((Object) student).equals(student));
            System.out.println();
        }
    }
}