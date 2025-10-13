/*Ejercicio 3.- Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará 
el aforo máximo del local, el precio por entrada (suponemos que todas las entradas tienen el mismo precio) 
y el número de entradas vendidas. Hay que tener en cuenta que, si el número de entradas vendidas no supera 
el 20% del aforo del local, se cancela el concierto. Si el número de entradas vendidas no supera el 50% del 
aforo del local, se realiza una rebaja del 25% del precio de la entrada. */

package unidad2;

import java.util.Scanner;

public class A03_Concierto {
    public static void main(String[] args) {
        //Crea una clase de tipo Scanner llamada sc para poder usarla cada vez que queramos guardar valores introducidos por consola.
        Scanner sc = new Scanner(System.in);
        
        //Declara las variables necesarias para todo el código para poder operar con ellas más adelante.
        int aforo, entradas;
        double precio;
        double descuento = 0;
        double recaudacion = 0;

        //Solicita y guarda el aforo, el precio de cada entrada, y el número de entradas vendidas.
        System.out.println("----------- Calculadora de Recaudación del Concierto ---------");
        System.out.println("");

        System.out.print("Introduce el aforo máximo del local: ");
        aforo = sc.nextInt();

        System.out.print("Introduce el precio de la entrada (demiales con ','): ");
        precio = sc.nextDouble();

        System.out.print("Introduce número de entradas vendidas: ");
        entradas = sc.nextInt();

        System.out.printf("\nEl aforo del local es de %d butacas, se han venidido %d entradas y el precio de la entrada es de %.2f euros.\n", aforo, entradas, precio);
        System.out.println("-----------------------------------------------------------------------");

        //Comienza el bucle if con la condición más restrictiva.
        if (entradas < aforo * 0.20) {
            recaudacion = 0;
            System.out.printf("Lo sentimos. El concierto está cancelado.\nLa racaudación es: %.2f euros.", recaudacion);
        } else if (entradas < aforo * 0.50) {
            descuento = precio - (precio * 0.25);
            recaudacion = precio * entradas;
            System.out.printf("INFO: Cada entrada tiene un descuento de %.2f euros.\nLa recaudación es de %.2f euros.", descuento, recaudacion);
        } else {
            recaudacion = precio * entradas;
            System.out.printf("INFO: Venta normal sin descuentos. \nLa recaudación es de %.2f euros.", recaudacion);
        }
    }
}