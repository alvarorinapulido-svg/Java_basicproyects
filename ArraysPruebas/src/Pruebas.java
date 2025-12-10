/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alvaro.rinpul
 */
public class Pruebas {
    
    
    public static void main(String[] args) {
    
        int[] numeros=new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
        }
        for (int i = numeros.length; i > 0;i--){
            System.out.println(numeros[i-1]);
        }
        
        
        
    }
    
    
}
