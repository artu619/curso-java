import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _03_HashMap {
    public static void main(String[] args) {
    // 1. Crear un diccionario y añade 5 pares de valor
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("Manzana", "Fruta");
    diccionario.put("Carro", "Vehículo");
    diccionario.put("Perro", "Animal");
    diccionario.put("Libro", "Objeto");
    diccionario.put("Java", "Lenguaje de programación");

    System.out.println("Diccionario:");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave + " - " + diccionario.get(clave));
        }
        System.out.println("");

    // 2. Consultar y modificar un valor
    String valorPerro = diccionario.get("Perro");
    System.out.println("Valor asociado a 'Perro': " + valorPerro);

    diccionario.put("Java", "Tecnología de programación");

    String valorJava = diccionario.get("Java");
        System.out.println("Valor modificado asociado a 'Java': " + valorJava);

    System.out.println("\nDiccionario actualizado:");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave + " - " + diccionario.get(clave));
        }


    
    // 3. Comprobar existencia de clave o valor
    boolean claveExiste = diccionario.containsKey("Carro");
    System.out.println("¿Existe la clave 'Carro'? " + claveExiste);
    System.out.println("");

    boolean valorExiste = diccionario.containsValue("Animal");
        System.out.println("¿Existe el valor 'Animal'? " + valorExiste);
    System.out.println("");
    
    boolean valorNoExiste = diccionario.containsValue("Mango");
        System.out.println("¿Existe el valor 'Mango'? " + valorNoExiste);
    System.out.println("");


    // 4. Eliminar una entrada
    diccionario.remove("Perro");

    diccionario.remove("Java", "Lenguaje de programación");

    System.out.println("Diccionario después de eliminar entradas:");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave + " - " + diccionario.get(clave));
        }

    
    // 5. Mostrar todas las claves y los valores
    System.out.println("Claves y valores usando keySet():");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave + " - " + diccionario.get(clave));
        }

    
    // 6. Contar caracteres en una frase
    String frase = "me estoy peleando con HashMap";
    HashMap<Character, Integer> frecuenciaCaracteres = new HashMap<>();

    for (char c : frase.toCharArray()) {
        frecuenciaCaracteres.put(c, frecuenciaCaracteres.getOrDefault(c, 0) + 1);
    }
    System.out.println("Frecuencia de cada carácter en la frase:");
        for (char c : frecuenciaCaracteres.keySet()) {
            System.out.println(c + " - " + frecuenciaCaracteres.get(c));
    }
    int totalCaracteres = frase.length();
        System.out.println("\nTotal de caracteres en la frase (incluyendo espacios): " + totalCaracteres);


    // 7. Agrupar nombres por inicial
    String[] listaNombres = {"Ana", "Andrés", "Bea", "Carlos", "Carmen"};
    // Crear un HashMap para agrupar los nombres por inicial
    HashMap<Character, List<String>> agrupadosPorInicial = new HashMap<>();

    // Recorrer la lista de nombres
    for (String nombre : listaNombres) {
        // Obtener la inicial del nombre
        char inicial = nombre.charAt(0);

        // Si ya existe una lista para esa inicial, añadir el nombre
        if (!agrupadosPorInicial.containsKey(inicial)) {
            // Si no existe, crear una nueva lista para esa inicial
            agrupadosPorInicial.put(inicial, new ArrayList<>());
        }

        // Añadir el nombre a la lista correspondiente a la inicial
        agrupadosPorInicial.get(inicial).add(nombre);
    }

    // Mostrar los nombres agrupados por inicial
    System.out.println("Nombres agrupados por inicial:");
    for (char inicial : agrupadosPorInicial.keySet()) {
        System.out.println(inicial + ": " + agrupadosPorInicial.get(inicial));
    }


    // 8. Invertir un HashMap (valores únicos)
    HashMap<String, String> originalMap = new HashMap<>();
        originalMap.put("Ana", "A001");
        originalMap.put("Andrés", "A002");
        originalMap.put("Bea", "B001");
        originalMap.put("Carlos", "C001");
        originalMap.put("Carmen", "C002");

    HashMap<String, String> invertedMap = new HashMap<>();

    for (String key : originalMap.keySet()) {
        String value = originalMap.get(key);
        invertedMap.put(value, key);  // Invertimos la clave y el valor
    }

    // Mostrar el HashMap invertido
    System.out.println("HashMap invertido:");
    for (String key : invertedMap.keySet()) {
        System.out.println(key + " : " + invertedMap.get(key));
    }

    
    // 9. HashMap con claves nombres y anidaciones...
    // key es el nombre
    // dentro de cada nombre tiene que haber otros dos pares de valores:
    // tlfn y email.
     // Crear el HashMap principal
    HashMap<String, HashMap<String, String>> contactos = new HashMap<>();

    // Crear y añadir la información de "Ana"
    HashMap<String, String> anaDetalles = new HashMap<>();
    anaDetalles.put("tlfn", "123456789");
    anaDetalles.put("email", "ana@example.com");
    contactos.put("Ana", anaDetalles);

    // Crear y añadir la información de "Andrés"
    HashMap<String, String> andresDetalles = new HashMap<>();
    andresDetalles.put("tlfn", "987654321");
    andresDetalles.put("email", "andres@example.com");
    contactos.put("Andrés", andresDetalles);

    // Crear y añadir la información de "Bea"
    HashMap<String, String> beaDetalles = new HashMap<>();
    beaDetalles.put("tlfn", "555123456");
    beaDetalles.put("email", "bea@example.com");
    contactos.put("Bea", beaDetalles);

    // Mostrar los contactos con sus detalles
    System.out.println("Detalles de contactos:");
    for (String nombre : contactos.keySet()) {
        HashMap<String, String> detalles = contactos.get(nombre);
        System.out.println(nombre + ":");
        System.out.println("  Teléfono: " + detalles.get("tlfn"));
        System.out.println("  Email: " + detalles.get("email"));
        System.out.println();
    }


    // 10. Agenda simple con búsqueda
    // Verifica en el HashMap anterior un contacto.



    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el nombre del contacto a buscar: ");
    String nombreBuscado = scanner.nextLine();

    if (contactos.containsKey(nombreBuscado)){
        HashMap<String, String> detalles = contactos.get(nombreBuscado);
            System.out.println("Detalles de " + nombreBuscado + ":");
            System.out.println("  Teléfono: " + detalles.get("tlfn"));
            System.out.println("  Email: " + detalles.get("email"));
    }else{
        System.out.println("No se encontró el contacto con el nombre: " + nombreBuscado);
    }
    scanner.close();

    }
}