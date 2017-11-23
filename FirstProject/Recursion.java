
public class Recursion {
    //returns string with the indicated amount amount of indicated symbols 
    public static String stringy(String sym, int times) {
        if (times == 0) {
            return "";
        }
        else {
            return sym + stringy(sym, times - 1);
        }
    }
    
    //exponents(positive only)
    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        else {
            return base*pow(base, power - 1);
        }
    }
    
    //factorials
    public static int factorial(int base) {
        if (base == 1) {
            return 1;
        }
        else {
            return base*factorial(base - 1);
        }
    }
}
