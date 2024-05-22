import java.util.*;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            map1.put(i, months[i]);
        }

        System.out.println("Первый месяц года: " + map1.get(0));
        System.out.println("Последний месяц года: " + map1.get(11));

        map1.put(6, "отпуск");
        System.out.println("6-й месяц года: " + map1.get(6));

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.putAll(map1);

        printMap(map1);
        printMap(map2);
    }

    private static void printMap(Map<Integer, String> map) {
        System.out.println("\nЭлементы карты:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
