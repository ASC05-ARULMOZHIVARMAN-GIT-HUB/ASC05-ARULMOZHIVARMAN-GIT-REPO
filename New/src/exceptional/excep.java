package exceptional;

public class excep {
    public static void main(String[] args) {
        int i = 100;
        int result = 0; 

        try {
            System.out.println("Divide by zero");
            result = i / 0;  
            System.out.println("Result is: " + result); 
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            
            System.out.println("Result is not available due to exception.");
        }
    }
}

