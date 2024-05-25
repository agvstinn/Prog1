import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de palabras a cargar");
        int dimension = teclado.nextInt();

        String[] arreglo = new String[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese una palabra: ");
            arreglo[i] = teclado.next();
        }

        System.out.println("------------------");
        System.out.println("Lista cargada: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("-------------------");
        System.out.println("Lista invertida: ");
        for (int i = dimension - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }

        teclado.close();
    }
}