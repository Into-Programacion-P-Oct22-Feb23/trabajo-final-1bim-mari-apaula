/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int trajes;
        double precio_unitario;
        double subtotal = 0;
        double total = 0;
        int descuento = 0;
        System.out.println("Ingrese la cantidad de trajes adquiridos");
        trajes = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del traje");
        precio_unitario = entrada.nextDouble();
        if (trajes == 1){ 
            descuento = 20;
            subtotal = precio_unitario;
            total = (precio_unitario * descuento) / 100;
            }else{ 
            if (trajes ==2){
                descuento = 25;
                subtotal = precio_unitario * trajes;
                total = (precio_unitario * descuento)/ 100;
                }else{ 
                 if (trajes == 3){
                    descuento = 40;
                    subtotal = precio_unitario * trajes;
                    total = (precio_unitario * descuento )/ 100;
                    }else{
                     if (trajes > 3){
                         descuento = 50;
                         subtotal = precio_unitario * trajes;
                         total = (precio_unitario * descuento)/ 100;
                     }
                    
                 }
                 
             }
          
            
        }
        System.out.printf("Trajes comprados: %d\nEl precio unitario "
                + "es de: %.2f\nSubtotal: %.2f\nEl descuento es del: %d "
                + "por ciento\nTotal: %.2f\n",trajes,precio_unitario,
                subtotal,descuento,total); 
        
    }
    
}
