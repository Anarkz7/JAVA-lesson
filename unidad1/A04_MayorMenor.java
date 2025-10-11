/* Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de 
edad (mediante un literal booleano: true o false). */
import java.util.Scanner;

public class A04_MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        boolean mayorEdad = edad >= 18;
        System.out.println("¿Es mayor de edad? " + mayorEdad);
    }
}
