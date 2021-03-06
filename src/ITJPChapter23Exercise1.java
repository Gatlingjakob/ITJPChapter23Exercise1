/**
 * Created by Jakob on 26-10-2016.
 */

import java.util.Comparator;

public class ITJPChapter23Exercise1 {
    /** Generic bubble sort method using comparable */
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    /** Generic bubble sort method using comparator */
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    /** A test method */
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] listArray = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        // Create a Double array
        Double[] doubleArray = {3.4, 1.3, -22.1, 14.8, 6.0, 2.3, 12.2};

        // Create a Character array
        Character[] charArray = {'a', 'J', 'k', 'o', 'b'};

        // Create a String array
        String[] stringArray = {"Ace", "Frehley", "Peter", "Criss"};

        // Sort the arrays
        bubbleSort(listArray);
        bubbleSort(doubleArray);
        bubbleSort(charArray);
        bubbleSort(stringArray);

        printList(listArray);
        printList(charArray);
        printList(stringArray);
        printList(doubleArray);
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }


}