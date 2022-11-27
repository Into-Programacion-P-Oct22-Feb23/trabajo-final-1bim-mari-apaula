/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero_mayor;

        
        System.out.println("Ingrese un número");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un número");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese un número");
        numero3 = entrada.nextInt();
        
        if (numero1 == numero2){
            System.out.println("Error.Intente de nuevo");
            System.out.println("Ingrese un número");
            numero1 = entrada.nextInt();
            }else{
               if (numero2 == numero3){
                System.out.println("Error.Intente de nuevo");
                System.out.println("Ingrese un número");
                numero2 = entrada.nextInt(); 
               }else{
                   if (numero1 == numero3){
                       System.out.println("Error.Intente de nuevo");
                       System.out.println("Ingrese un número");
                       numero3 = entrada.nextInt(); 
                       
                   }
               }
            
        }
   
        if(numero1 > numero2){
            numero_mayor = numero1;
        }else{ 
            numero_mayor = numero2;
        }
        if (numero_mayor > numero3){
            numero_mayor = numero_mayor;
            }else{
            numero_mayor = numero3;
        }
         System.out.printf("El número mayor es: %d\n", numero_mayor);
            
          
            
        
    }
    
}
