
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
//        System.out.println("Smallest number: " + MainProgram.smallest(array));
//        System.out.println("Smallest number is at index: " + MainProgram.indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//        System.out.println(Arrays.toString(array));
//        MainProgram.swap(array, 0, 2);
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);

    }

    public static int smallest(int[] smallest) {
        int number = smallest[0];

        for (Integer i : smallest) {

            if (number > i) {
                number = i;
            }
        }
        return number;

    }

    public static int indexOfSmallest(int[] array) {
        if (array.length < 0) {
            return -1;
        }

        int max = array[0]; //eeldus, et kõrgeim väärtus on esimesel indeksil arrayl
        int index = 0; //indeksi väärtus on 0

        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) { // kui muutuja max on array [i)-st suurem
                max = array[i]; // max on.... -20, sest teised väärtused on suuremad
                index = i;      // index võrdub i indeksi positsioon
            }
        }

        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        if (table.length < 0) {
            return -1;
        }
        //int[] array = {8, 3, 7, 9, 1, 2, 4};
        int start = table[startIndex]; // start index väärtus on 8, kui for loop algab esimesest indeksist.

        int index = startIndex; // startIndexi  indeks, mille määrab main meetodis ise.

        for (int i = startIndex; i < table.length; i++) {
            if (start > table[i]) { // kui value [1] > value[2]
                start = table[i];   // value [1] = value[2]
                index = i;// index = 4, sest neljandal indeksil on kõige väiksem väärtus
            }

        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {

        int swap = array[index1];  // 0 = 1
        array[index1] = array[index2]; //1 = 2
        array[index2] = swap; //2 = 1

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            indexOfSmallestFrom(array, i); //hakka pihta indeks i-st, mille väärtus on null.
            swap(array, indexOfSmallestFrom(array, i), i); // indexOfSmallest - > alustab indeks 0-ist - vahetab välja tänu indexOfSmallest ->
            System.out.println(Arrays.toString(array));    //-> meetodile indeksid 0 ja 4 ehk väärtused 8 ja 1. pärast mida toimub loop edasi kuni           
        }                                                  // väikseim väärtus on oma indeksi õigel kohal.

    }
}
