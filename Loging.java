
package agosto1808;

import javax.swing.JOptionPane;

/**
 *
 * @author CEDENORTE
 */
public class Loging {
    public static void main(String[] args) {
        
     String user, password;
     user = "santiago";
     password = "123";
  
  String nombre = JOptionPane.showInputDialog("ingrese su usuario");
  String clave = JOptionPane.showInputDialog("ingrese su contraseña");        
  
      
  if (nombre .equals(user) && clave .equals(password)){
      
          JOptionPane.showMessageDialog(null,"BIENVENIDO "+user);
     
    }
  else if (nombre .equals(user)){
      
      JOptionPane.showMessageDialog(null,"Contraseña invalida" );
   
  } else if (clave .equals(password)) {
  
       JOptionPane.showMessageDialog(null,"Usuario invalida" );
  
          }else {
  
           JOptionPane.showMessageDialog(null,"Usuario y contraseña invalido" );
  }
    
    } 
}
