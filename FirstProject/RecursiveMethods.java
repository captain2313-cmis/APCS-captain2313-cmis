
public class RecursiveMethods  {
    //1
    public static String grid(int w, int h, String symbol) {
        if (w == 1) {
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
        }
    }
}
