import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //declaracion de los arreglos A y B
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        Scanner teclado = new Scanner(System.in); //declaracion de variable scanner teclado

        System.out.println("Ingrese los elementos del arreglo A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " >");
            arregloA[i] = teclado.nextInt();
        }

        System.out.println("Ingrese los elementos del arreglo B");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("Ingrese el elemento " + (i+1) + " >");
            arregloB[i] = teclado.nextInt();
        }
        //declaraccion arreglo resultante y suma de los arreglos a y b
        int[] arregloSuma = new int[10];
        for (int i = 0; i < arregloSuma.length; i++) {
            arregloSuma[i] = (arregloA[i] + arregloB[i]);
            System.out.println("Se sumó " + arregloA[i] + " + " + arregloB[i]);
        }
        //mostrar por pantalla el arreglo resultante
        System.out.println("El arreglo resultante es: ");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.println(arregloSuma[i]);
        }
    }
}
