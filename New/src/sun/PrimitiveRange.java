package sun;

public class PrimitiveRange {
    
    private byte byteVar;
    private short shortVar;
    private int intVar;
    private long longVar;
    private float floatVar;
    private double doubleVar;
    private char charVar;
    private boolean booleanVar;

    public static void main(String[] args) {
        System.out.println("=== Primitive Data Type Ranges ===");
        System.out.println("byte     : " + Byte.MIN_VALUE     + " to " + Byte.MAX_VALUE);
        System.out.println("short    : " + Short.MIN_VALUE    + " to " + Short.MAX_VALUE);
        System.out.println("int      : " + Integer.MIN_VALUE  + " to " + Integer.MAX_VALUE);
        System.out.println("long     : " + Long.MIN_VALUE     + " to " + Long.MAX_VALUE);
        System.out.println("float    : " + Float.MIN_VALUE    + " to " + Float.MAX_VALUE);
        System.out.println("double   : " + Double.MIN_VALUE   + " to " + Double.MAX_VALUE);
        System.out.println("char     : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean  : " + Boolean.FALSE + " and " + Boolean.TRUE);

        System.out.println("\n=== Default Values of Primitive Types ===");
        PrimitiveRange obj = new PrimitiveRange();

        System.out.println("byte: " + obj.byteVar);
        System.out.println("short: " + obj.shortVar);
        System.out.println("int: " + obj.intVar);
        System.out.println("long: " + obj.longVar);
        System.out.println("float: " + obj.floatVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("char: [" + obj.charVar + "]");
        System.out.println("boolean: " + obj.booleanVar);
    }
}
