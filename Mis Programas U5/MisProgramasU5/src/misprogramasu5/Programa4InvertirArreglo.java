package misprogramasu5;

import java.util.Scanner;

public class Programa4InvertirArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("--- Invertir Elementos de un Arreglo ---");

        // Lectura de los 6 numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inversion del arreglo intercambiando extremos
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Mostrar el arreglo ya invertido
        System.out.println("\nArreglo invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}