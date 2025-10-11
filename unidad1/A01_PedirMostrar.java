//package unidad1;

import java.util.Scanner;

/* Diseñar un programa que pida al usuario su nombre, apellidos y edad y lo muestre por consola.*/

public class A01_PedirMostrar {
    public static void main(String[] args) {
        System.out.print("Hola, ¿cómo te llamas? ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.printf("¡Hola %s!\n", nombre);
        System.out.print ("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.printf("Tu nombre y apellidos son: %s %s.\n", nombre, apellidos);
        System.out.println("Ahora introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.printf("Tu edad es %d", edad);
        System.out.printf("\n¡Bienvenidx %s %s! ¡Estás en tus %d, una edad perfecta!.", nombre, apellidos, edad);
    }
}
