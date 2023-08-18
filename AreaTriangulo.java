
import javax.swing.JOptionPane;


/**
 *
 * Santiago Zapata
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        
 int num1, num2, area;
 
 num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura del triangulo"));
 num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ancho del triangulo"));
        
    area =(num1*num2)/2 ;   
 JOptionPane.showMessageDialog(null,"el area del triangulo es: "+area);
    }
  
            
}
