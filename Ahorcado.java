import java.util.*;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 BIENVENIDO AL JUEGO DEL AHORCADO 🎮");

        // Paso 1: Mostrar el menú de dificultad y guardar la elección del jugador
        int vidas = 0;
        System.out.println("Selecciona dificultad:");
        System.out.println("1. Fácil (10 vidas)");
        System.out.println("2. Medio (8 vidas)");
        System.out.println("3. Difícil (6 vidas)");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1 -> vidas = 10;
            case 2 -> vidas = 8;
            case 3 -> vidas = 6;
            default -> {
                System.out.println("Opción inválida. Se asigna dificultad media por defecto.");
                vidas = 8;
            }
        }

        // Paso 2: Pedir palabra secreta
        System.out.print("Jugador 1, introduce la palabra secreta: ");
        String palabraSecreta = sc.nextLine().toLowerCase();

        // Paso 3: Limpiar la pantalla (simulado)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // Paso 4: Crear array de progreso
        char[] progreso = new char[palabraSecreta.length()];
        Arrays.fill(progreso, '_');

        // Paso 5: Lista de letras usadas
        ArrayList<Character> letrasUsadas = new ArrayList<>();

        boolean palabraAdivinada = false;

        // Paso 6: Bucle del juego
        while (vidas > 0 && !palabraAdivinada) {

            // Mostrar progreso actual
            System.out.print("Progreso: ");
            for (char c : progreso) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Mostrar letras usadas
            System.out.print("Letras usadas: ");
            for (char letra : letrasUsadas) {
                System.out.print(letra + " ");
            }
            System.out.println();

            // Mostrar vidas
            System.out.println("Vidas restantes: " + vidas);

            // Pedir letra
            System.out.print("Introduce una letra: ");
            String entrada = sc.nextLine().toLowerCase();

            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("❌ Entrada inválida. Debes escribir una sola letra.");
                continue;
            }

            char letra = entrada.charAt(0);

            // Comprobar si ya fue usada
            if (letrasUsadas.contains(letra)) {
                System.out.println("⚠️ Ya has usado esa letra. Prueba con otra.");
                continue;
            }

            letrasUsadas.add(letra);

            // Comprobar si está en la palabra
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                vidas--;
                System.out.println("❌ Letra incorrecta. Pierdes una vida.");
            } else {
                System.out.println("✅ ¡Bien hecho!");
            }

            // Verificar si se completó la palabra
            palabraAdivinada = !new String(progreso).contains("_");
        }

        // Paso 11: Resultado final
        if (palabraAdivinada) {
            System.out.println("🎉 ¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("💀 Has perdido. La palabra era: " + palabraSecreta);
        }

        sc.close();
    }
}
