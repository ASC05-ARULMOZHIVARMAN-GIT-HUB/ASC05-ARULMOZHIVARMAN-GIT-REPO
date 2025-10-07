package lab;

public class WordCounter {

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split input by spaces (or multiple spaces)
        String[] tokens = input.split("\\s+");

        int count = 0;
        for (String token : tokens) {
            // Check if token contains only letters (a-z, A-Z)
            if (token.matches("[a-zA-Z]+")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testStr = "Sum of 12 and 20 is 32";
        System.out.println("Number of words: " + countWords(testStr));
    }
}

