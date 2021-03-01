
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.*;

public class Searching {

    public static void main(String[] args) {

        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int end = books.size() - 1; //kuni viimase indeksini

        for (int begin = 0; begin <= end;) { //alustab lugemist nullist kuni viimase indeksini
            //while ( begin <=end --< alternatiiv)
            int middle = (begin + end) / 2; //täpselt keskmine indeks alguses. loop'imise järel...
            // muutub begin'i ja end'i väärtus, mis omakorda muudab middle indeksi väärtust.
            // nt kui raamatuid on 3700 ja otsitav id on 1500, siis kasutusse läheb begin = middle + 1, ja middle muutub. 

            if (books.get(middle).getId() == searchedId) { //kui middle indeks on võrdne otsitava indeksiga
                return middle;

            }
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }

        }

        return -1;
    }
}
