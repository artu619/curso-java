/*
 * =================
 * =   BLACKJACK   =
 * =================
 * 
 * Utiliza como estructuras básicas:
 * arrays, bucles, condicionales y métodos.
 * 
 * Puedes apoyarte con otras clases, que deberás importar.
 * 
 * 1. Mazo de cartas:
 *      - Crea un array de 52 cartas combinando los siguientes valores:
 *          - Palos: ♠, ♥, ♦, ♣
 *          - Rangos: A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
 *      - Implementa un método para barajar el mazo aleatoriamente 
 *        (puedes usar el algoritmo de Fisher-Yates).
 * 
 * 2. Reparto inicial:
 *      - Al iniciar la partida, se deben repartir dos cartas al jugador 
 *        y dos cartas al dealer (la banca).
 *      - Una de las cartas del dealer debe mostrarse y la otra debe 
 *        permanecer oculta durante el turno del jugador.
 *      - El mazo de un jugador puede contener 12 cartas como máximo.
 * 
 * 3. Turno del jugador:
 *      - Muestra al jugador sus cartas y el valor total de su mano.
 *      - Pregunta si desea "pedir carta" (hit) o "plantarse" (stand).
 *          - Si pide carta, añade una nueva carta a su mano.
 *          - Si el valor total supera 21, el jugador pierde automáticamente.
 *          - El jugador puede seguir pidiendo cartas mientras no se plante ni se pase de 21.
 * 
 * 4. Turno del dealer:
 *      - Cuando el jugador se planta, se revelan las cartas del dealer.
 *      - El dealer debe seguir robando cartas hasta que su mano tenga al menos 17 puntos.
 *      - Si se pasa de 21, pierde automáticamente.
 * 
 * 5. Cálculo del valor de la mano:
 *      - Las cartas J, Q, K valen 10 puntos.
 *      - Los ases (A) valen 11 puntos, pero si la suma total supera 21, el valor del As se ajusta a 1.
 *      - Implementa un método que calcule correctamente el valor total de una mano, 
 *        teniendo en cuenta este comportamiento especial de los Ases.
 * 
 * 6. Resultado de la partida:
 *      - Al finalizar el turno del dealer, muestra el valor de ambas manos y determina el resultado:
 *          - Si el jugador tiene más puntos sin pasarse, gana.
 *          - Si el dealer tiene más puntos sin pasarse, gana el dealer.
 *          - Si ambos tienen el mismo valor, es un empate.
 *          - Si uno de los dos se pasa de 21, pierde automáticamente.
 * 
 * === AYUDA ===
 * crearBaraja(): genera las 52 cartas.
 * barajarMazo(String[] mazo): baraja el mazo.
 * repartirCarta(): devuelve la siguiente carta disponible en el mazo.
 * calcularValorMano(String[] mano, int numCartas): calcula el valor de una mano completa.
 * printMano(String[] mano, int numCartas): imprime las cartas de una mano por consola.
 */

//impor
import java.util.*;
/*los datos que son importante como los palos y los rangos
 * los arrray para las manos de jugador y el darler
 */
public class Blackjack {
    static final String[] PALOS = {"♠", "♥", "♦", "♣"};
    static final String[] RANGOS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static ArrayList<String> mazo;
    static ArrayList<String> manoJugador;
    static ArrayList<String> manoDealer;

//un menu para haceder la juego o salir de el
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("╔══════════════════╗");
            System.out.println("║ ♥♣🂠BLACKJACK🂡♠♦  ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║1. Jugar          ║");
            System.out.println("║2. Salir          ║");
            System.err.println("╚══════════════════╝");
            System.out.print("Selecciona una opcion:"  );
            String opcion = scanner.nextLine();
            
            
            if (opcion.equals("1")) {
                jugarPartida();
            } else if (opcion.equals("2")) {
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                break;
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        scanner.close();
    }
    //montrar la manos de los participantes 
    public static void jugarPartida() {
        mazo = new ArrayList<>();
        manoJugador = new ArrayList<>();
        manoDealer = new ArrayList<>();

        crearMazo();
        barajarMazo();
        repartirCartas();
        turnoJugador();
        
        if (calcularValorMano(manoJugador) <= 21) {
            turnoDealer();
        }
        
        determinarResultado();
    }
    //creador de mazos y repartir al jugador 
    public static void crearMazo() {
        for (String palo : PALOS) {
            for (String rango : RANGOS) {
                mazo.add(rango + palo);
            }
        }
    }
    
    public static void barajarMazo() {
        Collections.shuffle(mazo);
    }
    
    public static void repartirCartas() {
        manoJugador.add(mazo.remove(0));
        manoJugador.add(mazo.remove(0));
        manoDealer.add(mazo.remove(0));
        manoDealer.add(mazo.remove(0));
    }
    //motras mano de jugador y daeler
    public static void mostrarManoJugador() {
        System.out.println("Mano del Jugador: " + manoJugador);
        System.out.println("Valor total: " + calcularValorMano(manoJugador));
    }
    
    public static void mostrarManoDealer() {
        System.out.println("Mano del Dealer: " + manoDealer.get(0) + " , [??]");
    }
    //calcular la mano del jugar sacado las suma de todas la cartas en la mano
    public static int calcularValorMano(ArrayList<String> mano) {
        int valorTotal = 0;
        int ases = 0;
        
        for (String carta : mano) {
            String rango = carta.substring(0, carta.length() - 1);
            if (rango.equals("A")) {
                valorTotal += 11;
                ases++;
            } else if (rango.equals("J") || rango.equals("Q") || rango.equals("K")) {
                valorTotal += 10;
            } else {
                valorTotal += Integer.parseInt(rango);
            }
        }
        
        while (valorTotal > 21 && ases > 0) {
            valorTotal -= 10;
            ases--;
        }
        
        return valorTotal;
    }
    //sitema de pwdido de carta si el jugador no se a pasado de 21
    public static void turnoJugador() {
        Scanner scanner = new Scanner(System.in);
        
        mostrarManoJugador();
        mostrarManoDealer();
        
        while (true) {
            System.out.print("¿Pedir carta (h) o plantarse (s)? ");
            String decision = scanner.nextLine().toLowerCase();
            
            if (decision.equals("h")) {
                manoJugador.add(mazo.remove(0));
                mostrarManoJugador();
                
                if (calcularValorMano(manoJugador) > 21) {
                    System.out.println("Te has pasado de 21, ¡pierdes!");
                    return;
                }
            } else if (decision.equals("s")) {
                break;
            } else {
                System.out.println("Por favor, escribe 'h' para pedir carta o 's' para plantarte.");
            }
        }
    }
    //mano del daeler y si el total de puntos no es mayor a 17 pide cartas
    public static void turnoDealer() {
        System.out.println("Es el turno del dealer.");
        System.out.println("Mano del Dealer: " + manoDealer);
        
        while (calcularValorMano(manoDealer) < 17) {
            System.out.println("El dealer pide carta.");
            manoDealer.add(mazo.remove(0));
            System.out.println("Mano del Dealer: " + manoDealer);
        }
        
        if (calcularValorMano(manoDealer) > 21) {
            System.out.println("El dealer se ha pasado de 21, ¡el jugador gana!");
        }
    }
    //resultado de la partida
    public static void determinarResultado() {
        int valorJugador = calcularValorMano(manoJugador);
        int valorDealer = calcularValorMano(manoDealer);
        
        System.out.println("Valor final del Jugador: " + valorJugador);
        System.out.println("Valor final del Dealer: " + valorDealer);
        
        if (valorJugador > 21) {
            System.out.println("El jugador se ha pasado de 21, ¡pierde!");
        } else if (valorDealer > 21) {
            System.out.println("El dealer se ha pasado de 21, ¡gana el jugador!");
        } else if (valorJugador > valorDealer) {
            System.out.println("¡El jugador gana!");
        } else if (valorDealer > valorJugador) {
            System.out.println("¡El dealer gana!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}
