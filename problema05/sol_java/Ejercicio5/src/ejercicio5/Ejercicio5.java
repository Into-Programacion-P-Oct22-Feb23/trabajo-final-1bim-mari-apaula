/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de X: ");
        x = scanner.nextInt();
        System.out.println("Ingrese el valor de Y: ");
        y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") se encuentra en el primer cuadrante.");
        } else{
            if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") se encuentra en el segundo cuadrante.");
             } else{
                if (x < 0 && y < 0) {
                System.out.println("El punto (" + x + ", " + y + ") se encuentra en el tercer cuadrante.");
                } else{
                    if (x > 0 && y < 0) {
                    System.out.println("El punto (" + x + ", " + y + ") se encuentra en el cuarto cuadrante.");
                    } else{
                       if (x == 0 && y == 0) {
                       System.out.println("El punto (" + x + ", " + y + ") se encuentra en el origen.");
                       } else{
                           if (x == 0 && y != 0) {
                           System.out.println("El punto (" + x + ", " + y + ") se encuentra sobre el eje Y.");
                           } else{
                               if (x != 0 && y == 0) {
                               System.out.println("El punto (" + x + ", " + y + ") se encuentra sobre el eje X.");
                       }
                                }
                            }
                        }
                     }
                 }
             }
         }
     }
            
   
