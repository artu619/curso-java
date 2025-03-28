// EJERCICIOS BÁSICOS DE CREACIÓN DE ARRAYS EN JAVA

/*
 * Estos ejercicios están diseñados para trabajar únicamente la creación y el acceso básico a arrays en Java,
 * sin usar estructuras más avanzadas o clases adicionales. Luego se incluyen ejercicios con métodos básicos del array.
 */

 public class FA_BucleArray {
    public static void main(String[] args) {

        // 1. Crear un array de 5 enteros e imprimirlos uno a uno.
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer e imprimir cada número del array
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
        System.out.println("");

        // 2. Crear un array de 3 Strings con nombres e imprimirlos.
         // Declarar e inicializar un array de 3 nombres
        String[] nombres = {"Ana", "Carlos", "Elena"};

         // Recorrer e imprimir cada nombre del array
        System.out.println("Nombres en el array:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }
        
        System.out.println("");
        // 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
        boolean [] booleanos = {true, false,true, false};

        System.out.println("Valores buleanos: ");
        for(int i = 0; i < booleanos.length; i++) {
            System.out.println("buleanos: [" + i + "] = " + booleanos[i]);
        }
        

        // 4. Crear un array de caracteres que contenga las vocales.
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'á'};
        System.out.println("");

        //hacer que lo imprima
        System.out.println("Vocales: ");
        for (int i = 0; i < vocales.length; i++) {
            System.out.println("Vocal[" + i + "] = " + vocales[i]);
        }
        

        // 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
        // Declarar un array de 10 enteros sin inicializar
        int[] num = new int[10];
        System.out.println("");

        // Asignar los valores del 1 al 10
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        // Mostrar los valores del array
        System.out.println("Valores del array:");
            for (int i = 0; i < num.length; i++) {
                System.out.println("num[" + i + "] = " + num[i]);
        }
        

        // 6. Crear un array de 6 números dobles e imprimir el doble de cada valor.
        double[] numerosDobles = {15, 20, 38, 45, 52, 61};
        System.out.println("");

        // Recorrer e imprimir el doble de cada valor
        System.out.println("Doble de cada número:");
            for (int i = 0; i < numerosDobles.length; i++) {
                System.out.println("El doble de " + numerosDobles[i] + " es " + (numerosDobles[i] * 2));
        }
        System.out.println("");

        // 7. Crear un array con los días de la semana e imprimir solo los días laborables.
        String[] diasSemanas ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.println("Dias laborales: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(diasSemanas[i]);
        }
        System.out.println("");
        

        // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
        byte[] n = {18, 24, 45, 38, 55};

        System.out.println("Volores Array: ");
        for (int i = 0; i < n.length; i++) {
            if(n[i] < 10) {}
            else if(n[i] > 50){ }
            else {
                
                System.out.println("numeros[" + i + "] = " + n[i]);
            }
        }



        

        // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
        System.out.println("");
        float[] nu = {2.6f, 1.8f, 3.2f, 2.0f};

        // Mostrar solo los valores mayores a 2.5
        System.out.println("Números mayores a 2.5:");
        for (int i = 0; i < nu.length; i++) {
            if (nu[i] > 2.5) {
                System.out.println("numeros[" + i + "] = " + nu[i]);
            }
        }
        

        // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
        System.out.println("");
        // Declarar e inicializar un array con valores negativos y positivos
        int[] numerosNegativos = {-5, -10, 15, 20, -30, -25, 40,};

        // Variable para contar los números negativos
        int contadorNegativos = 0;

         // Recorrer el array con un bucle y contar los números negativos
        for (int numero : numerosNegativos) {
            if (numero < 0) {
                contadorNegativos++;
            }
            
        }
        // Imprimir la cantidad de números negativos encontrados
    System.out.println("Cantidad de números negativos: " + contadorNegativos);

    // Mostrar el tamaño del array usando 'length'
    System.out.println("");
    
    
    
    
    
    // EJERCICIOS USANDO MÉTODOS BÁSICOS DE ARRAYS
    
    // 11. Usar length para mostrar el tamaño del array declarado en el ejercicio 10.
    
    System.out.println("El tamaño del array es: " + numerosNegativos.length);

        // 12. Buscar un número dentro de un array usando un bucle.
        

        // 13. Encontrar el valor máximo en un array.
        

        // 14. Calcular la suma de todos los elementos de un array.
        

        // 15. Mostrar los elementos de un array en orden inverso.
        

        // 16. Duplicar los valores de un array en otro nuevo.
        

        // 17. Comprobar si dos arrays son iguales (elemento a elemento).
        

        // 18. Contar cuántos valores son pares en un array.
        

        // 19. Reemplazar todos los valores menores que 5 con un 0.
        

        // 20. Copiar manualmente los elementos de un array a otro.
        
    }
}