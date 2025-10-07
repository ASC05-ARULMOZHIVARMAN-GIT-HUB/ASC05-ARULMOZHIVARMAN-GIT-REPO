package lab2;

public class LargestNumber {
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int largestNum = largest(10, 25, 17);
        System.out.println("Largest number is: " + largestNum);
    }
}
