import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int dimension;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la dimension del arreglo >");
        dimension = teclado.nextInt();

        int[] arreglo = new int[dimension];

        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el elemento " + (i) + " >");
            arreglo[i] = teclado.nextInt();
        }

        //lista con todos lo que sean primos
        System.out.println("Numeros primos en el arreglo");
        for (int i = 0; i <dimension; i++) {
            if (arreglo[i] > 1) {
                boolean esPrimo = true;
                for (int j = 2; j <= arreglo[i] / 2; j++) {
                    if (arreglo[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(arreglo[i]);
                }
            }
        }

        //sumatoria de los valores
        System.out.println("Sumatoria de los valores del arreglo");
        int suma = 0;
        for (int i = 0; i < dimension; i++) {
            suma += arreglo[i];
        }
        System.out.println("La sumatoria es: " + suma);

        //promedio de los valores
        System.out.println("Promedio de los valores del arreglo");
        if (suma == 0) {
            System.out.println("El promedio es 0");
        }
        else {
            double promedio = ((double)suma / arreglo.length); //convierto uno de los sumandos en double para no perder presicion
            System.out.println("El promedio de los valores es: " + promedio + "%");
        }

        teclado.close();
    }
}