
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));

        String[] stringArrays = {"b", "t", "i", "s", "a", "a"};
        sort(stringArrays);
        System.out.println(Arrays.toString(stringArrays));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(10);
        list.add(1);
        sortIntegers(list);
        System.out.println(list);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("eesel");
        stringList.add("aabits");
        stringList.add("banaan");
        sortStrings(stringList);
        System.out.println(stringList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);

    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);

    }

}
