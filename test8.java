import java.util.Arrays;
import java.util.Comparator;

public class test8 {
    // below is the test variable
    static String[][] arr = { { "word2", "2" }, { "word1", "3" }, { "word5", "5" }, { "word4", "4" },
            { "word3", "1" } };

    // It displays the dictionary
    public static void display() {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + ": ");
            System.out.print(arr[i][1] + ",");
        }
        System.out.print("}");
        System.out.println("");
    }

    // Method to sort by Name
    public static void sortByName() {
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return String.valueOf(o1[0]).compareTo(String.valueOf(o2[0]));
            }
        });
    }

    // Method to sort by Number
    public static void sortByNumber() {
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return Integer.valueOf(o1[1]).compareTo(Integer.valueOf(o2[1]));
            }
        });
    }

    public static void main(String args[]) {
        System.out.println("Dictionary initially");
        display();
        System.out.println("Sorted dictionary by name: ");
        sortByName();
        display();
        System.out.println("Sorted dictionary by number: ");
        sortByNumber();
        display();
    }

}
