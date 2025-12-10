/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvaro.rinpul
 */
public class Ejercicios {
    
    public static void Potenciar(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
            System.out.println(base + "^" + i + " = " + resultado);
        }
    }

    public static boolean EsPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void PintarPiramide(int altura, char caracter) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) System.out.print(" ");
            for (int k = 0; k < (i * 2) - 1; k++) System.out.print(caracter);
            System.out.println();
        }
    }

    public static void PintarPiramideHueca(int altura, char caracter) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) System.out.print(" ");     
            for (int k = 0; k < (i * 2) - 1; k++) {
                if (k == 0 || k == ((i * 2) - 2) || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void ProcesarEstadisticas(Scanner sc) {
        int numero;
        int contador = 0;
        int sumaImpares = 0, cuentaImpares = 0;
        int mayorPar = Integer.MIN_VALUE;
        System.out.println("Introduce números (negativo para terminar):");
        while (true) {
            numero = sc.nextInt();
            if (numero < 0) break; 
            contador++;
            if (numero % 2 != 0) {
                sumaImpares += numero;
                cuentaImpares++;
            } else {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
        }
        System.out.println("Total números introducidos: " + contador);
        if (cuentaImpares > 0) {
            System.out.println("Media de impares: " + (double)sumaImpares / cuentaImpares);
        } else {
            System.out.println("No hubo impares.");
        }  
        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("Mayor de los pares: " + mayorPar);
        } else {
            System.out.println("No hubo pares.");
        }
    }


    public static void PintarPiramideNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print(k);
            for (int k = i - 1; k >= 1; k--) System.out.print(k);
            System.out.println();
        }
    }


    public static long CalcularFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }


    public static int DiaANumero(String dia) {
        switch (dia.toLowerCase()) {
            case "1": case "lunes": return 1;
            case "2": case "martes": return 2;
            case "3": case "miercoles": case "miércoles": return 3;
            case "4": case "jueves": return 4;
            case "5": case "viernes": return 5;
            case "6": case "sabado": case "sábado": return 6;
            case "7": case "domingo": return 7;
            default: return 0;
        }
    }

    public static void CalcularDiferenciaHoras(int d1, int h1, int d2, int h2) {
        int totalHoras1 = (d1 - 1) * 24 + h1;
        int totalHoras2 = (d2 - 1) * 24 + h2;

        if (totalHoras2 <= totalHoras1) {
            System.out.println("Error: El segundo momento debe ser posterior al primero.");
        } else {
            System.out.println("Entre las dos fechas hay " + (totalHoras2 - totalHoras1) + " hora(s).");
        }
    }

    public static void Ej1() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce la base: ");
            int base = sc.nextInt();
            System.out.print("Introduce el exponente: ");
            int exponente = sc.nextInt();
            Potenciar(base, exponente);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un numero entero");
            sc.nextInt();
        }
    }


    public static void Ej2() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Introduce un número para saber si es primo: ");
            int numero = sc.nextInt();
            if (EsPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor posible");
            sc.nextInt();
        }
        sc.close();
    }

    public static void Ej3() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce la altura de la pirámide: ");
            int altura = sc.nextInt();
            System.out.print("Introduce el carácter para pintar la pirámide: ");
            char caracter = sc.next().charAt(0);
            PintarPiramide(altura, caracter);
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor posible");
            sc.nextInt();
        }
        
        sc.close();
    }


    public static void Ej4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide hueca: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el carácter para pintar la pirámide hueca: ");
        char caracter = sc.next().charAt(0);
        PintarPiramideHueca(altura, caracter);
        sc.close();
    }


    public static void Ej5() {
        Scanner sc = new Scanner(System.in);
        ProcesarEstadisticas(sc);
        sc.close();
    }


    public static void Ej6() {
        System.out.println("Números primos entre 2 y 100:");
        for (int i = 2; i <= 100; i++) {
            if (EsPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void Ej7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N para la pirámide numérica: ");
        int n = sc.nextInt();
        PintarPiramideNumeros(n);
        sc.close();
    }

    public static void Ej8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número >= 0 para el factorial: ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("El factorial de " + n + " es " + CalcularFactorial(n));
        } else {
            System.out.println("El número debe ser mayor o igual a 0.");
        }
        sc.close();
    }

    public static void Ej9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer día (nombre o número): ");
        String dia1 = sc.next();
        System.out.print("Introduce la hora del primer día (0-23): ");
        int hora1 = sc.nextInt();
        System.out.print("Introduce el segundo día (nombre o número): ");
        String dia2 = sc.next();
        System.out.print("Introduce la hora del segundo día (0-23): ");
        int hora2 = sc.nextInt();

        int d1 = DiaANumero(dia1);
        int d2 = DiaANumero(dia2);

        if (d1 == 0 || d2 == 0 || hora1 < 0 || hora1 > 23 || hora2 < 0 || hora2 > 23) {
            System.out.println("Error: Entrada inválida.");
        } else {
            CalcularDiferenciaHoras(d1, hora1, d2, hora2);
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        //Ej1();
        //Ej2();
        Ej3();
        //Ej4();
        //Ej5();
        //Ej6();
        //Ej7();
        //Ej8();
        //Ej9();
    }
}
