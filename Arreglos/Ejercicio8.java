import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] arreglo = {2, 34, 54, 67, 87, 54, 24, 18, 91, 9};
        int num;
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);

        //pedimos al usuario un numero
        System.out.print("Ingrese el numero que quiere buscar en el arreglo > ");
        num = teclado.nextInt();

        //buscamos el numero en el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (num == arreglo[i]) {
                encontrado = true;
                //si encontramos el numero, imprimimos la posicion y salimos del bucle
                System.out.println("El numero fue encontrado en la posicion: " + i);
                break;
            }
        }

        //si el numero no fue encontrado damos el mensaje al usuario
        if (!encontrado) {
            System.out.println("El numero no fue encontrado");
        }
    }
}
