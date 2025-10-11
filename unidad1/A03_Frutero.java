/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada 
semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del kilo 
de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.*/

import java.util.Scanner;

public class A03_Frutero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double precioManzanas = 2.35;
        final double precioPeras = 1.95;
        
        System.out.print("Introduce cuánto kilos de manzanas vendiste el primer semestre del año: ");
        double kgmanzanas1 = sc.nextDouble();
        System.out.print("¿Y el segundo semestre?: ");
        double kgmanzanas2 = sc.nextDouble();
        double totalkgmanzanas = kgmanzanas1 + kgmanzanas2;
        System.out.printf("Si en el primer semestre vendiste %.2f kg y en el segundo semenstre vendiste %.2f kg, en total vendiste %.2f kilos de manzanas.\n", kgmanzanas1, kgmanzanas2, totalkgmanzanas);
        System.out.printf("Si el kilo de manzanas cuesta %.2f euros, el total de manzanas cuesta %.2f euros.\n", precioManzanas, totalkgmanzanas);
        System.out.println();

        System.out.print("Introduce cuánto kilos de peras vendiste el primer semestre del año: ");
        double kgperas1 = sc.nextDouble();
        System.out.print("¿Y el segundo semestre?: ");
        double kgperas2 = sc.nextDouble();
        double totalkgperas = kgperas1 + kgperas2;
        System.out.printf("Si en el primer semestre vendiste %.2f kg y en el segundo semenstre vendiste %.2f kg, en total vendiste %.2f kilos de peras.\n", kgperas1, kgperas2, totalkgperas);
        System.out.printf("Si el kilo de peras cuesta %.2f euros, el total de peras cuesta %.2f euros.\n", precioPeras, totalkgperas);
        System.out.println();

        System.out.printf("Los beneficios anuales obtenidos sumando las ventas de todos los kilos son de %.2f euros.", (totalkgperas * precioPeras) + (totalkgmanzanas*precioManzanas));
    }
}
