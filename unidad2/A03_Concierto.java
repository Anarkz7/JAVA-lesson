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
        
        //Inicia las variables necesarias para todo el código para poder operar con ellas más adelante.
        double descuento = 0;

        //Solicita y guarda el aforo, el precio de cada entrada, y el número de entradas vendidas.
        System.out.print("Introduce el aforo máximo del local: ");
        int aforo = sc.nextInt();

        System.out.print("Introduce el precio de la entrada: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();

        System.out.printf("El aforo del local tiene %d butacas, se han venidido %d entradas, y el precio de la entrada es de %.2f euros.\n", aforo, entradas, precio);
        System.out.println("");

        //Calcula el valor del descuento que se aplica a cada entrada con el descuento ya aplicado.
        descuento = precio * 0.25;
        System.out.printf("Enhorabuena, tienes un descuento de %.2f euros en cada entrada.", descuento);

        //Calcula precio final que tendrá cada entrada
    }
}