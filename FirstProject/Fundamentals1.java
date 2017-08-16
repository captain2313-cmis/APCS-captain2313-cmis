
/**
 * Write a description of class Fundamentals1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundamentals1
{
    public static void main(String[] args) {
        //System.out.Println("
    }
    
    public static void dataTypes() {
        String booldesc = "boolean\nBoolean data type represents one bit of information with two possible values: true of false (1 or 0). Its default value is False.";
        String bytedesc = "byte\nByte data is an 8-bit signed two's compliment integer that has a minimu value of -128 and maximum of 127(inclusive).\nIts default value is 0.";
        String chardesc = "char\nChar data type is a single 16-bit Unicode character ranging from '\u0000' (0) to '\uffff' (65,535 inclusive).";
        String shortdesc = "short\nShort data is 16-bit signed two's compliment integer ranging from -32,768 to 32,767 (inclusive). Its default value is zero.";
        String intdesc = "int\nint stands for integer. It is a 32-bit signed two's complent integer ranging from -2^31 to 2^31 - 1 (inclusive). Its default value is 0.";
        String longdesc = "long\nLong data type is a 64-bit signed two's complement integer ranging from -2^63 to 2^63 - 1 (inclusive). Its default value is 0L.";
        String floatdesc = "float\nFloat data type is a single-precision 32-bit IEEE 754 floating point. Its default value is 0.0f.";
        String doubledesc = "double\nDouble data type is a double-precision 64-bit IEEE 754 floating point. Its default value is 0.0d";
        
        System.out.println(bytedesc + "\n" + bytedesc + "\n" + chardesc + "\n" + shortdesc + "\n" + intdesc + "\n" + longdesc + "\n" + floatdesc + "\n" + doubledesc);
    }
}