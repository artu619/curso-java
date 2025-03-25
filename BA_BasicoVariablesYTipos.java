/*
 * Bloque de ejercicios de nivel básico
 * 
 * Cada ejercicio tiene su espacio, recuerda:
 * System.out.println(); para mostrar por pantalla texto que indique en qué ejercicio estás
 * y el proceso que vas haciendo.
 */
public class BA_BasicoVariablesYTipos {
    public static void main(String[] args) {
        // 1. Declara variables de tipos numéricos (byte, short, int, long, float, double)
        // Realiza conversiones implícitas entre ellas
        System.out.println("EJERCICIO 1:"); // Resuelve en las siguientes líneas
        byte numero1 = 1;
        System.out.println("numero en byte: " +  numero1);
        short numero2 = 20000;
        System.out.println("numero en short: " +  numero2);
        int numero3 = 3000000;
        System.out.println("el valor de int: " + numero3 );
        long numero4 = 3000000000L;
        System.out.println("el valor long: " + numero4);
        float numero5 = 12.34f;
        System.out.println("el valor de float: " + numero5);
        double numero6 = 12E4d;
        System.out.println("el valor de double: " + numero6 );

        // 2. Declara una variable char con valor 'C'.
        // Almacena su valor en una variable int.
        // Muestra por pantalla el valor.
        System.out.println("EJERCICIO 2:");
        char letra = 'c';
        int letra1 = 1248;
        System.out.println( "el valo de: '" + letra + " 'es " + letra1);

        // 3. Intenta convertir un long en un short sin hacer casting
        // Deja en un comentario el error.
        System.out.println("EJERCICIO 3:");
        //long numeroLargo = 1000;
        //short numeroCorto = numeroLargo;  error: tipos incompatibles: Esto significa que podrías perder información si el número en long es demasiado grande para caber en short.
        //System.out.println(numeroCorto);

        // 4. Asigna un float a un double y viceversa.
        // ¿Cuándo es necesario hacer un casteo?
        System.err.println("EJERCICIO 4:");
        float numeroFloat = 10.5f;
        double numeroDouble = numeroFloat; // No necesita casting
        System.out.println("Float a Double: " + numeroDouble);
        double otroDouble = 20.987654321;
        float otroFloat = (float) otroDouble; // Necesita casting
        System.out.println("Double a Float: " + otroFloat);

        // 5. Crea una variable double, con valor decimal.
        // Castéala a una variable int.
        // ¿Qué ocurre?
        System.out.println("EJERCICIO 5:");
        double numeroDecimal = 9.99;
        int numeroEntero = (int) numeroDecimal; // Se necesita casting explícito
        System.out.println("Double: " + numeroDecimal);
        System.out.println("Int (tras casting): " + numeroEntero);


    }
}
