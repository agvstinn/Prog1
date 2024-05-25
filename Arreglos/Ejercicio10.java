import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int[] arreglo = {2, 4, 16, 22, 19, 28, 7, 14, 1, 19, 20, 5};
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero a buscar en el arreglo > ");
        num = teclado.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                System.out.println("El numero ingresado se repite en la posicion: " + i);
            }
        }
        teclado.close();
    }
}
