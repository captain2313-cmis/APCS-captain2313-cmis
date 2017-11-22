
public class Recursion {
    public static String stringy(String sym, int times) {
        if (times == 0) {
            return "";
        }
        else {
            return sym + stringy(sym, times - 1);
        }
    }
}
