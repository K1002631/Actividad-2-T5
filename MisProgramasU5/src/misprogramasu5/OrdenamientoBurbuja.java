package misprogramasu5;

import java.util.Scanner;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Metodo de Ordenamiento Burbuja ---");

        // 1. Pedir al usuario la cantidad de elementos
        System.out.print("Ingresa la cantidad de elementos que deseas agregar al arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        // 2. Solicitar al usuario cada numero para llenar el arreglo
        System.out.println("\nIngresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + (i + 1) + "]: ");
            arreglo[i] = scanner.nextInt();
        }

        // 3. Implementar el metodo de ordenamiento burbuja (ascendente)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si el actual es mayor que el siguiente
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // 4. Mostrar el arreglo ordenado en la consola
        System.out.println("\nArreglo ordenado de forma ascendente:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}