package unidad2_condicionales;

import java.util.Scanner;

/*Ejercicio 5.- Idear un programa que solicite al usuario un número comprendido 
entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre 
del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde 
a «lunes» y el 6 a «sábado». */

/*
 * Programa que solicite al usuario un número comprendido 
 * entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre 
 * del día de la semana al que corresponde.
 * @autor ANA ARCO
 */

public class A05_DiaSemana {
/**
 * Método main - método principal que se encarga de la ejecución del programa.
 * Pide un número por consola, lo procesa y muestra el día de la semana o
 * un mensaje de error si el número no es válido.
 *
 * @param args Argumentos de la línea de comandos (no se utilizan).
 */
    public static void main(String[] args) {
        // --- 1. INICIALIZACIÓN DE HERRAMIENTAS ---
        // Se crea un objeto Scanner para leer la entrada del teclado del usuario.
        Scanner sc = new Scanner(System.in);
        // --- 2. ENTRADA DE DATOS ---
        // Se solicita al usuario que introduzca el número y se muestra un mensaje claro.
        System.out.print("Introduce un número del 1 al 7: ");
        // Se lee el valor entero introducido y se guarda en la variable 'dia'.
        int dia = sc.nextInt();
        // --- 3. LÓGICA DE PROCESAMIENTO Y SALIDA ---
        // Se utiliza una estructura 'switch' para evaluar el valor de la variable 'dia'.
        // Esta estructura es ideal para comparaciones de igualdad con múltiples casos.
        // Se usa la sintaxis de flecha (->) introducida en Java 14, que es más concisa
        // y no requiere de la palabra 'break' pero sí un 'default'.
            switch (dia) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miércoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sábado");
                case 7 -> System.out.println("Domingo");
                default -> System.out.println("Error: El número introducido no es válido.");
            }
            // --- 4. CIERRE DE RECURSOS ---
            // Se cierra el Scanner para liberar los recursos del sistema.
            // Es una buena práctica hacerlo siempre que se termina de usar.
            sc.close();
    }
}
