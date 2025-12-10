/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author alvaro.rinpul
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void Ejercicio1() {
        int multiploCinco;
        
        for (int i=0;i<=100;i+=5){
            multiploCinco=i;
            System.out.println(multiploCinco);
        }
    
    }
    
    
    public static void Ejercicio2() {
        int multiploCinco = 0;
        
        while (multiploCinco <= 100) {
             System.out.println(multiploCinco);
             multiploCinco += 5;
        }
    }
    
    
    public static void Ejercicio3() {
        int multiploCinco = 0;
        
        do{
            multiploCinco = multiploCinco+5;
            System.out.println(multiploCinco);
        }
        while (multiploCinco <= 100);
    }
    
    
    public static void Ejercicio4() {
        int resta20 = 320;
        
        for (int i=360;i>=160;i-=20){
            System.out.println(resta20);
            resta20=resta20-20;
        }      
    }
    
    
    public static void Ejercicio5() {
        int resta20 = 320;
        
        while (resta20 >= 160) {
             System.out.println(resta20);
             resta20 -= 20;
        }
    }
    
    
    public static void Ejercicio6() {
        int resta20 = 320;
        
        do{
            System.out.println(resta20);
            resta20 = resta20-20;
        }
        while (resta20 >= 160);
    }
    
    
    public static void Ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo de la caja");
        int codigo = sc.nextInt();
        int intentos = 4;
        int i=1;
        for (;i<=intentos;i++){
            System.out.println("Intento " + i + "/" + intentos + " totales");
            if (codigo==1111){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else{
                System.out.println("Lo siento, no es la combinacion");
                codigo = sc.nextInt();
            }
        }
        
        if (i==intentos){
            System.out.println("Has usado todos tus intentos");
        }
    }
    
    
    public static void Ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int resultado,i = 0;
        for (;i<=10;i++){
            resultado=numero*i;
            System.out.println(resultado);
        }
    }
    
    
    public static void Ejercicio9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        numero = Math.abs(numero);
        int contador = 0;
       do{
           numero = numero / 10;
           contador++;
       }while(numero>0);
        System.out.println("Has introducido " + contador + " digitos");
    }
    
    
    public static void Ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int contador = 0, media, support = 0;
        do{
            contador+=1;
            support = support+numero;
            System.out.println("Introduce otro numero");
            numero = sc.nextInt();
        }while(numero>0);
        media = support / contador;
        System.out.println("La media de los numeros es: " + media);
        
    }
            
    
    public static void Ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int cubo, cuadrado, numero = sc.nextInt();
        numero=numero+1;
        for (int i=numero;i<=numero+4;i++){
            cuadrado = i * i;
            cubo = i * i * i;
            System.out.println(i + ", " + cuadrado + ", " + cubo);
        }
    }
    
    
    public static void Ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int repeticiones = sc.nextInt();
        int cifra1, cifra2, resultado;
        cifra1 = 0;
        cifra2 = 1;
        for (int i=1;i<=repeticiones;i++){
            System.out.println(cifra1);
            resultado = cifra1+cifra2;
            cifra1=cifra2;
            cifra2=resultado;
        }
        
    }
    
    
    public static void Ejercicio13() {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido, contadorPositivo, contadorNegativo;
        contadorPositivo = 0;
        contadorNegativo = 0;
        for (int i=1;i<=10;i++){
            System.out.println("Introduce numero");
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido<=-1){
                contadorNegativo = contadorNegativo + 1;
            }else{
                contadorPositivo = contadorPositivo + 1;
            }
        }
        System.out.println("Has introducido "+contadorPositivo+" positivos");
        System.out.println("Has introducido "+contadorNegativo+" negativos");
    }
    
    
    public static void Ejercicio14() {
        Scanner sc = new Scanner(System.in);
        double base, exponente, resultado;
        System.out.println("Introduce la base");
        base = sc.nextDouble();
        System.out.println("Introduce un exponente");
        exponente = sc.nextDouble();
        while (exponente<0){
            System.out.println("Introduce un exponente valido");
            exponente = sc.nextDouble();
        }
        for(int i=0;i<exponente;i++){
            resultado = Math.pow(base,i);
            System.out.println("%.0f".formatted(resultado));
        }
        
    }
    
    
    public static void Ejercicio15() {
        Scanner sc = new Scanner(System.in);
        double base, exponente;
        System.out.println("Introduce la base");
        base = sc.nextDouble();
        System.out.println("Introduce un exponente");
        exponente = sc.nextDouble();
        while (exponente<0){
            System.out.println("Introduce un exponente valido");
            exponente = sc.nextDouble();
        }
        for(int i=1;i<=exponente;i++){
            System.out.println("%.0f".formatted(base) + "^" + i);
        }
    }
    
    
    public static void Ejercicio16() {
        Scanner sc = new Scanner (System.in);
        int numeroIntroducido;
        System.out.println("Introduce un numero");
        numeroIntroducido = sc.nextInt();
        if (numeroIntroducido <= 1) {
            System.out.println(numeroIntroducido + " NO es un número primo.");
        }
        for (int i = 2; i * i <= numeroIntroducido; i++){
            if (numeroIntroducido % i == 0) {
                System.out.println(numeroIntroducido + "No es un numero primo");
            }
        }
        System.out.println(numeroIntroducido + "Si es un primo");
    }
    
    
    public static void Ejercicio17() {
        Scanner sc = new Scanner (System.in);
        int numeroPositivo;
        System.out.println("Introduce un numero positivo");
        numeroPositivo = sc.nextInt();
        while (numeroPositivo<0){
            System.out.println("Introduce un exponente valido");
            numeroPositivo = sc.nextInt();
        }
        for (int i=0;i<=100;i++){
            System.out.println(numeroPositivo);
            numeroPositivo++;
        }
    }
    
    
    public static void Ejercicio18() {
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        System.out.println("Introduce un numero");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        num2 = sc.nextInt();
        while(num1==num2){
            System.out.println("Introduce otro numero distinto");
            num2 = sc.nextInt();
        }
        for (int i=num1;i<=num2;i+=7){
            System.out.println(i);
        }
    }
    
    
    public static void Ejercicio19() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el caracter con el que haras la piramide");
        char simbolo = sc.next().charAt(0);
        System.out.println("Introduce la altura de la piramide");
        int altura = sc.nextInt();
        for (int i=1;i<=altura;i++){ //define la altura de la piramide
            for (int espacios = altura - i; espacios > 0; espacios--) { //controla el numero de espacios que hay que escribir
                System.out.print("0");
            }
            for (int lineas = 1; lineas < 2 * i; lineas++) { //añade el simbolo en la posicion que le corresponde
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
    
    
    public static void Ejercicio20() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el caracter con el que haras la piramide");
        char simbolo = sc.next().charAt(0);
        System.out.println("Introduce la altura de la piramide");
        int altura = sc.nextInt();
        for (int i=1;i<=altura;i++){
            for (int espacios = altura - i; espacios > 0; espacios--) {
                System.out.print(" ");
            }
            for (int lineas = 1; lineas < 2 * i; lineas++) {
                if (lineas == 1 || lineas==(2*i)-1 || i==altura){
                    System.out.print(simbolo);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void Ejercicio21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int contador=0,mediaImpares=0,mayorPar=0,num=sc.nextInt();
        do{
            System.out.println("Introduce otro numero");
            if(num%2!=0){
                mediaImpares=mediaImpares+num;
            }else {
                if(mayorPar<num)
                mayorPar=num;
            }
            num=sc.nextInt();
            contador++;
        }while(num>0);
        mediaImpares=mediaImpares/contador;
        System.out.println("La media de los impares es: "+mediaImpares);
        System.out.println("El par mayor es: "+mayorPar);
        System.out.println("Has introducido "+contador+" numeros");
    }
    
    
    public static void Ejercicio22() {
        int contador;
        for(int i=2;i<=100;i++){
            contador=0;
            for(int j=1;j<=100;j++){
                if(i%j==0){
                    contador++;
                }
                if(contador>=2){
                    break;
                }
            }
            if(contador==2){
                System.out.print(i+" ");
            }
        }
    }
    
    
    public static void Ejercicio23() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numeros");
        int sumatorio=0, contador=0, num=sc.nextInt();
        do{
            sumatorio=sumatorio+num;
            contador++;
            System.out.println("Introduce otro numero");
        }while(sumatorio<10000);
        System.out.println("El sumatorio de tus numeros es: "+sumatorio);
        System.out.println("Ha introducido "+contador+" numeros");
    }
    
    
    public static void Ejercicio24() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la altura de la piramide");
        int altura = sc.nextInt();
        int num;
        for (int i=1;i<=altura;i++){
            num=0;
            for (int espacios = altura - i; espacios > 0; espacios--) {
                System.out.print(" ");
            }
            for (int lineas = 1; lineas < 2 * i; lineas++) {
                if (lineas <=i){
                    num++;
                    System.out.print(num);
                }else{
                    num--;
                    System.out.print(num);
                }       
            }
            System.out.println();
        }
    }
    
    
    public static void Ejercicio25() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numeroOriginal = sc.nextInt();
        int numeroInvertido = 0;
        int numeroTemporal = numeroOriginal;
        while (numeroTemporal != 0) {
            int digito = numeroTemporal % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numeroTemporal = numeroTemporal / 10;
        }
        System.out.println("El numero original es: " + numeroOriginal);
        System.out.println("El numero al revés es: " + numeroInvertido);
    }
    
    
    public static void Ejercicio26() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero largo: ");
        long numeroLargo = sc.nextLong();
        System.out.print("Introduce el dígito a buscar (0-9): ");
        int digitoBuscadoInt = sc.nextInt();
        String numeroStr = String.valueOf(numeroLargo);
        char digitoChar = (char) (digitoBuscadoInt + '0');
        boolean encontrado = false;
        String posiciones = "";
        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) == digitoChar) {
                posiciones += (i + 1) + " ";
                encontrado = true;
            }
        }
        System.out.println("--- Resultado ---");
        if (encontrado) {
            System.out.println("El dígito " + digitoBuscadoInt + " se encuentra en las posiciones (contando desde 1): " + posiciones.trim());
        } else {
            System.out.println("El dígito " + digitoBuscadoInt + " no se encontró en el número " + numeroLargo + ".");
        }
    
    }
    
    
    public static void Ejercicio27() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int contador=0,sumatorio=0;
        for(int i=1;i<=numero;i++){
            if (i%3==0){
            contador=contador+1;
            sumatorio=sumatorio+i;
            System.out.println(i);   
            }
        }
        System.out.println("Hay "+contador+" multiplos de 3");
        System.out.println("El sumatorio de todos los numeros es "+sumatorio);
    }

    
    public static void Ejercicio28() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero < 0) {
            System.out.print("Introduce un número entero (mayor o igual que 0): ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("Error: El número debe ser mayor o igual que 0.");
                }
            } else {
                System.out.println("Error: Entrada no válida. Por favor, introduce un número entero.");
                sc.next();
            }
        }
        long factorial = 1; 
        if (numero == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    
    public static void Ejercicio29() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número límite (N, mayor que 1): ");
        int limite = sc.nextInt();
        System.out.print("Introduce el número divisor (D, positivo): ");
        int divisor = sc.nextInt();
        if (limite <= 1 || divisor <= 0) {
            System.out.println("Los valores introducidos no son válidos (N debe ser > 1 y D debe ser > 0).");
            return;
        }
        System.out.println("\nNúmeros positivos menores que " + limite + " que NO son divisibles entre " + divisor + ":");
        for (int i = 1; i < limite; i++) {
            if (i % divisor != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    
    public static void Ejercicio30() {
        
    }
    
    
    public static void main(String[] args) {
        
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
        //Ejercicio7();
        //Ejercicio8();
        //Ejercicio9();
        //Ejercicio10();
        //Ejercicio11();
        //Ejercicio12();
        //Ejercicio13();
        //Ejercicio14();
        //Ejercicio15();
        //Ejercicio16();
        //Ejercicio17();
        //Ejercicio18();
        Ejercicio19();
        //Ejercicio20();
        //Ejercicio21();
        //Ejercicio22();
        //Ejercicio23();
        //Ejercicio24();
        //Ejercicio25();
        //Ejercicio26();
        //Ejercicio27();
        //Ejercicio28();
        //Ejercicio29();
                
    }

    
}
