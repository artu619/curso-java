import java.lang.reflect.Array;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor;
public class _01_ArrayList {
    public static ArrayList<String> nombres = new ArrayList<>();

    public static void ejercicio1() {
        //Crea un ArrayList de String de 5 elementos
        //Muéstralos 1 a 1
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("maria");
        elementos.add("juan");
        elementos.add("paco");
        elementos.add("elena");
        elementos.add("sandra");

        for (String e : elementos) {
            System.out.println(e);
        }
    }

    public static void ejercicio2() {
        //Añade varios nombres al array nombres.
        //Comprueba si existe dentro del ArrayList "Alberto".
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");
        nombres.add("paco");
        nombres.add("Alberto");
        nombres.add("maria");
        nombres.add("julian");

        if (nombres.contains("Alberto")) {
            System.out.println("El nombre de Albero esta en la lista");
        } else {
            System.out.println("El nombre de alberto no esta en la lista");
        }

    }

    public static void ejercicio3() {
        //Elimina un nombre del ArrayList nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        nombres.remove("Hugo");

        System.out.println("la lista depues de borrar el nombre hugo queda de esta manera: " + nombres);

    }

    public static void ejercicio4() {
        //Ordena alfabéticamente los nombres del ArrayList nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        Collections.sort(nombres);

        System.out.println("los nombres ordenado por orden alfabetico quedan de esta manera: ");
        for (String nombre : nombres) {
            System.out.println(nombres);
            break;

        }

    }

    public static void ejercicio5() {
        //Añade en la posición 4 un nombre a nombres.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        nombres.add(4 , "Raul");

        System.out.println("Lista con el nombre añadido en la posición 4:");

        for (String nombre : nombres) {
            System.out.println(nombres);
            break;
        }
    }

    public static void ejercicio6() {
        //Crea una copia de ArrayList y comprueba que son objetos distintos.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");
        
        ArrayList<String> copiaNombres = new ArrayList<>(nombres);

        if (nombres == copiaNombres) {
            System.out.println("Son el mismo objeto.");
        } else {
            System.out.println("Son objetos distintos.");
        }

        System.out.println("\nContenido de nombres:");
        System.out.println(nombres);

        System.out.println("\nContenido de copiaNombres:");
        System.out.println(copiaNombres);
    }

    public static void ejercicio7() {
        //Comprueba cuántas veces aparece cada nombre en ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            int count = 0;

            for (int j = 0; j < nombres.size(); j++){
                if (nombres.get(j).equals(nombre)){
                    count++;
                }
            }

        if (i == 0 || !nombres.get(i).equals(nombres.get(i-1))){
            System.out.println(nombre + ": " + count);
        }

        }


    }

    public static void ejercicio8() {
        //Invierte el orden de ArrayList nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("celia");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raul");

        Collections.reverse(nombres);

        System.err.println("lista invertida de nombres: ");

        for (String nombre : nombres) {
            System.out.println(nombres);
            break;
        }

    }

    public static void main(String[] args) {
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
    }

}
