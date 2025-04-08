import java.io.*;
import java.util.*;

public class PracticarConFicheros {

    // Ejercicio 1: Crear archivo con saludo personalizado
    // Debe indicar si el archivo se ha creado o no.
    // Ejemplo: Hola NOMBRE. Bienvenido.
    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        String saludo = "Hola " + nombre + ". Bienvenido a java.";
    try {
        FileWriter escritor = new FileWriter("saludo.txt");
            escritor.write(saludo);
            escritor.close();
            System.out.println("El archivo 'saludo.txt' se ha creado correctamente.");
    }catch (IOException e) {
        System.out.println("No se pudo crear el archivo.");
        e.printStackTrace();
    }
    // scanner.close();

    }

    // Ejercicio 2: Añadir líneas a un diario personal
    // Recuerda que no quieres reescribir el archivo. (true...)
    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu entrada para el diario: ");
        String entrada = scanner.nextLine(); // Obtener la entrada del usuario

        try {
            FileWriter escritor = new FileWriter("diario.txt", true);
            escritor.write(entrada + "\n"); // Agregar nueva línea al final
            escritor.close(); // Cerrar el escritor
            System.out.println("Tu entrada se ha guardado en el diario.");
            
        } catch (Exception e) {
            System.out.println("No se pudo guardar la entrada.");
            e.printStackTrace();


        } finally {
            // scanner.close();

        }
    }

    // Ejercicio 3: Eliminar archivo de prueba
    // Crea un archivo que se llame borrar.txt que contenga al menos una frase de texto
    // Elimina el archivo que acabas de crear.
    public static void ejercicio3() {
        File archivo = new File("borrar.txt");
        
        try {
            // Crear el archivo si no existe
            if (archivo.createNewFile()) {
                // Escribir una frase en el archivo
                FileWriter writer = new FileWriter(archivo);
                writer.write("Este es un archivo de prueba para eliminar.");
                writer.close();
                System.out.println("El archivo 'borrar.txt' ha sido creado.");
            } else {
                System.out.println("El archivo 'borrar.txt' ya existe.");
            }
            
            // Paso 2: Eliminar el archivo 'borrar.txt'
            if (archivo.delete()) {
                System.out.println("El archivo 'borrar.txt' ha sido eliminado.");
            } else {
                System.out.println("El archivo no se pudo eliminar.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    // Ejercicio 4: Menú interactivo para manejar ficheros
    /*
    Mostrar un menú con las opciones:
        1.Crear archivo
        2.Escribir texto
        3.Añadir más texto
        4.Ver contenido
        5.Eliminar archivo
    Usar switch y try-catch para manejar errores.
    En la opción 1: simplemente crea el archivo.
    En la opción 2: escribe texto en él.
    En la opción 3: cuidado, no quieres reescribir el archivo, quieres añadir texto.
    En la opción 4: lectura de archivo (hasNextLine...)
    En la opción 5: eliminar archivo.
    */
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        File archivo = new File("archivo.txt");
        System.out.println("1. Crear archivo\n2. Escribir texto\n3. Añadir texto\n4. Ver contenido\n5. Eliminar archivo");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        try {
            switch (opcion) {
                case 1: // Crear archivo
                    if (archivo.createNewFile()) {
                        System.out.println("El archivo ha sido creado.");
                    } else {
                        System.out.println("El archivo ya existe.");
                    }
                    break;
                case 2: // Escribir texto
                    System.out.print("Escribe el texto que deseas escribir en el archivo: ");
                    String texto = scanner.nextLine();
                    try (FileWriter writer = new FileWriter(archivo)) {
                        writer.write(texto);
                        System.out.println("Texto escrito en el archivo.");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el archivo.");
                    }
                    break;
                case 3: // Añadir más texto
                    System.out.print("Escribe el texto que deseas añadir al archivo: ");
                    String textoAñadir = scanner.nextLine();
                    try (FileWriter writer = new FileWriter(archivo, true)) {
                        writer.write("\n" + textoAñadir);
                        System.out.println("Texto añadido al archivo.");
                    } catch (IOException e) {
                        System.out.println("Error al añadir texto al archivo.");
                    }
                    break;
                case 4: // Ver contenido
                    if (archivo.exists()) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                            String linea;
                            while ((linea = reader.readLine()) != null) {
                                System.out.println(linea);
                            }
                        } catch (IOException e) {
                            System.out.println("Error al leer el archivo.");
                        }
                    } else {
                        System.out.println("El archivo no existe.");
                    }
                    break;
                case 5: // Eliminar archivo
                    if (archivo.exists()) {
                        if (archivo.delete()) {
                            System.out.println("El archivo ha sido eliminado.");
                        } else {
                            System.out.println("Error al eliminar el archivo.");
                        }
                    } else {
                        System.out.println("El archivo no existe.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    
    }




    // Ejercicio 5: Copiar contenido de un archivo a otro
    public static void ejercicio5() {
        String archivoOrigen = "archivo.txt";   // Asegúrate de que el archivo origen exista
        String archivoDestino = "copia.txt"; // Este es el archivo de destino

        // Llamar al método de copiar
        copiarArchivo(archivoOrigen, archivoDestino);
    }

    public static void copiarArchivo(String origen, String destino) {
            // Declarar los streams
            FileInputStream fis = null;
            FileOutputStream fos = null;
        
            try {
                // Abrir los archivos de entrada y salida
                fis = new FileInputStream(origen);
                fos = new FileOutputStream(destino);
                
                int byteLeido;
                // Leer el archivo origen byte a byte y escribirlo en el archivo destino
                while ((byteLeido = fis.read()) != -1) {
                    fos.write(byteLeido);
                }
                
                System.out.println("El archivo ha sido copiado exitosamente.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Cerrar los streams en el bloque finally
                try {
                    if (fis != null) fis.close();
                    if (fos != null) fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    
        }


    // Ejercicio 6: Crear archivo con varios nombres (nombre1, nombre2, nombre3)
    public static void ejercicio6() {
    String archivo = "nombres.txt";
    FileWriter fw = null;
    BufferedWriter bw = null;

    try {
        // Abrir el archivo para escritura
        fw = new FileWriter(archivo);
        bw = new BufferedWriter(fw);

        // Escribir los nombres en el archivo
        bw.write("nombre1\n");
        bw.write("nombre2\n");
        bw.write("nombre3\n");

        System.out.println("Los nombres han sido escritos exitosamente en el archivo.");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (bw != null) bw.close();
            if (fw != null) fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }

    // Ejercicio 7: Leer archivo línea por línea con número de línea
    // ejemplo: Linea X: texto_de_la_línea
    public static void ejercicio7() {
        String archivo = "nombres.txt"; // Asegúrate de que el archivo exista
    BufferedReader br = null;

    try {
        // Abrir el archivo para lectura
        br = new BufferedReader(new FileReader(archivo));
        
        String linea;
        int numeroLinea = 1;
        
        // Leer cada línea e imprimirla con el número de línea
        while ((linea = br.readLine()) != null) {
            System.out.println("Linea " + numeroLinea + ": " + linea);
            numeroLinea++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (br != null) br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    // Ejercicio 8: Borrar contenido del archivo pero sin eliminar el archivo
    public static void ejercicio8() {
        String archivo = "nombres.txt"; // Asegúrate de que el archivo exista
        FileWriter fw = null;
    
        try {
            // Abrir el archivo en modo de escritura para borrar el contenido
            fw = new FileWriter(archivo);
            // No escribir nada, simplemente vaciar el archivo
            System.out.println("El contenido del archivo ha sido borrado.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // Ejercicio 9: Contador de líneas
    public static void ejercicio9() {
        String archivo = "nombres.txt"; // Asegúrate de que el archivo exista
    BufferedReader br = null;
    int contadorLineas = 0;

    try {
        // Abrir el archivo para lectura
        br = new BufferedReader(new FileReader(archivo));
        
        while (br.readLine() != null) {
            contadorLineas++;
        }

        System.out.println("El archivo tiene " + contadorLineas + " líneas.");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (br != null) br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    // Método principal para probar ejercicios
    public static void main(String[] args) {
        // Llama aquí al ejercicio que quieras probar
        // ejercicio1();
        // ejercicio2();
        ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();

    }
}
