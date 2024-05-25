public class Ejercicio9 {
    public static void main(String[] args) {

        int[] arreglo = {3, 5, 12, 23, 82, 17, 9, 24, 15};
        int mayor = arreglo[0]; //inicializamos la variable mayor con el primero elemento del arreglo

        //recorremos el arreglo desde el segundo elemento
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
    }
}
