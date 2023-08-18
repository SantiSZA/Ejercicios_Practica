
import javax.swing.JOptionPane;


/**
 *
 * @author CEDENORTE
 */
public class Pablo {
    public static void main(String[] args) {
        int pablo, jose, pabloyjose, miguel;
    pablo = Integer.parseInt(JOptionPane.showInputDialog("Pablo tiene: "));
    jose = pablo*2;
    pabloyjose = pablo+jose;
    miguel = pabloyjose/2;
    
    JOptionPane.showMessageDialog(null,"pablo tiene: "+pablo+"\n"+"jose tiene: "+jose+"\n"+"miguel tiene: "+miguel);
    
    }
 
}
