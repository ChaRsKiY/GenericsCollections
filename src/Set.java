import java.util.*;
import java.util.ArrayList;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        set1.add("car1");
        set1.add("car2");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("car3", "dog", "cat"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("bird", "elephant", "smth"));
        set1.addAll(list1);
        set1.addAll(list2);

        System.out.println("Значения set1:");
        for (String item : set1) {
            System.out.println(item);
        }

        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("hamster", "car4", "car5"));
        set2.addAll(list2);
        set2.addAll(list3);

        System.out.println("\nЗначения set2:");
        for (String item : set2) {
            System.out.println(item);
        }
    }
}
