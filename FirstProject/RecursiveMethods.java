
public class RecursiveMethods  {
    //1[INCOMPLETE]
    public static String grid(int w, int h, String symbol) {
        /*if (w == 1) {
            if (h == 1) {
                return symbol;
            }
            else {
                return grid(w, h - 1, symbol) + "\n";
            }
        }
        else {
            if (h == 1) {
                return symbol + grid(w - 1, h, symbol);
            }
            //fix this v
            else {
                return grid(w, h - 1, symbol + grid(w - 1, h, symbol));
            }
        }*/
        int position = w;
        if (h == 0 && position == 0) {
            return symbol;
        }
        else if (position == 0) {
            return "\n" + grid(w, h - 1, symbol);
        }
        else {
            return symbol + grid(position - 1, h, symbol);
        }
    }
    
    //2
    public static int mul(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return a + mul(a, b - 1);
        }
    }
    
    //3[INCOMPLETE]
    /*public static int bintToDec(String b) {
        if (
    }*/
}
