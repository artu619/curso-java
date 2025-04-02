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

// sección imports

import java.util.*;
// declaración de la
public class ENTREGABLE_Blackjack {

    // Variables de clase
    static String[] deck = new String[52];
    static int deckIndex = 0;
    private static final String[] PALOS = {"♠", "♥", "♦", "♣"};
    private static final String[] RANGOS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static final List<Map<String, String>> mazo = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    


    // método main
    public static void main(String[] args) {

        
        crearMazo();
        Collections.shuffle(mazo);
        jugarBlackjack();
        // Inicializar y barajar el mazo
        private static void crearMazo() {
            for (String palo : PALOS) {
                for (String rango : RANGOS) {
                    Map<String, String> carta = new HashMap<>();
                    carta.put("rango", rango);
                    carta.put("palo", palo);
                    mazo.add(carta);
                }
            }
        }
        
        // Manos de jugador y dealer (se asume máximo 12 cartas por mano)
        
        
        // Repartir dos cartas a cada uno
        
        

        // Muestra mensajes de inicialización del juego
        
        
        // Turno del jugador: ve mostrando mensajes para
        // poder controlar la dinámica y el avance de la partida
        // por la consola.
        


            // Muestra la primera carta y oculta la segunda
            
        
        
        // Turno del dealer: debe pedir cartas hasta alcanzar al menos 17
        
        
        
        
        // Mostrar resultados finales
        
    
        
    }
    
    // ===METODOS===
    // Inicializa el mazo con 52 cartas (combinando rangos y palos)
    

    
    // Baraja el mazo utilizando el algoritmo de Fisher-Yates
    
    
    // Devuelve la siguiente carta del mazo
    
    
    // Devuelve el valor inicial de la carta (A se considera 11; se ajustará luego)
        // Se asume que card es algo como "A♠", "10♥", "J♦", etc.
    

    
    // Calcula el valor total de una mano, ajustando el valor de los ases si es necesario
    

        // Ajustar el valor de los ases si se excede 21
        

    
    // Imprime las cartas de una mano
    
}