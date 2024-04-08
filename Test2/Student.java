import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String nume;
    public float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Float.compare(this.medie, otherStudent.medie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.medie, medie) == 0 &&
                Objects.equals(student.nume, nume);
    }

    // Suprărcărcare a metodei equals care primește un parametru de tip Student
    public boolean equals(Student student) {
        return false; // întotdeauna returnează false
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, medie);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public float getMedie() {
        return medie;
    }

    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("John", 8.5f));
        studenti.add(new Student("Alice", 9.2f));
        studenti.add(new Student("Bob", 7.8f));

        Collections.sort(studenti);

        for (Student student : studenti) {
            System.out.println(student);
        }
    }
}