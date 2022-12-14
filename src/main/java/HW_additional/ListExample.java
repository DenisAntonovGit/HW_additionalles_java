package HW_additional;

import java.util.ArrayList;

public class ListExample {
    public static ArrayList<String> listNames = new ArrayList<String>();

    public static void addElementToList() {
        listNames.add("Denis");
        listNames.add("Nickolay");
        listNames.add("Marina");
        listNames.add("Vladimir");
        listNames.add("Tatyana");
        for (String element:listNames) {
            System.out.println(element);
        }
    }

    public static void searchElementInList() {
        if (listNames.contains("Vladimir")) {
            System.out.println("Мы нашли его");
        }
    }

    public static void deleteElementFromList() {
        listNames.remove(3);
        System.out.println(listNames.toString());
    }
}
