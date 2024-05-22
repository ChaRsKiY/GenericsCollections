import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();

        String[] array = {"apple", "banana", "cherry"};
        list1.addAll(Arrays.asList(array));

        java.util.ArrayList<String> list2 = new java.util.ArrayList<>(list1);

        java.util.ArrayList<String> list3 = new java.util.ArrayList<>(Arrays.asList("dog", "cat", "bird"));

        int middle = list2.size() / 2;
        list2.addAll(middle, list3);

        Collections.sort(list2, Collections.reverseOrder());

        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        System.out.println("Отсортированный и обработанный список:");
        for (String item : list2) {
            System.out.println(item);
        }
    }
}