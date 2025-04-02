/*
 * Tienes que convertir una cantidad de USD a:
 * [1] Euro
 * [2] Libra Esterlina
 * [3] Yen Japonés
 * 
 * Utiliza tasas de conversión fijas:
 * USD a Euro -> 0.85
 * USD a Libra Esterlina -> 0.75
 * USD a Yen Japonés -> 110.0
 */



import java.util.*;

public class B_ConversorMonedas {
    public static double convertirMoneda(double cantidad, int opcionOrigen, int opcionDestino) {
        double[] tasas = {1.0, 0.85, 0.75, 110.0}; // [USD, Euro, Libra Esterlina, Yen Japonés]
        
        if (opcionOrigen >= 1 && opcionOrigen <= 4 && opcionDestino >= 1 && opcionDestino <= 4) {
            return cantidad * (tasas[opcionDestino - 1] / tasas[opcionOrigen - 1]);
        } else {
            System.out.println("Opción no válida");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la moneda de origen:");
            System.out.println("1: USD");
            System.out.println("2: Euro");
            System.out.println("3: Libra Esterlina");
            System.out.println("4: Yen Japonés");
            System.out.print("Opción: ");
            int opcionOrigen = sc.nextInt();
            
            System.out.print("Ingrese la cantidad a convertir (puede incluir decimales): ");
            double cantidad = sc.nextDouble();
            
            System.out.println("Seleccione la moneda de destino:");
            System.out.println("1: USD");
            System.out.println("2: Euro");
            System.out.println("3: Libra Esterlina");
            System.out.println("4: Yen Japonés");
            System.out.print("Opción: ");
            int opcionDestino = sc.nextInt();
            
            double resultado = convertirMoneda(cantidad, opcionOrigen, opcionDestino);
            if (resultado != -1) {
                System.out.println("Cantidad convertida: " + resultado);
            }
            
            System.out.print("¿Desea realizar otra conversión? (s/n): ");
            char respuesta = sc.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            }
        }

        sc.close();
        System.out.println("Gracias por usar el conversor de monedas.");
    }
}