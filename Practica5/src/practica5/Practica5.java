/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;


/**
 *
 * @author venm9
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1= 1;
        int num2= 2;
        int contador=1;
        while (contador < 47){
            int num3= num2 + num1;
            num1 = num2;
            num2 = num3;
            contador += 1; 
        }
        System.out.println(num1);
    }
    
}
