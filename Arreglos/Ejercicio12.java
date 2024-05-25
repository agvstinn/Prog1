import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        double nota = 0;
        int numPreguntas;
        char[] respuestas;
        char[] respCorrectas;
        Scanner teclado = new Scanner(System.in);

        //se solicita el numero de preguntas al usuario y se valida que el numero sea mayor a 0
        while (true) {
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.print("Ingrese el numero de preguntas del examen, tenga en cuenta que el numero debe ser mayor a 0 > ");
            numPreguntas = teclado.nextInt();
            if (numPreguntas > 0) {
                break;
            }
            else {
                System.out.println("INVALIDO");
            }
        }

        //se solicita las respuestas del alumno nque debe ser una letra entre A y E
        respuestas = new char[numPreguntas];
        System.out.println("Ingrese las respuestas del alumno");
        for (int i = 0; i < respuestas.length; i++) {
            while (true) {
                System.out.println("Respuesta del ejercicio N°" + (i+1) + ", debe ingresar una letra entre A y E");
                respuestas[i] = teclado.next().charAt(0);
                if (respuestas[i] >= 'A' && respuestas[i] <= 'E') {
                    break;
                }
                else {
                    System.out.println("INVALIDO");
                }
            }
        }
        //se solicita las respuestas correctas
        System.out.println("--------------------------------");
        System.out.println("Ingrese las respuestas correctas");
        respCorrectas = new char[numPreguntas];
        for (int i = 0; i < respCorrectas.length; i++) {
            while (true) {
                System.out.println("Respuesta correcta del ejercicio N°" + (i+1) + ", debe ingresar una letra entre A y E");
                respCorrectas[i] = teclado.next().charAt(0);
                if (respCorrectas[i] >= 'A' && respCorrectas[i] <= 'E') {
                    break;
                }
                else {
                    System.out.println("INVALIDO");
                }
            }
        }

        //nota del alumno
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == respCorrectas[i]) {
                if (i % 2 == 0) {
                    nota++;
                }
                else {
                    nota+= 0.5;
                }
            }
        }
        System.out.println("----------------------------");
        System.out.println("El alumno obtuvo: " + nota + " puntos");
        teclado.close();
    }
}

