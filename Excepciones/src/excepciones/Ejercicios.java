/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alvaro.rinpul
 */
public class Ejercicios {

    public static void Ej1() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        boolean datosValidos = false;
        System.out.println("--- EJERCICIO 1 ---");
        while (!datosValidos) {
            try {
                System.out.print("Introduce el primer número: ");
                n1 = sc.nextInt();
                System.out.print("Introduce el segundo número: ");
                n2 = sc.nextInt();
                System.out.print("Introduce el tercer número: ");
                n3 = sc.nextInt();
                datosValidos = true;      
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir números enteros.");
                System.out.println("Tienes que empezar desde el principio.");
                sc.nextLine();
            }
        }
        System.out.println("Éxito: " + n1 + ", " + n2 + ", " + n3);
        sc.close();
    }
    
    public static void Ej2() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        boolean valido = false;
        System.out.println("--- EJERCICIO 2 ---");
        while (!valido) {
            try {
                System.out.print("Introduce el primer número: ");
                n1 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en N1. Inténtalo de nuevo.");
                sc.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el segundo número: ");
                n2 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en N2. Inténtalo de nuevo.");
                sc.nextLine(); 
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el tercer número: ");
                n3 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en N3. Inténtalo de nuevo.");
                sc.nextLine(); 
            }
        }
        System.out.println("Éxito: " + n1 + ", " + n2 + ", " + n3);
        sc.close();
    }
    
    public static void Ej3() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        boolean valido = false;
        System.out.println("--- EJERCICIO 3 ---");
        while (!valido) {
            try {
                System.out.print("Introduce el primer numero: ");
                n1 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: El dato introducido no es un numero entero.");
                sc.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el segundo numero: ");
                n2 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: El dato introducido no es un numero entero.");
                sc.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el tercer numero: ");
                n3 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: El dato introducido no es un numero entero.");
                sc.nextLine();
            }
        }
        System.out.println("Los numeros leidos son: " + n1 + ", " + n2 + ", " + n3);
        sc.close();
    }
    
    public static void Ej4() {
        Scanner sc = new Scanner(System.in);
        int i1 = 0;
        int i2 = 0;
        String texto = "";
        double d1 = 0.0;
        double d2 = 0.0;
        boolean valido = false;
        System.out.println("--- EJERCICIO 4 ---");
        while (!valido) {
            try {
                System.out.print("Introduce el primer entero: ");
                i1 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Dato no valido");
                sc.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el segundo entero: ");
                i2 = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Dato no valido");
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.print("Introduce el texto: ");
        texto = sc.nextLine();
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el primer decimal: ");
 
                d1 = sc.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Dato no valido (usa coma o punto según tu sistema)");
                sc.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce el segundo decimal: ");
                d2 = sc.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Dato no valido");
                sc.nextLine();
            }
        } 
        System.out.println("Resultados:");
        System.out.println("Enteros: " + i1 + ", " + i2);
        System.out.println("Texto: " + texto);
        System.out.println("Decimales: " + d1 + ", " + d2);
        sc.close();
    }
    
    public static void Ej5() {
        Scanner sc = new Scanner(System.in);
        double n;
        int posicion;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("--- EJERCICIO 5 ---");
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        try {
            System.out.print(" la posición del array a modificar: ");
            cadena = sc.nextLine();
            posicion = Integer.parseInt(cadena);
            System.out.print("Introduce el nuevo valor de la posición " + posicion + ": ");
            n = sc.nextDouble();
            valores[posicion] = n;
            System.out.println("Posición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada de la posicion no es un numero entero valido.");
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor introducido no es un numero decimal valido.");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El indice de la posicion esta fuera del rango del array.");
        }
        sc.close();
    }
    
    
    
    public static void main(String[] args) {
        //Ej1();
        //Ej2();
        //Ej3();
        //Ej4();
        Ej5();    
    }
}
