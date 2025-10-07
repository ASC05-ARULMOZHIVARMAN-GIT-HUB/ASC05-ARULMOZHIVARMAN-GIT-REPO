package sun;

public class Learner {
   
    String[] names;

  
    void setNames() {
        names = new String[] {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
    }

   
    void printNames() {
        System.out.println("Learner Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    
    public static void main(String[] args) {
        Learner learner = new Learner();
        learner.setNames();
        learner.printNames();
    }
}
