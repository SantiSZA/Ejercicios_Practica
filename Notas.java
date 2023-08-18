

import javax.swing.JOptionPane;

/**
 *
 * @author CEDENORTE
 */
public class Notas {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, suma, resultado;
        
   nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota "));
   nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota "));     
   nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota "));     
   nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite su cuarta nota "));   

   suma = nota1+nota2+nota3+nota4;
   resultado = suma/4;
           
   JOptionPane.showMessageDialog(null,"Su nota final es: "+ resultado);
    }
}
