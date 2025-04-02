import java.util.Random;
import java.util.Scanner;

public class TirarDados {
    /*
    Enunciado:
        El programa simula N tiradas de dos dados de 6 caras. Después muestra:

        * Cuántas veces ha salido cada suma (de 2 a 12).

        * Cuál es la suma más frecuente.

        * Mostrar un pequeño gráfico de frecuencias con asteriscos.

    Requisitos:
        * Arrays para contar las sumas.

    Métodos para:

        * Lanzar dados.

        * Registrar resultados.

        * Analizar y mostrar resultados.

    Uso de Math.random() o Random.
    */


     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de tiradas: ");
        int N = scanner.nextInt();

        int[] frecuencias = new int[13]; // Índices 2-12, el índice 0 y 1 no se usan

        // Lanzamiento de los dados y registro de resultados
        for (int i = 0; i < N; i++) {
            int dado1 = lanzarDado(random);
            int dado2 = lanzarDado(random);
            int suma = dado1 + dado2;
            frecuencias[suma]++;
        }

        // Análisis y muestra de resultados
        mostrarResultados(frecuencias);
        scanner.close();
    }

    // Método para lanzar un dado de 6 caras
    public static int lanzarDado(Random random) {
        return random.nextInt(6) + 1;
    }

    // Método para mostrar resultados
    public static void mostrarResultados(int[] frecuencias) {
        int maxFrecuencia = 0;
        int sumaMasFrecuente = 2;

        System.out.println("\nResultados:");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("Suma %2d: %d veces ", i, frecuencias[i]);
            for (int j = 0; j < frecuencias[i]; j += 10) {
                System.out.print("*");
            }
            System.out.println();

            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                sumaMasFrecuente = i;
            }
        }

        System.out.println("\nLa suma más frecuente fue: " + sumaMasFrecuente);
    }
}
