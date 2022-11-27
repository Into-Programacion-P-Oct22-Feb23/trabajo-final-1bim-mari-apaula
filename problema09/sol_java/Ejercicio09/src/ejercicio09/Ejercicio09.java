/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        
         int numero_grupo=1;
        int parejas =1; 
        String s1="s1=";
       

        while(numero_grupo <= 4){ 
         while(parejas <= 2){

             if(parejas %2==0){ 
                 s1=s1+(numero_grupo*11);
                 s1=s1+"+"; 
             }else{
                 s1=s1+(numero_grupo*12); 
                 s1=s1+"-"; 
             }
             parejas++; 
         }
            parejas=1; 
            numero_grupo++; 

        }
        System.out.println(s1); 

    }
    
}
