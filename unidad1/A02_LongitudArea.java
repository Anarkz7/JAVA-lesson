package unidad1;

import java.util.Scanner;


/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, 
el usuario debe introducir el radio (que puede contener decimales).
Recordamos: Longitud = 2pi • Radio Área = pi. Radio^2*/

public class A02_LongitudArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nDime cuál es el radio: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nTu dichoso radio es de %.2f centímetros.", radio);
        System.out.printf("\nAsí que la longitud será: %.2f centímetros, y el área %.2f centímetros cuadrados ¿vale?\n", longitud, area);
        System.out.printf("\nEn metros se vería así: Longitud = %.2f metros. Área = %.2f metros.", longitud/100, area/100);

    }
}