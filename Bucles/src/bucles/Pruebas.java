/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            // Bucle para imprimir los espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Bucle para imprimir los asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Salto de línea
            System.out.println();
        }
        scanner.close();
    }
}