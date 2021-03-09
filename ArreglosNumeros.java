/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosnumeros;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class ArreglosNumeros {

    /**
     * @param args the command line arguments
     */
    
    //Declarar array privado
    private static int numeros[] = {7,0,9,8,1,4,6,2,3,5};
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arreglo sin orden");
        
        for (int num : numeros){
            System.out.println(num);
        }
        
        System.out.println("Arreglo ordenado");
            
        Arrays.sort(numeros);
        for(int num: numeros){
            System.out.println(num);
        }
    }
}
