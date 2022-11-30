/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int auxiliar=0;
        int suma = 0;
        System.out.println("Ingrese un número par");
        numero = scanner.nextInt();
        auxiliar=numero;
        if (numero < 2 || numero % 2 != 0) {
            System.out.println("Error. El número debe ser mayor o igual a "
                    + "2 y par");
        } else {
            while (numero >= 2) {
                suma += numero;
                numero -= 2;
            }
            System.out.println("La suma de los números pares del 2 hasta el número "+auxiliar+" es: " + suma);
        }


    }
    
}
