public class Ejercicio7 {
    public static void main(String[] args) {

        int[] arregloA = {4, 5, 6, 7, 8, 4, 3, 6, 8, 9 ,0 ,5, 3, 2, 1, 5, 3, 7, 8, 4};
        int[] arregloB = {7, 5, 2, 3, 7, 1, 0, 5, 9, 3, 2, 9, 3, 6, 4, 7, 6, 1, 9, 3,};
        int[] arregloC = new int[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloC[i] = arregloA[i] * arregloB[arregloB.length - 1 - i];
        }

        System.out.println("El arreglo resultante C es:");
        for (int i = 0; i < arregloC.length; i++) {
            System.out.println(arregloC[i]);
        }

    }
}
