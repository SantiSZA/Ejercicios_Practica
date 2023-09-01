

import java.util.Random;
import java.util.Scanner;


public class contraseña {
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
        int longitud ;
      
        System.out.print("ingrese la longitud de clave");
        longitud = teclado.nextInt();
        
        if (longitud <= 0){
            System.out.println("Pailas");
        }else {
           String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&=?@,.;:-_[]^^``~+*'¿¡";
        
         Random aleatorio = new Random();
         
         StringBuilder claveGenerada = new StringBuilder();
            
            for (int i = 1;i<= longitud; i++){
                
               int indiceAleatorio = aleatorio.nextInt(caracteres.length());
            
            char caracterAleatorio = caracteres.charAt(indiceAleatorio);
            
            claveGenerada.append(caracterAleatorio);
            }
                     
        System.out.println("La clave generada es: "+claveGenerada.toString());
}}
   
}
