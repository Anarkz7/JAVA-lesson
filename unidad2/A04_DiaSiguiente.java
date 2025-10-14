/*Ejercicio 4.- Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha 
correspondiente al día siguiente. Febrero tiene 28 días.*/

package unidad2;

import java.util.Scanner;

public class A04_DiaSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int day = sc.nextInt();

        System.out.print("Introduce el número del mes: ");
        int month = sc.nextInt();

        System.out.print("Introduce el año: ");
        int year = sc.nextInt();

        int nextDay = day ++;
        int nextMonth = month;
        int nextYear = year;

        nextDay = day > 30 ? nextDay ++ : 
        nextMonth = month > 12 ? nextMonth ++ : nextMonth = month;

        /*
        monthDays  = switch(month){
            case -> 2;
            case ->
            case ->
            default ->

        } 
        */

        System.out.printf("El día siguiente de %d / %d / %d es %d / %d / %d.", day, month, year, nextDay, nextMonth, nextYear);
    }
}
