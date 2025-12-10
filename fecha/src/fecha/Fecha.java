/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha;
import java.time.*;

/**
 *
 * @author alvaro.rinpul
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    
    
    public static void Pruebas() {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: "+fechaActual);
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
        LocalDateTime fechaYHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + fechaYHoraActual);
    }
    
    public static void Ej1() {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: "+fechaActual);
    }
    
    
    public static void Ej2() {
        LocalDate fechaActual = LocalDate.now();
        int dia = fechaActual.getDayOfMonth();
        int mes = fechaActual.getMonthValue();
        int ano = fechaActual.getYear();
        System.out.println("Dia actual: "+dia);
        System.out.println("Mes actual: "+mes);
        System.out.println("Ano actual: "+ano);
    }
    
    
//    public static void Ej3(){
//        int dia = 11;
//        int mes = 11;
//        int ano = 2025;
//        LocalDate fecha1 = LocalDate.of(ano, mes, dia);
//        System.out.println("Fecha 1 (con números): "+fecha1); 
//    }
    
    public static void Ej4() {
        LocalDate fechaActual = LocalDate.now();
        int dia = 11;
        int mes = 11;
        int ano = 2025;
        LocalDate fecha1 = LocalDate.of(ano, mes, dia);
        if (fecha1.compareTo(fechaActual)==0){
            System.out.println("Es el mismo dia");
        }else{
            System.out.println("Son fechas diferentes");
        }
    }
    
    
    public static void Ej5() {
        MonthDay diezMarzo = MonthDay.of(Month.MARCH, 10);
        System.out.println(diezMarzo);
    }
    
    
    public static void Ej6() {
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
    }
    
    
    public static void Ej7() {
        LocalTime horaInicial = LocalTime.of(10, 30);
        LocalTime horaFinal = horaInicial.plusHours(6);
        System.out.println("Hora inicial: " + horaInicial);
        System.out.println("Hora final: " + horaFinal);
    }
    
    public static void Ej8() {
        LocalDate ahora = LocalDate.now();
        LocalDate futuro = ahora.plusDays(20);
        System.out.println("El dia actual es: "+ahora);
        System.out.println("Dentro de 20 dias sera: "+futuro);
    }
    
    
    public static void Ej9() {
        LocalDate ahora = LocalDate.now();
        LocalDate futuro = ahora.plusDays(5);
        LocalDate pasado = ahora.minusDays(5);
        System.out.println("El dia actual es: "+ahora);
        System.out.println("Dentro de 5 dias sera: "+futuro);
        System.out.println("Hace de 5 dias era: "+pasado);
    }
    
    
    public static void Ej10() {
        LocalDate ahora = LocalDate.now();
        LocalDate comparacion = LocalDate.of(2025, 3, 10);
        if (ahora.compareTo(comparacion)>=1){
            System.out.println("La fecha es anterior");
        }else if(ahora.compareTo(comparacion)==0){
            System.out.println("Es la misma fecha");
        }else{
            System.out.println("La fecha es futura");
        }
    }
    
    
    public static void Ej11() {
        YearMonth caducidad = YearMonth.of(2027, Month.MARCH);
        System.out.println("Tu tarjeta caduca: "+caducidad);
    }
    
    
    //Cómo verificar si el año de una fecha es bisiesto
    
    public static void Ej12() {
        LocalDate fecha = LocalDate.of(2020, 2, 29);
        if (fecha.isLeapYear()){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }


    // Cómo manejar la cantidad de tiempo que hay entre dos fechas

    public static void Ej13() {
        LocalDate fechaInicio = LocalDate.of(2020, 1, 1);
        LocalDate fechaFin = LocalDate.of(2023, 6, 15);
        Period periodo = Period.between(fechaInicio, fechaFin);
        System.out.println("Años: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Días: " + periodo.getDays());
    }
    

    //Cómo transformar una fecha en una cadena de caracteres

    public static void Ej14() {
        LocalDate fecha = LocalDate.of(2023, 6, 15);
        String fechaFormateada = fecha.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Fecha formateada: " + fechaFormateada);
    }

    
    public static void main(String[] args) {
        //Pruebas();
        //Ej1();
        //Ej2();
        //Ej3();
        //Ej4();
        //Ej5();
        //Ej6();
        //Ej7();
        //Ej8();
        //Ej9();
        //Ej10();
        //Ej11();
        //Ej12();
        //Ej13();
        //Ej14();
    }
    
}
