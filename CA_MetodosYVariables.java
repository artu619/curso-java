public class CA_MetodosYVariables {
    public static void main(String[] args) {
        /*
         * ================================
         * = Variables y Tipos Primitivos =
         * ================================
         */

        // Declara una variable String que contenga tu nombre y muéstralo por pantalla.
        String nombre = "Arturo";
        System.out.println("ejercicio 1: " + nombre);
        System.out.println("");
        
        
        // Declara dos variables int, asígnales valores y muestra la suma de ambas.
        int a = 2;
        int b = 3;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        // Declara dos variables int, asígnales valores y muestra la resta del primero menos el segundo.
        int x = 5;
        int y = 2;
        int resta = x - y;
        System.out.println("La diferencia entre " + x + " y " + y + " es: " + resta);

        // Declara dos variables int y muestra su multiplicación.
        int p = 4;
        int q = 3;
        int producto = p * q;
        System.out.println("El producto de " + p + " y " + q + " es: " + producto);

        // Declara dos variables int y muestra la división entera entre ellas.
        int m = 6;
        int n = 2;
        int division = m / n;
        System.out.println("El cociente entre " + m + " y " + n + " es: " + division);


        // Declara dos variables int y muestra el resultado del operador módulo %.
        int r = 7;
        int s = 2;
        int modulo = r % s;
        System.out.println("El módulo de " + r + " dividido por " + s + " es: " + modulo);

        // Declara una variable String para el nombre y una variable int para la edad.
        // Muestra un mensaje concatenando ambas.
        String nombre1 = "arturo";
        int Edad = 35;
        System.out.println("nombre: " + nombre1 + " Edad: " + Edad);
        System.out.println("");

        // Declara al menos una variable de cada tipo primitivo
        // (byte, short, int, long, float, double, char, boolean)
        // y muestra un mensaje que confirme que todo está bien declarado.
        byte numeroByte = 100;
        short numeroShort = 30000;
        int numeroInt = 1000000;
        long numeroLong = 10000000000L;
        float numeroFloat = 10.5f;
        double numeroDouble = 99.99;
        char caracter = 'A';
        boolean esVerdadero = true;


        // Mostrar mensaje confirmando la declaración
        System.out.println("Todas las variables han sido declaradas correctamente:");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + esVerdadero);
        System.out.println();

        /*
         * =============================
         * = Operaciones con variables =
         * =============================
         * ** A partir de aquí todo o casi todo va a necesitar hacer un método...
         */
        
        saludar();

        // Declara un método que reciba un número como parámetro y lo imprima por pantalla.
        // Llámalo con cualquier valor.
        imprimirNumero(42);
        System.out.println("");

        // Declara un método que reciba dos int, sume ambos y devuelva el resultado. 
        // Muestra el resultado por pantalla.
        int resultado = sumar(20, 10);
        System.out.println("las suma es: " + resultado );
        System.out.println("");
        // Sobrecarga el método saludar para que también acepte un nombre y lo imprima. 
        // Llama ambas versiones.
        saludar();
        saludar("Arturo");
        System.out.println("");

        // Sobrecarga el método suma para que pueda recibir tres números. 
        // Llama a esta versión y muestra el resultado.
        int resultado2 = sumar(5, 15, 25);
        System.out.println("Suma de tres números: " + resultado2);
        System.out.println("");

        // Declara dos variables int, pásalas a un método que sume y devuelva el resultado, y muéstralo.
        // Declarar dos variables enteras
        int num1 = 15;
        int num2 = 25;

        // Pasar las variables al método y almacenar el resultado
        int resultado3 = suma(num1, num2);

        // Mostrar el resultado en pantalla
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado3);

        // Haz una multiplicación entre dos variables double y muestra el resultado.
        double t = 5.5;
        double u = 2.2;
        double resultado4 = t * u;
        System.out.println("El resultado de la multiplicación es: " + resultado4);
        System.out.println("");


        /*
         * =============================
         * = Conversiones y Constantes =
         * ============================= 
         */
        // Declara una variable int y asígnala a una variable double. 
        // Imprime el resultado para comprobar la conversión implícita.
        int numeroEntero = 42;
        double numeroDecimal = numeroEntero;
        System.out.println("Valor int: " + numeroEntero);
        System.out.println("Valor double (conversión implícita): " + numeroDecimal);
        System.out.println("");

        // Declara una variable double y haz una conversión explícita (casting) a int. 
        // Muestra el valor convertido.
        double numeroDecimal1 = 9.99;
        int numeroEntero1 = (int) numeroDecimal1;
        System.out.println("Valor double original: " + numeroDecimal1);
        System.out.println("Valor int después del casting: " + numeroEntero1);
        System.out.println("");

        // Calcula el área de un triángulo utilizando base y altura como double. 
        // Usa la fórmula (base * altura) / 2.
        double base = 5.5;
        double altura = 3.2;
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
        System.out.println("");

        // Declara una variable String para ciudad y una int para el año. 
        // Imprime una frase como “Aprendiendo Java...”.
        String ciudad = "Madrid";
        int año = 2025;
        System.out.println("Aprendiendo Java en " + ciudad + " en el año " + año + ".");
        System.out.println("");

        // Declara un método que reciba un número y devuelva su cuadrado. 
        // Llama al método y muestra el resultado.
        int c = 5;
        int resultad4 = cuadrado (c);
        System.out.println("El cuadrado de " + c + " es: " + resultad4);
        System.out.println("");


        /*
         * ====================================
         * = Operaciones Compuestas y Métodos =
         * ====================================
         */
        // Declara dos variables y muestra cuál es mayor utilizando el operador ternario (? :).

        // Declara tres variables String y concaténalas en una frase completa.

        // Declara dos variables int, multiplícalas y almacena el resultado en una tercera variable. Imprime el resultado.

        // Crea un método que reciba dos enteros y devuelva su promedio como double. Imprime el resultado.

    }
    public static void saludar(){
        System.out.println("hola buenas tardes");
    }
    public static void imprimirNumero(int numero) {
        System.out.println("El número recibido es: " + numero);
    }
    public static int sumar(int a, int b){
        return a + b;

    }
    public static void saludar(String nombre){
        System.out.println("hola bunas tardes " + nombre);

    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int cuadrado(int numero) {
        return numero * numero;
    }




}