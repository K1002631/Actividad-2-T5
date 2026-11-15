package misprogramasu5;

import java.util.Scanner;

public class Programa1ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        System.out.println("--- Contar Numeros Pares e Impares ---");
        
        // Lectura de los 10 numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Conteo de pares e impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
        
        scanner.close();
    }
}