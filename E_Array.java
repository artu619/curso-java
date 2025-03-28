
import java.text.Normalizer;

// EJERCICIOS BÁSICOS DE CREACIÓN DE ARRAYS EN JAVA SIN USAR BUCLES

public class E_Array {
    public static void main(String[] args) {

        // 1. Crear un array de 5 enteros e imprimirlos uno a uno.
         // Declarar un array fijo con 5 números
        int[] numeros = new int[5];

         // Asignar valores manualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

 
         // Imprimir los elementos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        

        }

        // 2. Crear un array de 3 Strings con nombres e imprimirlos.
        // declarrar el array fijo de numeros
        String [] nombres = new String [3];

        // Asignar nombre manualente
        nombres [0] = "manuel";
        nombres [1] = "pepe";
        nombres [2] ="sofia";

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres [i]);
        }




        // 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
        //Decclarar los valores booleanos en 4
        boolean [] valores = new boolean[4];
        //añadir valores
        valores[0] = true;
        valores[1] = false;
        valores[2] = true;
        valores[3] = false;  // Puedes asignar este valor o dejarlo como 'false' por defecto

        //hacer que los imprima
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores [i]);
        }





        // 4. Crear un array de caracteres que contenga las vocales.
        // Declarar un array de caracteres con las vocales
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        //hacer que lo imprima
        for (int i = 0; i < vocales.length; i++) {
            System.out.println("Vocal[" + i + "] = " + vocales[i]);
        }

        // 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
        // Declarar un array de 10 enteros sin inicializar
        int[] num = new int[10];

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
        double[] nume = new double[6];

        for (int i = 0; i < nume.length; i++) {
            nume[i] = (i + 1) * 1.5;  // Asignamos valores, por ejemplo, múltiplos de 1.5
        }

        // Imprimir los valores del array
        for (int i = 0; i < nume.length; i++) {
            System.out.println("numero[" + i + "] = " + nume[i]);
        }


        // 6.1 Al array de 6 números que acabas de crear ahora le vas a cambiar el valor
        // de cada uno de sus elementos. (Tienen que seguir siendo del mismo tipo).
        double[] numer = new double[6];

        for (int i = 0; i < numer.length; i++) {
            numer[i] = (i + 2) * 1.8;  // Asignamos valores, por ejemplo, múltiplos de 1.5
        }

        // Imprimir los valores del array
        for (int i = 0; i < numer.length; i++) {
            System.out.println("numero[" + i + "] = " + numer[i]);
        }

        // 7. Crear un array con los días de la semana e imprimir solo los días laborables.
         // Declarar un array con los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

         // Imprimir solo los días laborables (lunes a viernes)
        System.out.println("Días laborables:");
            for (int i = 0; i < 5; i++) {
                 System.out.println(diasSemana[i]);  // Solo imprimir de lunes a viernes
        }

        // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
         // Declarar e inicializar un array de tipo byte con 5 elementos
        byte[] n = {10, 20, 30, 40, 50};

         // Imprimir los valores del array
        System.out.println("Valores del array:");
            for (int i = 0; i < n.length; i++) {
                System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
        float[] nu = {2.6f, 1.8f, 3.2f, 2.0f};

        // Mostrar solo los valores mayores a 2.5
        System.out.println("Números mayores a 2.5:");
        for (int i = 0; i < nu.length; i++) {
            if (nu[i] > 2.5) {
                System.out.println("numeros[" + i + "] = " + nu[i]);
            }
        }

        // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
    }
}