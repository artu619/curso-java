import java.util.Scanner;
public class DA_CondicionesSwitch {
    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    // según el número que sea que muestre por pantalla 
    // el día de la semana en palabras (Lunes, Martes, Miércoles...)
    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingesar un numero(1-7) : ");
        int numero = scanner.nextInt();
        scanner.close();


        String dia;
        switch (numero) {
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miercoles"; break;
            case 4: dia = "juves"; break;
            case 5: dia = "viernes"; break;
            case 6: dia = "sabado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Número inválido. Debe ser entre 1 y 7.";
                
            
        }
        System.out.println("El día es: " + dia);


    }

    // 2. Calificación con letra
    // A = Excelente, B = Notable, C = Aprobado, D = Insuficiente
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la puntuación del examen (0-10): ");
        int puntuacion = sc.nextInt();
        sc.close();

        String calificacion;

        switch (puntuacion) {
            case 10:
            case 9:
                calificacion = "A - Excelente";
                break;
            case 8:
            case 7:
                calificacion = "B - Notable";
                break;
            case 6:
                calificacion = "C - Aprobado";
                break;
            case 5:
                calificacion = "D - Insuficiente";
                break;
            case 4: case 3: case 2: case 1: case 0:
                calificacion = "F - Reprobado";
                break;
            default:
                calificacion = "Puntuación no válida";
        }

        System.out.println("Resultado: " + calificacion);

        

    }

    // 3. Menú de opciones: genera un menú para iniciar un juego
    // que tenga varias opciones:
    // 1 -> Seleccionaste Nueva partida
    // 2 -> Seleccionaste Cargar partida
    // 3 -> Seleccionaste Salir
    // Opción inválida

    public static void ejercicio3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("===== MENÚ DEL JUEGO =====");
        System.out.println("1 -> Nueva partida");
        System.out.println("2 -> Cargar partida");
        System.out.println("3 -> Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = scan.nextInt();
        scan.close();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste Nueva partida");
                break;
            case 2:
                System.out.println("Seleccionaste Cargar partida");
                break;
            case 3:
                System.out.println("Seleccionaste Salir. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida");
        }
     
    }

    // 4. Estación del año: verifica en qué estación estás
    // declara una variable que contenga el nombre de la estación
    // verifica el nombre de la estación y cuando se dé el caso correcto
    // que muestre por pantalla: "Estás en [estacion]" 
    // [estacion] --> hace referencia al valor de la variable que 
    //                contiene el nombre de la estación
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una estación del año (verano, otoño, invierno, primavera): ");
        String estacion = scanner.nextLine().toLowerCase(); // Convierte la entrada a minúsculas
        scanner.close();

        switch (estacion) {
            case "verano":
            case "otoño":
            case "invierno":
            case "primavera":
                System.out.println("Estás en " + estacion);
                break;
            default:
                System.out.println("Estación no válida");
        }
        
    }

    // 5. Tipo de figura geométrica
    // 3 -> triángulo
    // 4 -> cuadrado o rectángulo
    // 5 -> pentágono
    // 6 -> hexágono
    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el número de la figura geométrica:");
        System.out.println("1 -> óvalo");
        System.out.println("2 -> trapecio");
        System.out.println("3 -> Triángulo");
        System.out.println("4 -> Cuadrado o Rectángulo");
        System.out.println("5 -> Pentágono");
        System.out.println("6 -> Hexágono");
        System.out.print("Opción: ");
        
        int opcion = scanner.nextInt();
        scanner.close();

        switch (opcion) {
            case 1:
                System.out.println("La figura seleccionada es un óvalo.");
                break;
            case 2:
                System.out.println("la figura seleccionda es un trapecio.");
                break;
            case 3:
                System.out.println("La figura seleccionada es un Triángulo.");
                break;
            case 4:
                System.out.println("La figura seleccionada es un Cuadrado o Rectángulo.");
                break;
            case 5:
                System.out.println("La figura seleccionada es un Pentágono.");
                break;
            case 6:
                System.out.println("La figura seleccionada es un Hexágono.");
                break;
            default:
                System.out.println("Opción inválida.");
        } 
    }

    // 6. Tipo de moneda
    // USD -> Dolar
    // EUR -> Euro
    // GBP -> Libra
    // JPY -> Yen
    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la moneda (USD, EUR, GBP, JPY): ");
        String moneda = scanner.nextLine().toUpperCase(); // Convertimos la entrada a mayúsculas
        scanner.close();

        switch (moneda) {
            case "USD":
                System.out.println("La moneda es Dólar (USD).");
                break;
            case "EUR":
                System.out.println("La moneda es Euro (EUR).");
                break;
            case "GBP":
                System.out.println("La moneda es Libra (GBP).");
                break;
            case "JPY":
                System.out.println("La moneda es Yen (JPY).");
                break;
            default:
                System.out.println("Código de moneda no válido.");
        }
        
    }

    // 7. Número de mes: verifica el mes según su número (del 1 al 12)
    // Enero, Febrero...
    public static void ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        scanner.close();

        switch (mes) {
            case 1:
                System.out.println("El mes es Enero.");
                break;
            case 2:
                System.out.println("El mes es Febrero.");
                break;
            case 3:
                System.out.println("El mes es Marzo.");
                break;
            case 4:
                System.out.println("El mes es Abril.");
                break;
            case 5:
                System.out.println("El mes es Mayo.");
                break;
            case 6:
                System.out.println("El mes es Junio.");
                break;
            case 7:
                System.out.println("El mes es Julio.");
                break;
            case 8:
                System.out.println("El mes es Agosto.");
                break;
            case 9:
                System.out.println("El mes es Septiembre.");
                break;
            case 10:
                System.out.println("El mes es Octubre.");
                break;
            case 11:
                System.out.println("El mes es Noviembre.");
                break;
            case 12:
                System.out.println("El mes es Diciembre.");
                break;
            default:
                System.out.println("Número de mes no válido. Debe ser un valor entre 1 y 12.");
        }
        
    }

    // 8. Clasificación por edad y periodo escolar
    // de 3 a 5 años: Infantil
    // de 6 a 11 años: Primaria
    // de 12 a 15 años: ESO
    // de 16 a 17 años: Bachillerato
    // de 18 a 21 años: Universidad
    // de 22 en adelante: Persona formada
    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        // Clasificación por edad y periodo escolar
        if (edad >= 3 && edad <= 5) {
            System.out.println("Clasificación: Infantil.");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Clasificación: Primaria.");
        } else if (edad >= 12 && edad <= 15) {
            System.out.println("Clasificación: ESO.");
        } else if (edad >= 16 && edad <= 17) {
            System.out.println("Clasificación: Bachillerato.");
        } else if (edad >= 18 && edad <= 21) {
            System.out.println("Clasificación: Universidad.");
        } else if (edad >= 22) {
            System.out.println("Clasificación: Persona formada.");
        } else {
            System.out.println("Edad no válida para clasificación escolar.");
        }
        
    }

    // 9. Letra del DNI para un número fijo
    // Para calcular la letra se divide el número del DNI
    // entre 23 y el resto indica la letra, según la tabla
    // que encontraréis en este link:
    // https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/#:~:text=Por%20ejemplo%2C%20si%20el%20n%C3%BAmero,n%C3%BAmeros%20y%20d%C3%ADgito%20de%20control.
    public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número del DNI (sin la letra)
        System.out.print("Ingrese el número de su DNI (sin la letra): ");
        int numeroDNI = scanner.nextInt();
        scanner.close();
        
        // Definir la lista de letras posibles según el residuo
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Calcular el residuo de la división entre 23
        int residuo = numeroDNI % 23;
        
        // Obtener la letra correspondiente y mostrarla
        char letraDNI = letras[residuo];
        System.out.println("La letra del DNI es: " + letraDNI);

        
    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el color del semáforo (rojo, amarillo, verde):");
        String color = scan.nextLine().toLowerCase();
        scan.close();

        switch (color){
            case "rojo":
                System.out.println("el semaforo esta en ROJO, DENTETE.");
                break;
            case "amarillo":
                System.out.println("el semaforo esta en AMARILLO, PRECACION.");
                break;
            case "verde":
                System.out.println("el semaforo enta en VERDE,ADELANTE.");
                break;
            default:
                System.out.println("Este color no exite en el semaforo.");

        }

        
    }

    // Método main para ejecutar todos los ejercicios
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        
    }
}
