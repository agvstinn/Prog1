import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int[] arreglo = new int[8];
        boolean partidario = true;
        Scanner teclado = new Scanner(System.in);

        //pedimos al usuario que cargue el arreglo
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el elemento " + (i+1) + " del arreglo");
            arreglo[i] = teclado.nextInt();
        }


    }
}
