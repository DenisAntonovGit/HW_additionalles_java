package HW_additional;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static Set<String> setString = new HashSet<>();

    public static void addElementInSet() {
        setString.add("cat");
        setString.add("dog");
        setString.add("zebra");
        setString.add("lion");
        setString.add("snake");
        System.out.println(setString.size());
        System.out.println(setString.toString());
    }

    public static void findElementOfSet() {
        for (String setEl: setString) {
            setEl.contains("cat");
            break;
        }
        System.out.println("Кот найден");
    }

    public static void deleteElementFromSet() {
        setString.remove("cat");
        System.out.println(setString.toString());
    }
}
