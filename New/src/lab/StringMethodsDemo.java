package lab;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String str = "  Hello, World! Welcome to Java Programming.  ";

        // charAt - character at index 7
        System.out.println("charAt(7): " + str.charAt(7));  // W

        // contains - check if str contains "World"
        System.out.println("contains(\"World\"): " + str.contains("World"));  // true

        // length - length of the string
        System.out.println("length(): " + str.length());  // includes spaces

        // indexOf - first occurrence of 'o'
        System.out.println("indexOf('o'): " + str.indexOf('o'));  // index of first 'o'

        // equals - compare two strings
        String s1 = "Java";
        String s2 = "java";
        System.out.println("equals(\"Java\"): " + s1.equals(s2));  // false

        // equalsIgnoreCase - compare ignoring case
        System.out.println("equalsIgnoreCase(\"java\"): " + s1.equalsIgnoreCase(s2));  // true

        // join - join strings with delimiter
        String joined = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println("join: " + joined);  // Apple - Banana - Cherry

        // lastIndexOf - last occurrence of 'o'
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));

        // substring - substring from index 7 to 12
        System.out.println("substring(7, 12): " + str.substring(7, 12));  // World

        // toLowerCase - convert to lowercase
        System.out.println("toLowerCase(): " + str.toLowerCase());

        // toUpperCase - convert to uppercase
        System.out.println("toUpperCase(): " + str.toUpperCase());

        // trim - remove leading and trailing spaces
        System.out.println("trim(): '" + str.trim() + "'");
    }
}
