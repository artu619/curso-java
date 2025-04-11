import java.util.Scanner;

public class I_Ahorcado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 BIENVENIDO AL JUEGO DEL AHORCADO 🎮");

        // Paso 1: Mostrar el menú de dificultad y guardar la elección del jugador
        // Fácil = 10 vidas, Medio = 8 vidas, Difícil = 6 vidas
        int vidas = 0;
        System.out.println("Selecciona dificultad:");
        System.out.println("1. Fácil (10 vidas)");
        System.out.println("2. Medio (8 vidas)");
        System.out.println("3. Difícil (6 vidas)");
        System.out.print("Elige una opción: ");

        // TODO: Leer la elección del usuario (1, 2 o 3) y asignar las vidas correspondientes

        // Paso 2: Pedir al jugador 1 que introduzca la palabra secreta (el jugador 2 no debe mirar)
        // TODO: Pedir la palabra secreta y guardarla en minúsculas en una variable llamada `palabraSecreta`

        // Paso 3: Limpiar la pantalla (simulado)
        // Imprimir varias líneas en blanco para que el jugador 2 no vea la palabra
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // Paso 4: Crear el array de progreso con guiones bajos
        // Este array tendrá el mismo tamaño que la palabra secreta
        // Cada letra aún no descubierta se mostrará como '_'
        // TODO: Crear el array de tipo `char[]` y rellenarlo con guiones bajos

        // Paso 5: Crear una lista para guardar las letras que ya se han usado
        // TODO: Crear un ArrayList<Character> llamado `letrasUsadas`

        boolean palabraAdivinada = false;

        // Paso 6: Bucle principal del juego (mientras haya vidas y no se haya adivinado la palabra)
        while (vidas > 0 && !palabraAdivinada) {

            // Mostrar el progreso actual
            // TODO: Imprimir el array con las letras adivinadas y guiones bajos

            // Mostrar letras usadas
            // TODO: Mostrar el contenido del ArrayList con las letras usadas

            // Mostrar número de vidas restantes
            // TODO: Imprimir el número de vidas que quedan

            // Paso 7: Pedir al jugador que introduzca una letra
            // Validar que sea una letra válida y que tenga solo un carácter
            // TODO: Leer la letra del usuario, validar y convertir a minúscula

            // Paso 8: Verificar si la letra ya fue usada
            // TODO: Comprobar si la letra está en la lista `letrasUsadas`. Si ya está, mostrar advertencia

            // TODO: Si no ha sido usada, añadir la letra a la lista de letras usadas

            // Paso 9: Comprobar si la letra está en la palabra secreta
            // Si está, actualizar el array de progreso
            // Si no está, restar una vida
            // TODO: Recorrer la palabra letra por letra y comprobar si alguna coincide con la letra introducida

            // Paso 10: Verificar si ya se completó la palabra
            // TODO: Comprobar si en el array de progreso ya no queda ningún guion bajo
        }

        // Paso 11: Mostrar mensaje final
        // TODO: Si se completó la palabra, imprimir mensaje de victoria
        // TODO: Si se acabaron las vidas, imprimir mensaje de derrota con la palabra correcta

        sc.close();
    }
}