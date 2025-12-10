/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensionales;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Ej7();
    }

    public static void Ej7() {
        Scanner sc = new Scanner(System.in);

        // --- 1. CONFIGURACIÓN INICIAL ---
        System.out.println("--- CONFIGURACIÓN DEL JUEGO ---");
        System.out.print("Introduce número de filas: ");
        int nFilas = sc.nextInt();
        System.out.print("Introduce número de columnas: ");
        int nCols = sc.nextInt();

        // Creamos la matriz con el tamaño elegido
        int[][] nums = new int[nFilas][nCols];
        
        // Constantes
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        
        int filaIntroducida, columnaIntroducida, vidas = 3;

        // --- 2. GENERACIÓN DEL TABLERO (Relleno aleatorio) ---
        for (int fila = 0; fila < nums.length; fila++) {
            for (int columna = 0; columna < nums[fila].length; columna++) {
                nums[fila][columna] = (int) (Math.random() * 3);
            }
        }

        // --- 3. MOSTRAR EL MAPA (Modo Trucos / Debug) ---
        // Esto muestra dónde está todo para que verifiques que funciona.
        // Usa \t (tabulador) para que las columnas no se tuerzan.
        System.out.println("\n--- MAPA DE RESPUESTAS ---");
        
        // A) Imprimir cabecera de números de columna
        System.out.print("\t"); // Hueco de la esquina superior izquierda
        for (int c = 0; c < nums[0].length; c++) {
            System.out.print(c + "\t"); // Imprime número + tabulador
        }
        System.out.println(); // Salto de línea

        // B) Imprimir filas con su índice a la izquierda
        for (int fila = 0; fila < nums.length; fila++) {
            
            System.out.print(fila + "\t"); // Imprime número de fila + tabulador
            
            for (int columna = 0; columna < nums[fila].length; columna++) {
                // Convertimos el número a un icono visual
                char icono = switch (nums[fila][columna]){
                    case VACIO -> '.'; // Uso punto para ver mejor la cuadrícula
                    case MINA -> '*';
                    case TESORO -> '€';
                    default -> '?';
                };
                System.out.print(icono + "\t"); // Imprime icono + tabulador
            }
            System.out.println(); // Salto de línea al terminar la fila
        }
        // -------------------------------------------------

        System.out.println("\n--- ¡EMPIEZA EL JUEGO! ---");

        // --- 4. BUCLE DEL JUEGO ---
        do {
            System.out.println("\nTe quedan " + vidas + " vidas.");
            
            // Validación de entrada para que no falle si pones un número raro
            do {
                System.out.print("Introduce la fila (0-" + (nums.length - 1) + "): ");
                filaIntroducida = sc.nextInt();
                System.out.print("Introduce la columna (0-" + (nums[0].length - 1) + "): ");
                columnaIntroducida = sc.nextInt();
                
                if(filaIntroducida < 0 || filaIntroducida >= nums.length || 
                   columnaIntroducida < 0 || columnaIntroducida >= nums[0].length){
                    System.out.println("¡Coordenadas fuera de rango! Intenta de nuevo.");
                }
                
            } while(filaIntroducida < 0 || filaIntroducida >= nums.length || 
                    columnaIntroducida < 0 || columnaIntroducida >= nums[0].length);


            // LÓGICA DE LA CASILLA
            int contenido = nums[filaIntroducida][columnaIntroducida];

            switch (contenido) {
                case MINA:
                    System.out.println("💥 ¡BOOM! Has caído en una MINA.");
                    vidas--;
                    nums[filaIntroducida][columnaIntroducida] = VACIO; // La mina explota
                    break;
                    
                case TESORO:
                    System.out.println("💰 ¡FELICIDADES! ¡Has encontrado un TESORO!");
                    nums[filaIntroducida][columnaIntroducida] = VACIO; // Recoges el tesoro
                    break;
                    
                default: // CASO VACÍO
                    System.out.println("💨 Espacio vacío...");
                    
                    // --- RADAR DE MINAS CERCANAS ---
                    boolean hayMinaCerca = false;
                    
                    // Revisamos desde fila-1 hasta fila+1 y col-1 hasta col+1
                    // Usamos Math.max y Math.min para no salirnos de los bordes del array
                    for (int f = Math.max(0, filaIntroducida - 1); f <= Math.min(nums.length - 1, filaIntroducida + 1); f++) {
                        for (int c = Math.max(0, columnaIntroducida - 1); c <= Math.min(nums[0].length - 1, columnaIntroducida + 1); c++) {
                            
                            // Si encontramos una mina en los alrededores
                            if (nums[f][c] == MINA) {
                                hayMinaCerca = true;
                            }
                        }
                    }
                    
                    if (hayMinaCerca) {
                        System.out.println("⚠️ ¡CUIDADO! El radar detecta una mina adyacente.");
                    }
                    break;
            }

        } while (vidas > 0);

        System.out.println("\n💀 Te has quedado sin vidas.");
        System.out.println("GAME OVER");
    }
}