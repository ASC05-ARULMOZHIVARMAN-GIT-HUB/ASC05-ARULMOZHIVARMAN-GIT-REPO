package lab;

public class MultiplicationTable {

    // Using for loop
    public void printTableFor(int num) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Using while loop
    public void printTableWhile(int num) {
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }

    // Using do-while loop
    public void printTableDoWhile(int num) {
        System.out.println("Using do-while loop:");
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        int number = 2; // Example input

        table.printTableFor(number);
        System.out.println();
        table.printTableWhile(number);
        System.out.println();
        table.printTableDoWhile(number);
    }
}
