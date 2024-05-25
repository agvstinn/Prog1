import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int dimension;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la dimension del arreglo >");
        dimension = teclado.nextInt();

        int[] arreglo = new int[dimension];

        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " >");
            arreglo[i] = teclado.nextInt();
        }
        System.out.println("---------------------");

        for (int i = 0; i < dimension; i++) {
            System.out.println("Celda " + i + ": |" + arreglo[i] + "|");
        }
        System.out.println("---------------------");
        System.out.println("Orden invreso");

        for (int i = dimension-1; i >= 0; i--) {
            System.out.println("Celda " + i + ": |" + arreglo[i] + "|");
        }
        System.out.println("---------------------");
        System.out.println("Numeros pares");
        for (int i = 0; i < dimension; i++) {
            if (arreglo[i] % 2 == 0) {
                System.out.println("Celda " + i + ": |" + arreglo[i] + "|");
            }
        }
        System.out.println("---------------------");
        System.out.println("Lista de valores en posiciones impares");
        for (int i = 0; i < dimension; i++) {
            if (i % 2 != 0) {
                System.out.println("Celda " + i + ": |" + arreglo[i] + "|");
            }
        }
        teclado.close();
    }
}