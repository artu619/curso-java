/*
 * ==================
 * =   INTERMEDIO   =
 * ==================
 * 
 * En estos ejercicios vais a tener que investigar un poco.
 * Es muy importante que entrenemos la autosuficiencia desde el principio.
 * Es necesario que aprendáis a buscar en la red posibles soluciones a vuestros problemas
 * y tener el máximo de autonomía posible.
 * También es esencial manejarse con los manuales.
 */

public class BB_IntermedioVariablesYTipos {
    // Declara el método main --> Cuidado con las llaves de apertura y cierre
    public static void main(String[] args) {
        
   

        // 1. Declara una variable int y una double.
        // Realiza una operación matemática.
        // ¿Qué tipo de dato es el resultado?
        System.out.println("EJERCICIO 1:");

        int numeroEntero = 10; // Declaramos una variable de tipo int
        double numeroDecimal = 5.5; // Declaramos una variable de tipo double

        double resultado = numeroEntero + numeroDecimal; // Realizamos una operación matemática

        System.out.println("El resultado es: " + resultado);
        // Cuando se realiza una operación entre un int y un double, el int se convierte automáticamente a double para evitar la pérdida de información.
        // Como double tiene mayor precisión que int, el resultado final también será un double.


        // 2. Declara una variable int y otra String.
        // Concatena la variable int con la String --> igual tienes que hacer alguna transformación
        // Vuelve a convertir el resultado en un int
        System.out.println("EJERCICIO 2:");
        int numero = 25; // Declaramos una variable de tipo int
        String texto = "100"; // Declaramos una variable de tipo String

        // Convertimos el int a String y concatenamos
        String resultadoConcatenado = numero + texto;
        System.out.println("Concatenación: " + resultadoConcatenado);

        // Convertimos el resultado de nuevo a int
        int resultadoFinal = Integer.parseInt(resultadoConcatenado);
        System.out.println("Resultado convertido a int: " + resultadoFinal);

        // 3. Usa char en una operación matemática con un int.
        // Guarda el resultado en una nueva variable y muéstralo.
        System.out.println("EJERCICIO 3:");
        char letra = 'A'; // Declaramos una variable de tipo char
        int numero1 = 8;   // Declaramos una variable de tipo int

        // Operación matemática (char se convierte en su valor ASCII)
        int suma = letra + numero1 ;

        System.out.println("Valor ASCII de 'A': " + (int) letra);
        System.out.println("Resultado de la operación: " + suma );

        // 4. Declara una variable byte con valor 127.
        // Súmale 1 y guarda el resultado en una nueva variable casteando a byte.
        // Imprime el resultado.
        // Imprime texto con la justificación del resultado.
        System.out.println("EJERCICIO 4:");
        byte numero2 = 127; // Declaramos una variable byte con el valor máximo permitido
        byte resultado1 = (byte) (numero2 + 1); // Sumamos 1 y casteamos a byte

        System.out.println("Resultado de la suma: " + resultado1);

        // Justificación del resultado
        System.out.println("Explicación:");
        System.out.println("El tipo de dato byte en Java tiene un rango de valores de -128 a 127.");
        System.out.println("Cuando sumamos 1 a 127, se produce un desbordamiento y el valor vuelve al inicio del rango, es decir, -128.");

        // 5. Declara un long con un valor mayor a lo que permite int.
        // Conviértelo a int.
        // Muestra el número y explica qué ha sucedido.
        System.out.println("EJERCICIO 5:");
        long numeroGrande = 3_000_000_000L; // Un valor mayor al máximo permitido por int (2,147,483,647)
        int numeroConvertido = (int) numeroGrande; // Conversión explícita de long a int

        System.out.println("Número original (long): " + numeroGrande);
        System.out.println("Número convertido (int): " + numeroConvertido);

        // Explicación del resultado
        System.out.println("Explicación:");
        System.out.println("El tipo de dato int en Java tiene un rango de -2,147,483,648 a 2,147,483,647.");
        System.out.println("El número long excede este rango, por lo que al convertirlo a int se produce un desbordamiento.");
        System.out.println("Esto hace que el número resultante no sea el esperado debido a la pérdida de datos.");
    
    }

}
