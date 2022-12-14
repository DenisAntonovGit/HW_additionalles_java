package HW_additional;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static Map<Integer, String> mapPair = new HashMap<Integer, String>();

    public static void addElementToMap() {
        mapPair.put(1, "Toyota");
        mapPair.put(2, "Honda");
        mapPair.put(3, "Mazda");
        mapPair.put(4, "Mercedes");
        mapPair.put(5, "Suzuki");
        System.out.println(mapPair.toString());
    }

    public static void searchMapElement() {
        if (mapPair.containsKey(3)) {
            System.out.println("Этот элемент содержит значение " + mapPair.get(3));
        }
    }

    public static void deleteMapElement() {
        mapPair.remove(5, "Suzuki");
        do {
            System.out.println("Элемент не удален");
            break;
        }
        while (mapPair.containsKey(5));
        System.out.println("Теперь он удален");
        System.out.println(mapPair.toString());
    }
}
