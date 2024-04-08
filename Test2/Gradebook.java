import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {
    private Comparator<Float> comparator;

    public Gradebook(Comparator<Float> comparator) {
        super(comparator);
        this.comparator = comparator;
    }


    public void add(Student student) {
        float medieRotunjita = Math.round(student.medie);
        List<Student> studentiCuMedie = this.getOrDefault(medieRotunjita, new ArrayList<>());
        studentiCuMedie.add(student);

        this.put(medieRotunjita, studentiCuMedie);
    }


    public void sortAlfabetic() {
        for (List<Student> studentList : this.values()) {
            Collections.sort(studentList);
        }
    }

    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook(Collections.reverseOrder());

        gradebook.add(new Student("Ilie", 5.3f));
        gradebook.add(new Student("Vlad", 8.5f));
        gradebook.add(new Student("Maxim", 9.2f));
        gradebook.add(new Student("Vova", 7.8f));

        gradebook.sortAlfabetic();

        // Afisare gradebook
        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            System.out.println("Medie: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println("\t" + student);
            }
        }
    }
}