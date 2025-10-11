/*Ejercicio 1.- Diseñar un programa que pida al usuario su nombre, apellidos y edad y lo muestre por consola.*/

//package unidad1;

import java.util.Scanner;

public class A01_PedirMostrar {
    public static void main(String[] args) {
        //creamos una clase scanner para poder llamarla cada vez que queramos guardar algo introducido por consola.
        Scanner sc = new Scanner(System.in);
        
        //solicita nombre y guarda el nombre en la variable tipo string llamada nombre.
        System.out.print("Hola, ¿cómo te llamas? ");
        String nombre = sc.nextLine();

        //comprobación nombre.
        System.out.printf("¡Hola %s!\n", nombre);
        
        //solicita apellidos y guarda en la variable de tipo string llamada apellidos lo que se escribe por teclado.
        System.out.print ("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        
        //comprobación apellidos.
        System.out.printf("Tu nombre y apellidos son: %s %s.\n", nombre, apellidos);
        
        //solicita edad y guarda un número entero en la variable tipo int llamada "edad". 
        System.out.println("Ahora introduce tu edad: ");
        int edad = sc.nextInt();

        //comprobación edad.
        System.out.printf("Tu edad es %d", edad);

        //muestra todos los datos recogidos.
        System.out.printf("\n¡Bienvenidx %s %s! ¡Estás en tus %d, una edad perfecta!", nombre, apellidos, edad);
    }
}
