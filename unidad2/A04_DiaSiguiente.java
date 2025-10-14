/*Ejercicio 4.- Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha 
correspondiente al día siguiente. Febrero tiene 28 días.*/

package unidad2;

import java.util.Scanner;

/**
 * Ejercicio 4: Solicita una fecha (día, mes, año) y muestra
 * la fecha correspondiente al día siguiente.
 *
 * @author Ana
 */

public class A04_DiaSiguiente {
     /**
     * Método principal que ejecuta el programa.
     * Pide los datos por consola, calcula la fecha del día siguiente
     * y muestra el resultado.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN DE RECURSOS Y VARIABLES ---
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        int diasDelMes; // Esta variable es clave para el contador.

        // --- 2. ENTRADA DE DATOS DEL USUARIO ---
        System.out.print("Introduce el día: ");
        day = sc.nextInt();

        System.out.print("Introduce el número del mes: ");
        month = sc.nextInt();

        System.out.print("Introduce el año: ");
        year = sc.nextInt();

        sc.close();

        // --- 3. LÓGICA PARA DETERMINAR DÍAS DEL MES ---
        switch (month) {
            case 2 -> diasDelMes = 28;
            case 4, 6, 9, 11 -> diasDelMes = 30;
            default -> {
                diasDelMes = 31;
            }
        }

        // --- 4. COMPRUEBA LÓGICA DÍA SIGUIENTE ---

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day == diasDelMes) {
            nextDay = 1;
            nextMonth = month + 1;

            if (nextMonth > 12 ) {
            nextMonth = 1;
            nextYear = year + 1;
            }

        } else {
            nextDay = day + 1; 
        }
        System.out.printf("\nEl día siguiente de %d/%d/%d es %d/%d/%d.", day, month, year, nextDay, nextMonth, nextYear);
    }
}
