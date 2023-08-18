
package agosto1808;

import javax.swing.JOptionPane;

/**
 *
 * Santiago zapata
 */
public class Fiebre {
    public static void main(String[] args) {
        
    double temp;

temp = Integer.parseInt(JOptionPane.showInputDialog("Tome su temperatura e ingresela"));
        
     if (temp<36){
        JOptionPane.showMessageDialog(null,"No tiene fiebre");
        
    } else if ((temp>35)&&(temp<40)){
     
         JOptionPane.showMessageDialog(null,"Tienes fiebre, ve al medico");
     
    } else {
        
        JOptionPane.showMessageDialog(null,"Pague funeraria");
    
        
    }
    }
}
