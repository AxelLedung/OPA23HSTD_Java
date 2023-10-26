import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Person> personArrayList = new ArrayList<Person>();
    public static void main(String[] args) {
        personArrayList.add(new Person("Adam", 23, "Adamvägen 1"));
        personArrayList.add(new Person("Bertil", 24, "Bertilvägen 1"));
        personArrayList.add(new Person("Ceasar", 25, "Ceasarvägen 1"));
        personArrayList.add(new Person("David", 26, "Davidvägen 1"));
        personArrayList.add(new Person("Erik", 27, "Erikvägen 1"));
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i).Introduce());
        }

    }
}