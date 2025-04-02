/*
 * Genera un número aleatorio entre 1 y 100.
 * El usuario tiene que adivinarlo y recibir pistas.
 * 
 * El programa pedirá al usuario que introduzca un número.
 * Este número se tendrá que comprobar con el número aleatorio.
 * 
 * Tiene que contar la cantidad de intentos que se han realizado hasta
 * acertar con el número.
 * 
 * Debe lanzar pistas, si el número es demasiado alto, o bajo.
 */

import java.util.Random;
import java.util.Scanner;

public class I_AdivinaElNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;
        
        System.out.println("¡Adivina el número entre 1 y 100!");
        
        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;
            
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            }
            
        } while (true);
        
        scanner.close();
        
    }
}