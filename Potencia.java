
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CEDENORTE
 */
public class Potencia {
    public static void main(String[] args) {
        
       int num1, num2, cubo;
       
       
 num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero a elevar"));
 num2 = Integer.parseInt(JOptionPane.showInputDialog("escriba el valor de la potencia"));
 cubo = (int) Math.pow(num1,num2);
        
 JOptionPane.showMessageDialog(null,num1+" elevado a "+num2+" es igual a: "+cubo);
        
    }

    
    }

