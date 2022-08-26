package datatypes;

public class DataTypes {

    public void printPrimitiveTypes(){

        byte byteType = 127;
        System.out.println("byte type: " + byteType); //Print 1227
        short shortType = 32767;
        System.out.println("short type: " + shortType); // Print 32767
        int intType = 22222222;
        System.out.println("int type: " + intType); // Print 22222222
        long longType = 333333333;
        System.out.println("long type: " + longType); // Print 333333333
        float floatType = 16.f;
        System.out.println("float type: " + floatType); // Print 16.0
        double doubleType = 1525478.2;
        System.out.println("double type: " + doubleType); // Print 1525478.2
        char charType = 'a';
        System.out.println("char type: " + charType); // Print a
        boolean booleanType = true;
        System.out.println("boolean type: " + booleanType); // Print true
    }

    /**
     * Object types allow nulls
     */
    public void printObjectTypes(){
        Byte byteType = null;
        System.out.println("byte type: " + byteType); //Print 1227
        Short shortType = null;
        System.out.println("short type: " + shortType); // Print 32767
        Integer intType = null;
        System.out.println("int type: " + intType); // Print 22222222
        Long longType = null;
        System.out.println("long type: " + longType); // Print 333333333
        Float floatType = null;
        System.out.println("float type: " + floatType); // Print 16.0
        Double doubleType = null;
        System.out.println("double type: " + doubleType); // Print 1525478.2
        Character charType = null;
        System.out.println("char type: " + charType); // Print a
        Boolean booleanType = null;
        System.out.println("boolean type: " + booleanType); // Print true
    }
}
