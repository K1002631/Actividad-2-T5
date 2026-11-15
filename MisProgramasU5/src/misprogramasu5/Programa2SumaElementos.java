package misprogramasu5;

import java.util.Scanner;

public class Programa2SumaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("--- Suma de Elementos ---");

        // Lectura de los 5 numeros y calculo de la suma
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("\nLa suma total de los elementos es: " + suma);
        
        scanner.close();
    }
}