/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package arraysunidimensionales;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alvaro.rinpul
 */
public class Ejercicios {

    public static void Ej1() {

        int[] num = new int[12];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        System.out.println("Contenido del 'num': ");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Posicion " + i + ": " + num[i]);
        }
    }

    public static void Ej2() {

        char[] simbolo = new char[9];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        System.out.println("Contenido del 'simbolo': ");
        for (int i = 0; i < simbolo.length; i++) {
            System.out.println("Posicion " + i + ": " + simbolo[i]);
        }
    }

    public static void Ej3() {
        Scanner sc = new Scanner(System.in);
        int[] ordenInverso = new int[10];
        for (int i = 0; i < ordenInverso.length; i++) {
            System.out.println("Introduce un numero");
            ordenInverso[i] = sc.nextInt();
        }
        for (int i = ordenInverso.length; i > 0; i--) {
            System.out.println("Posicion " + i + " contiene: " + ordenInverso[i - 1]);
        }
        sc.close();
    }

    public static void Ej4() {
        int[] numero = new int[19];
        int[] cuadrado = new int[19];
        int[] cubo = new int[19];
        System.out.print("numero ");
        System.out.print(" cuadrado ");
        System.out.println(" cubo");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
            System.out.print(numero[i] + "\t");
            System.out.print(cuadrado[i] + "\t");
            System.out.println(cubo[i]);
        }
    }

    public static void Ej5() {
        Scanner sc = new Scanner(System.in);
        int numeroMayor = 0;
        int[] mayor = new int[9];
        for (int i = 0; i < mayor.length; i++) {
            System.out.println("Introduce un numero");
            mayor[i] = sc.nextInt();
            if (numeroMayor < mayor[i]) {
                numeroMayor = mayor[i];
            }
        }
        System.out.println(numeroMayor);
        sc.close();
    }

    public static void Ej6() {
        Scanner sc = new Scanner(System.in);
        int numeroApoyo = 0;
        int[] numero = new int[15];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce un numero");
            numero[i] = sc.nextInt();
        }
        System.out.println("Array original");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println();
        numeroApoyo = numero[14];
        for (int i = numero.length - 1; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = numeroApoyo;
        System.out.println("Array rotado");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        sc.close();
    }

    public static void Ej7() {
        Scanner sc = new Scanner(System.in);
        int numeroEliminado = 0;
        int numeroGenerado = 0;
        int[] numeroRandom = new int[100];
        for (int i = 0; i < 100; i++) {
            numeroRandom[i] = (int) (Math.random() * 21);
            System.out.print(numeroRandom[i] + " ");
        }
        System.out.println();
        System.out.println("Introduce un numero entre 1 y 20");
        numeroEliminado = sc.nextInt();
        System.out.println("Introduce el numero para reemplazar");
        numeroGenerado = sc.nextInt();
        for (int i = 0; i < numeroRandom.length; i++) {
            if (numeroEliminado == numeroRandom[i]) {
                numeroRandom[i] = numeroGenerado;
            }
            System.out.print("\""+numeroRandom[i] + "\" ");
        }
        sc.close();
    }

    public static void Ej8() {
        Scanner sc = new Scanner(System.in);
        int[] temperaturaMedia = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese la media del mes: " + (i + 1));
            temperaturaMedia[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (int j = 0; j < temperaturaMedia[i]; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void Ej9() {
        int[] valorRandom = new int[20];
        int[] auxPares = new int[20];
        int[] auxImpares = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < 20; i++) {
            valorRandom[i] = (int) (Math.random() * 100);
            System.out.print(valorRandom[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (valorRandom[i] % 2 == 0) {
                auxPares[contadorPares] = valorRandom[i];
                contadorPares++;
            } else {
                auxImpares[contadorImpares] = valorRandom[i];
                contadorImpares++;
            }
        }
        for (int i = 0; i < contadorPares; i++) {
            valorRandom[i] = auxPares[i];
        }
        for (int i = 0; i < contadorImpares; i++) {
            valorRandom[contadorPares + i] = auxImpares[i];
        }
        System.out.println("Array ordenado");
        for (int numero : valorRandom) {
            System.out.print(numero + " ");
        }
    }

    public static void Ej10() {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10];
        int[] auxPrimos = new int[10];
        int[] auxNoPrimos = new int[10];
        int cuentaPrimos = 0;
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Dato " + i + ": ");
            numero[i] = sc.nextInt();
        }
        System.out.println("Array original:");
        for (int num : numero) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            boolean esPrimo = true;
            if (numero[i] < 2) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numero[i]); j++) {
                    if (numero[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                auxPrimos[cuentaPrimos] = numero[i];
                cuentaPrimos++;
            } else {
                auxNoPrimos[i - cuentaPrimos] = numero[i];
            }
        }
        for (int i = 0; i < cuentaPrimos; i++) {
            numero[i] = auxPrimos[i];
        }
        for (int i = 0; i < 10 - cuentaPrimos; i++) {
            numero[cuentaPrimos + i] = auxNoPrimos[i];
        }
        System.out.println("Array ordenado (primos primero):");
        for (int num : numero) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        // Ej1();
        // Ej2();
        // Ej3();
        // Ej4();
        // Ej5();
        // Ej6();
        Ej7();
        // Ej8();
        // Ej9();
        // Ej10();
    }
}
