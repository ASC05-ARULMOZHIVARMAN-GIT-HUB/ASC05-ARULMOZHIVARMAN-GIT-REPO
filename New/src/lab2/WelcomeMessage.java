package lab2;

public class WelcomeMessage {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    public static void main(String[] args) {
        String message = welcomeMessage("Alice");
        System.out.println(message);
    }
}
