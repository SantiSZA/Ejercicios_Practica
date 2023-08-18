
import javax.swing.JOptionPane;


/**
 *
 * santiago zapata alzate
 */
public class NumeroHoras {
    public static void main(String[] args) {
    int horas, dias, semana, residuo1, residuo2;

horas = Integer.parseInt(JOptionPane.showInputDialog("digite las horas"));
dias = horas/24;
residuo1 = horas%24;
semana = dias/7;
residuo2 = dias%7;

JOptionPane.showMessageDialog(null,"las horas son equivalentes a: "+semana+" semanas "+residuo2+"d y "+residuo1+" h " );
     
        


        
    }
}
