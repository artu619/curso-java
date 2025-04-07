import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {
    // 1. Agregar frutas a un HashSet y mostrarlos
    HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Mango");
        frutas.add("Pera");
        frutas.add("Sandía");

        System.out.println("Frutas en el HashSet:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println();


    // 2. Comprobar existencia de un elemento dentro de frutas
        String frutaBuscada = "Mango";

        if (frutas.contains(frutaBuscada)) {
            System.out.println(frutaBuscada + " sí está en el HashSet.");
        } else {
            System.out.println(frutaBuscada + " no está en el HashSet.");
        }
        System.out.println("");
    

    // 3. Eliminar un elemento de frutas
        frutas.remove("Mango");

        System.out.println("Frutas después de eliminar 'Mango':");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    // 4. Comprobar el tamaño del HashSet frutas
    System.out.println("El tamaño del HashSet de frutas es: " + frutas.size());


    // 5. Haz un HashSet nuevo llamado frutas2
    // Haz otro HashSet nuevo llamado union que contenga los elementos del HashSet frutas
    // Une ambos (union y frutas2)
    HashSet<String> frutas2 = new HashSet<>();
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Kiwi");
        frutas2.add("Cereza");

        HashSet<String> union = new HashSet<>(frutas);

        union.addAll(frutas2);

        System.out.println("Elementos después de la unión de frutas y frutas2:");
        for (String fruta : union) {
            System.out.println(fruta);
        }
        System.out.println("");


    // 6. Intersección de conjuntos entre frutas y frutas2
        HashSet<String> interseccion = new HashSet<>(frutas);
        interseccion.retainAll(frutas2);
            System.out.println("Intersección entre frutas y frutas2:");
            for (String fruta : frutas) {
            System.out.println(fruta);
        }




    // 7. Diferencia entre conjuntos entre frutas y frutas2
        HashSet<String> Diferencia = new HashSet<>(frutas);
        Diferencia.removeAll(frutas2);
        



        System.out.println("Diferencia entre frutas y frutas2 (elementos en frutas pero no en frutas2):");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }


    // 8. Convertir a ArrayList y ordenar
        ArrayList<String> listaFrutas = new ArrayList<>(frutas);

        Collections.sort(listaFrutas);

        System.out.println("Frutas ordenadas:");
            for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }



    // 9. Eliminar elementos con condición (longitud < 6)
    // Se puede hacer de una manera muy directa, con una lambda...
    

    frutas.removeIf(fruta -> fruta.length() < 6);

    System.out.println("Frutas después de eliminar las de longitud menor a 6:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}
