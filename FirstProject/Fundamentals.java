
public class Fundamentals
{
    public static void main(String[] args) {
        System.out.println("APCS Fundamentals 1\n");
        
        System.out.println("----------------\n" + "dataTypes\n");
        dataTypes();
        
        System.out.println("----------------\n" + "Calling add and multiply methods using hard coded variables as arguments.\n\nFor integers:");
        int sum1 = add(6, 2);
        int prod1 = mul(6, 2);
        System.out.println("6 + 2 = " + sum1 + "\n6 * 2 = " + prod1 + "\n");
        
        System.out.println("For doubles:");
        double sum2 = add_d(6.1d, 2.3d);
        double prod2 = mul_d(6.1d, 2.3d);
        System.out.println("6.1 + 2.3 = " + sum2 + "\n6.1 * 2.3 = " + prod2 + "\n");
        
        System.out.println("----------------\n" + "Calling subtract and divide methods using user inpot variables as arguments.");
    }
    
    //Data Types
    public static void dataTypes() {
        String booldesc = "i. boolean\nBoolean data type represents one bit of information with two possible values: true of false (1 or 0). Its default value is False.\n";
        String bytedesc = "ii. byte\nByte data is an 8-bit signed two's compliment integer that has a minimu value of -128 and maximum of 127(inclusive).\nIts default value is 0.\n";
        String chardesc = "iii. char\nChar data type is a single 16-bit Unicode character ranging from 0 to 65,535 inclusive.\n";
        String shortdesc = "iv. short\nShort data is 16-bit signed two's compliment integer ranging from -32,768 to 32,767 (inclusive). Its default value is zero.\n";
        String intdesc = "v. int\nint stands for integer. It is a 32-bit signed two's complent integer ranging from -2^31 to 2^31 - 1 (inclusive). Its default value is 0.\n";
        String longdesc = "vi. long\nLong data type is a 64-bit signed two's complement integer ranging from -2^63 to 2^63 - 1 (inclusive). Its default value is 0L.\n";
        String floatdesc = "vii. float\nFloat data type is a single-precision 32-bit IEEE 754 floating point. Its default value is 0.0f.\n";
        String doubledesc = "viii. double\nDouble data type is a double-precision 64-bit IEEE 754 floating point. Its default value is 0.0d\n";
        
        System.out.println(bytedesc + "\n" + bytedesc + "\n" + chardesc + "\n" + shortdesc + "\n" + intdesc + "\n" + longdesc + "\n" + floatdesc + "\n" + doubledesc);
    }
    
    //mathematical functions for integers
    public static int add(int a, int b) {
        int sum = a + b;
        
        return sum;
    }
    
    public static int sub(int a, int b) {
        int diff = a - b;
        
        return diff;
    }
    
    public static int mul(int a, int b) {
        int prod = a*b;
        
        return prod;
    }
    
    public static int div(int a, int b) {
        int quo = a/b;
        
        return quo;
    }
    
    //mathematical functions for doubles
    public static double add_d(double a, double b) {
        double sum = a + b;
        
        return sum;
    }
    
    public static double sub_d(double a, double b) {
        double diff = a - b;
        
        return diff;
    }
    
    public static double mul_d(double a, double b) {
        double prod = a*b;
        
        return prod;
    }
    
    public static double div(double a, double b) {
        double quo = a/b;
        
        return quo;
    }
    
    
}