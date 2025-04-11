
import javax.sql.DataSource;
import java.util.*;

public class B_Bucles {
    public static void ejercicio1() {
        // suma todos los elementos de un array
        int[] numeros = {3, 5, 7, 2, 8};
        //variable suma
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma de los elementos es: " + suma);


    }

    public static void ejercicio2() {
        // muestra los valores de un array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
        
    }

    public static void ejercicio3() {
        // muestra cuántos elementos pares hay en un array
        int[] datos = {1, 4, 6, 9, 12, 15, 18};
        int contadorPares = 0;
    
            for (int i = 0; i < datos.length; i++) {
                if (datos[i] % 2 == 0){
                    contadorPares++;
            }
    
        }
        System.out.println("cantidad de números pares: " + contadorPares);


    }

    public static void ejercicio4() {
        // calcula la suma de cada fila de una matriz
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < numeros.length; i++){
            int sumarFila = 0;
            for(int j = 0; j < numeros[i].length; j++) {
                sumarFila += numeros[i][j];
            }
        System.out.println("Suma de fila" + (i + 1) + ": " + sumarFila);
        }
    }

    public static void ejercicio5() {
        // pide al usuario un número e indica
        // si está dentro de una matriz de 3x3
        // si está muestra su posición (fila y columna)
        int[][] matriz = {
            {5, 8, 2, 6},
            {1, 9, 6, 4},
            {3, 7, 4, 8}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el numero: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;

        for (int  i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("numero encontrado en fila: " + i + ", columna: " + j);
                    encontrado = true;


                }
            }
        }
        if (!encontrado){
            System.out.println("el numero no se encuentra en la matriz");
        }
        scanner.close();

    }

    public static void ejercicio6() {
        // crea una matriz de 4x4 con bucles anidados
        // en la diagonal principal tiene 1, el resto 0
        int [][] matriz = new int[4][4];

        //rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        // Mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void ejercicio7() {
        // reemplaza los valores negativos por 0
        int[] valores = {4, -3, 5, -1, 0, 6, -7};

        for ( int i = 0; i < valores.length; i++) {
                if (valores[i] < 0) {
                    valores[i] = 0;
                }
        }
        System.out.println("array alctualizado");;
        for (int valor : valores) {
            System.out.print( valor + " ");
        }
    }

    public static void ejercicio8() {
        // imprime los elementos de esta matriz
        // como si fuera una tabla, separados por espacio
        int[][] tabla = {
            {10, 20, 30, 40},
            {50, 60, 70, 80}
        };
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
        
    }

    public static void ejercicio9() {
        // invierte el orden de los números del array
        // no puedes utilizar otro array
        int[] original = {1, 2, 3, 4, 5};
        int inicio = 0;
        int fin = original.length - 1;

        while (inicio < fin) {
            int temp = original[inicio];
            original[inicio] = original[fin];
            original[fin] = temp;

            inicio++;
            fin--;

        }
        System.out.print("Array invertido: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        
    }

    public static void ejercicio10() {
        // cuántas veces aparece un número en una matriz
        int[][] matriz = {
            {1,3,5},
            {8,5,2},
            {5,5,5}
        };

        int numeroBuscado = 5;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    contador++;
                }

            }
            
            System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces.");
        }
    }
    public static void main(String[] args) {
    // ejercicio1();
    // ejercicio2();
    // ejercicio3();
    // ejercicio4();
    // ejercicio5();
    // ejercicio6();
    // ejercicio7();
    // ejercicio8();
    ejercicio9();
    // ejercicio10();
    }
    
}
