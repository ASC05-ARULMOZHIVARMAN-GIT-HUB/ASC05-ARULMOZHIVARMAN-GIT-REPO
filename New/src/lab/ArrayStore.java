package lab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStore {

    private int[] arr;
    private int size;  

    
    public ArrayStore() {
        arr = new int[10];
        size = 0;
    }

    
    public void acceptIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        size = 10;
    }

    
    public void displayWhile() {
        System.out.print("Array elements (while loop): ");
        int i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    
    public void displayFor() {
        System.out.print("Array elements (for loop): ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sort the array (only up to current size)
    public void sortArray() {
        Arrays.sort(arr, 0, size);
    }

    // Count occurrences of a number
    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    // Insert a number at specified position (0-based index)
    public boolean insertAtPosition(int num, int pos) {
        if (pos < 0 || pos > size || size == arr.length) {
            // Invalid position or array full
            return false;
        }

        // Shift elements right from pos
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = num;
        size++;
        return true;
    }

    // Return new array excluding duplicates
    public int[] removeDuplicates() {
        // Use a temporary array to store unique elements
        int[] temp = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount++] = arr[i];
            }
        }

        // Copy unique elements into a new array of correct size
        return Arrays.copyOf(temp, uniqueCount);
    }

    // Main method to demo the class
    public static void main(String[] args) {
        ArrayStore store = new ArrayStore();

        // Accept 10 integers
        store.acceptIntegers();

        // Display using while and for loops
        store.displayWhile();
        store.displayFor();

        // Sort and display again
        store.sortArray();
        System.out.println("After sorting:");
        store.displayFor();

        // Count occurrences
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count occurrences: ");
        int numToCount = sc.nextInt();
        System.out.println(numToCount + " occurs " + store.countOccurrences(numToCount) + " times.");

        // Insert a number at position
        System.out.print("Enter number to insert: ");
        int numToInsert = sc.nextInt();
        System.out.print("Enter position to insert (0-based index): ");
        int pos = sc.nextInt();

        boolean inserted = store.insertAtPosition(numToInsert, pos);
        if (inserted) {
            System.out.println("After insertion:");
            store.displayFor();
        } else {
            System.out.println("Insertion failed: invalid position or array full.");
        }

        // Remove duplicates and display
        int[] uniqueArr = store.removeDuplicates();
        System.out.print("Array without duplicates: ");
        for (int val : uniqueArr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

