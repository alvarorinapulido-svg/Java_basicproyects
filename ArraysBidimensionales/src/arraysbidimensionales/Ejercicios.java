/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysbidimensionales;

import java.util.Scanner;

/**
 *
 * @author alvaro.rinpul
 */
public class Ejercicios {
    
    public static void Ej1() {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        System.out.println("\t"+"Col 0   Col 1   Col 2   Col 3   Col 4   Col 5");

        for (int i = 0; i < num.length; i++){
            System.out.print("Fila "+i+"\t");
            for (int j = 0; j < num[i].length;j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void Ej2() {
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[5][6];
        for (int fila = 0; fila < nums.length - 1; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                System.out.println("Introduce numero ");
                nums[fila][columna] = sc.nextInt();
            }
        }
        for (int fila = 0; fila < nums.length - 1; fila++) {
            int sumatorioHorizontal = 0;
            for (int columna = 0; columna < nums[fila].length - 1; columna++) {
                System.out.print(nums[fila][columna] + "\t");
                sumatorioHorizontal += nums[fila][columna];
            }
            System.out.println(sumatorioHorizontal);
        }
        for (int columna = 0; columna < nums[0].length - 1; columna++) {
            int sumatorioVertical = 0;
            for (int fila = 0; fila < nums.length - 1; fila++) {
                sumatorioVertical += nums[fila][columna];
            }
            System.out.print(sumatorioVertical + "\t");
            nums[4][5] += sumatorioVertical;
        }
        System.out.println(nums[4][5]);
        sc.close();
    }
    

    public static void Ej3() {
        int[][] nums = new int[5][6];
        for (int fila = 0; fila < nums.length - 1; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                nums[fila][columna] = (int) (Math.random() * 900)+100;
            }
        }
        for (int fila = 0; fila < nums.length - 1; fila++) {
            int sumatorioHorizontal = 0;
            for (int columna = 0; columna < nums[fila].length - 1; columna++) {
                System.out.print(nums[fila][columna] + "\t");
                sumatorioHorizontal += nums[fila][columna];
            }
            System.out.println(sumatorioHorizontal);
        }
        for (int columna = 0; columna < nums[0].length - 1; columna++) {
            int sumatorioVertical = 0;
            for (int fila = 0; fila < nums.length - 1; fila++) {
                sumatorioVertical += nums[fila][columna];
            }
            System.out.print(sumatorioVertical + "\t");
            nums[4][5] += sumatorioVertical;
        }
        System.out.println(nums[4][5]);
    }

    public static void Ej4() {
        int[][] nums = new int[5][6];
        for (int fila = 0; fila < nums.length - 1; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                nums[fila][columna] = (int) (Math.random() * 900)+100;
            }
        }
        for (int fila = 0; fila < nums.length - 1; fila++) {
            int sumatorioHorizontal = 0;
            for (int columna = 0; columna < nums[fila].length - 1; columna++) {
                System.out.print(nums[fila][columna] + "\t");
                sumatorioHorizontal += nums[fila][columna];
            }
            System.out.println(sumatorioHorizontal);
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        for (int columna = 0; columna < nums[0].length - 1; columna++) {
            int sumatorioVertical = 0;
            for (int fila = 0; fila < nums.length - 1; fila++) {
                sumatorioVertical += nums[fila][columna];
            }
            System.out.print(sumatorioVertical + "\t");
            nums[4][5] += sumatorioVertical;
        }
        System.out.println(nums[4][5]);
    }
    

    public static void Ej5() {
        int[][] nums = new int[6][10];
        int numMax = 0, numMin = 1000, numMaxX = -1, numMaxY = -1, numMinX = -1, numMinY = 0;
        for (int fila = 0; fila < nums.length; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                nums[fila][columna] = (int) (Math.random() * 1001);
            }
        }
        for (int fila = 0; fila < nums.length; fila++) {
            System.out.print("Fila "+(fila)+"\t");
            for (int columna = 0; columna < nums[fila].length - 1; columna++) {
                System.out.print("\t"+nums[fila][columna] + "\t");
            }
            System.out.println();
        }
        for (int fila = 0; fila < nums.length; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                if (numMax<=nums[fila][columna]) {
                    numMax=nums[fila][columna];
                    numMaxX = fila;
                    numMaxY = columna;
                }
                if (numMin>=nums[fila][columna]) {
                    numMin=nums[fila][columna];
                    numMinX = fila;
                    numMinY = columna;
                }
            }
        }

        System.out.println("El numero mayor esta en las coordenadas: "+numMaxY+"-"+numMaxX);
        System.out.println("El numero menor esta en las coordenadas: "+numMinY+"-"+numMinX);
    }


    public static void Ej6() {
        int[][] nums = new int[6][10];
        for (int fila = 0; fila < nums.length; fila++){
            for (int columna = 0; columna < nums[fila].length - 1; columna++){
                int numeroCandidato;
                boolean repetido;
                do {
                    repetido = false;
                    numeroCandidato = (int) (Math.random() * 1001);
                    for (int i = 0; i < nums.length; i++) {
                        for (int j = 0; j < nums[i].length; j++) {
                            if (nums[i][j] == numeroCandidato) {
                                repetido = true;
                                break;
                            }
                        }
                    }
                } while (repetido); 
    
                nums[fila][columna] = numeroCandidato;
            }
        }
        for (int fila = 0; fila < nums.length; fila++) {
            System.out.print("Fila "+(fila)+"\t");
            for (int columna = 0; columna < nums[fila].length - 1; columna++) {
                System.out.print("\t"+nums[fila][columna] + "\t");
            }
            System.out.println();
        }
    }


    public static void Ej7() {
        int[][] nums = new int[8][8];
        Scanner sc = new Scanner(System.in);
        int filaIntroducida, columnaIntroducida, vidas = 3;
        for (int fila = 0; fila < nums.length; fila++){
            for (int columna = 0; columna < nums[fila].length; columna++){
                nums[fila][columna] = (int) (Math.random() * 3);
                char resultado = switch (nums[fila][columna]){
                    case 0 -> ' ';
                    case 1 -> '*';
                    case 2 -> '$';
                    default -> ' ';
                };
                System.out.print(resultado+" ");
            }
            System.out.println();
        }
        do{
            System.out.print("Introduce la fila: ");
            filaIntroducida = sc.nextInt();
            System.out.print("Introduce la columna: ");
            columnaIntroducida = sc.nextInt();
            if (nums[filaIntroducida][columnaIntroducida]==1){
                System.out.println("Has caido en una mina");
                vidas--;
                System.out.println("Te quetan "+vidas+" vidas");
            }else if (nums[filaIntroducida][columnaIntroducida]==2){
                System.out.println("Has encontrado un tesoro");
            }else{
                System.out.println("Espacio sin nada");
            }
        }
        while (vidas>0);
        System.out.println("Te has quedado sin vidas");
        System.out.println("Partida acabada");
        sc.close();
    }
    
    


    
    public static void main(String[] args) {
        //Ej1();
        //Ej2();
        //Ej3();
        //Ej4();
        //Ej5();
        //Ej6();
        Ej7();
    }
}
