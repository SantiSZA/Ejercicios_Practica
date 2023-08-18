
import javax.swing.JOptionPane;


/**
 *
 *Santiago Zapata
 */
public class Redondear {
    public static void main(String[] args) {
     double num1, redondear;
     
 num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor a redondear"));
        
 redondear = Math.round(num1);
 
 JOptionPane.showMessageDialog(null,"su numero reondeado es: "+redondear);
        
        
        
        
    }
}
