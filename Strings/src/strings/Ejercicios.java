/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author alvaro.rinpul
 */
public class Ejercicios {

    //Solicita al usuario una frase y muestra el número de vocales que contiene.
        
    public static void Ej1() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduce tu frase");
        String frase = sc.nextLine();
        int contador = 0;
        for(int i=0;i<frase.length();i++){
            char caracter = frase.charAt(i);  
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
        }
        System.out.println("Tienes "+contador+" vocales");
        sc.close();
    }
    
    //Solicita al usuario una palabra y muéstrala invertida sin usar StringBuilder.

    public static void Ej2() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        String palabraInvertida = "";
        for(int i=palabra.length()-1;i>=0;i--){
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println("Palabra invertida: "+palabraInvertida);
        sc.close();
    }

    //Pide dos frases y comprueba si son iguales ignorando mayúsculas 

    public static void Ej3() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera frase");
        String frase1 = sc.nextLine();
        System.out.println("Introduce la segunda frase");
        String frase2 = sc.nextLine();
        if(frase1.equalsIgnoreCase(frase2)){
            System.out.println("Las frases son iguales");
        }else{
            System.out.println("Las frases son diferentes");
        }
        sc.close();
    }

    //Solicita una dirección de correo y extrae el dominio 

    public static void Ej4() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una direccion de correo");
        String correo = sc.nextLine();
        int arrobaIndex = correo.indexOf('@');
        if(arrobaIndex != -1){
            String dominio = correo.substring(arrobaIndex + 1);
            System.out.println("El dominio es: "+dominio);
        }else{
            System.out.println("La dirección de correo no es válida");
        }
        sc.close();
    }

    //Convierte todas las letras 'a' en '@' 

    public static void Ej5() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String fraseModificada = frase.replace('a', '@').replace('A', '@');
        System.out.println("Frase modificada: "+fraseModificada);
        sc.close();
    }

    //Solicita un nombre, elimina espacios y muestra un saludo en mayúsculas usando 

    public static void Ej6() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        String nombreSinEspacios = nombre.replace(" ", "");
        String saludo = "HOLA " + nombreSinEspacios.toUpperCase() + "";
        System.out.println(saludo);
        sc.close();
    }

    //Divide una frase en palabras y muestra el número de palabras.

    public static void Ej7() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String[] palabras = frase.trim().split("\\s+");
        System.out.println("Número de palabras: " + palabras.length);
        sc.close();
    }

    //Pide un texto y una palabra, y muestra cuántas veces aparece.

    public static void Ej8() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = sc.nextLine();
        System.out.println("Introduce una palabra a buscar");
        String palabra = sc.nextLine();
        String[] palabras = texto.split("\\s+");
        int contador = 0;
        for(String p : palabras){
            if(p.equals(palabra)){
                contador++;
            }
        }
        System.out.println("La palabra '"+palabra+"' aparece "+contador+" veces.");
        sc.close();
    }

    //Comprueba que una contraseña tenga al menos 8 caracteres, una mayúscula, una minúscula y un número. 

    public static void Ej9() {  
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña");
        String contrasena = sc.nextLine();
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        if(contrasena.length() >= 8){
            for(int i=0;i<contrasena.length();i++){
                char c = contrasena.charAt(i);
                if(Character.isUpperCase(c)){
                    tieneMayuscula = true;
                }else if(Character.isLowerCase(c)){
                    tieneMinuscula = true;
                }else if(Character.isDigit(c)){
                    tieneNumero = true;
                }
            }
            if(tieneMayuscula && tieneMinuscula && tieneNumero){
                System.out.println("Contraseña válida");
            }else{
                System.out.println("La contraseña debe tener al menos una mayúscula, una minúscula y un número.");
            }
        }else{
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }
        sc.close();
    }   
    
     
    public static void main(String[] args) {
        //Ej1();
        //Ej2();
        //Ej3();
        //Ej4();
        //Ej5();
        //Ej6();
        //Ej7();
        //Ej8();
        //Ej9();

        
    }
}
