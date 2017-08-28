import javax.swing.JOptionPane;
public class WDID1
{
    public static void main(String[] args){
        String r = "";
        int f = Integer.parseInt(JOptionPane.showInputDialog("?:"));
        for(int i = 0; i < f; i++){
            for(int j = 0; j < f-i; j++){
                int k = f+j;
                while( k >= 0 ){
                    r += "#";
                    k--;
                }
                r+="\n";
            }
        }
        System.out.println(r);
    }
}      