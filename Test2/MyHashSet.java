import java.util.HashSet;

public class MyHashSet extends HashSet<Integer> {
    private int numarTotalElementeAdaugate = 0;

    @Override
    public boolean add(Integer integer) {
        boolean rezultat = super.add(integer);
        if (rezultat) {
            numarTotalElementeAdaugate++;
        }
        return rezultat;
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> c) {
        boolean rezultat = super.addAll(c);
        if (rezultat) {
            numarTotalElementeAdaugate += c.size();
        }
        return rezultat;
    }

    public int getNumarTotalElementeAdaugate() {
        return numarTotalElementeAdaugate;
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        System.out.println("Numar total elemente adaugate: " + mySet.getNumarTotalElementeAdaugate());

        HashSet<Integer> altSet = new HashSet<>();
        altSet.add(4);
        altSet.add(5);
        altSet.add(6);
        mySet.addAll(altSet);
        System.out.println("Numar total elemente adaugate dupa addAll: " + mySet.getNumarTotalElementeAdaugate());
    }
}