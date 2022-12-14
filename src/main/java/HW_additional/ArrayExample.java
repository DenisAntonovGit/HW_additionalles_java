package HW_additional;

import java.util.Arrays;

public class ArrayExample {

    public static String[] namesArray = {"Denis", "Darya", "Petka", "Yurii", "Timur"};
    public static int[] intArray = {-1, 9, 17, 16, 34, -55};

    public static void arraySearch() {
        for (int i = 0; i < namesArray.length; i++) {
            if (namesArray[i] == "Petka") {
                System.out.println("Нашли " + namesArray[i]);
                break;
            }
            System.out.println("Iteration");
        }
    }

    public static void sortElementsOfArray() {
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}