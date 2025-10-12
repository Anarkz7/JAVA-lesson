/*Ejercicio 3.- Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará 
el aforo máximo del local, el precio por entrada (suponemos que todas las entradas tienen el mismo precio) 
y el número de entradas vendidas. Hay que tener en cuenta que, si el número de entradas vendidas no supera 
el 20% del aforo del local, se cancela el concierto. Si el número de entradas vendidas no supera el 50% del 
aforo del local, se realiza una rebaja del 25% del precio de la entrada. */

package unidad2;

import java.util.Scanner;

public class A03_Concierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el aforo máximo del local: ");
        int aforo = sc.nextInt();

        System.out.print("Introduce el precio de la entrada: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce número de entradas vendidas: ");
        int entradas = sc.nextInt();

        double recaudacion = precio * entradas;

        if (entradas < aforo * 0.20 ) {
            System.out.print("Lo sentimos. El concierto se cancela.");
            recaudacion = 0;
        } else if (entradas < aforo * 0.50 /*&& entradas > aforo * 0.20*/) {
            System.out.print("Se realiza un descuento del 25% por entrada.");
            recaudacion = entradas * (precio * 0.25)  ;
        }



        System.out.printf("\nLa recaudación de este concierto es de %.2f euros.", recaudacion);

    }
}
