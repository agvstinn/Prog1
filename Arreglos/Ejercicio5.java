import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int suma = 0;
        double promedio;
        int[] arreglo = new int[20];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 20 numeros al arreglo ");
        for (int i = 0; i < 20; i++) {
            arreglo[i] = teclado.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            suma += arreglo[i];
        }

        promedio = ((double)suma / arreglo.length);

        System.out.println("----------------------------");
        System.out.println("El promedio es de " + promedio);

        //valores mayores al promedio
        System.out.println("-------------------------------------------------");
        System.out.println("Numeros del arreglo que son mayores al promedio");
        int cantidad = 0;
        for (int i = 0; i < 20; i++) {
            if (arreglo[i] > promedio) {
                cantidad ++;
                System.out.println(arreglo[i]);
            }
        }
        System.out.println("Hay " + cantidad + " valores mayores al promedio");
    }
}