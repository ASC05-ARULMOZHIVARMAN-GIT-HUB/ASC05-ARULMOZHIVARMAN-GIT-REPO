package sun;

import java.util.*;

public class CollectionExample {  
    HashMap<String, String> learn = new HashMap<String, String>();

    public void assign() {
        learn.put("arul", "Ascender");
        learn.put("sam", "Ascender");
        learn.put("Hari", "Ascender");
        learn.put("surya", "Ascender");
    }

    public void display() {
        System.out.println("arul is " + learn.get("arul"));
        System.out.println("sam is " + learn.get("sam"));
        System.out.println("hari is " + learn.get("Hari"));
        System.out.println("surya is " + learn.get("surya"));
    }

    public static void main(String[] args) {
        CollectionExample c = new CollectionExample();
        c.assign();
        c.display();
    }
}



