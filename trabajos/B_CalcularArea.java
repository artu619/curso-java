/*
 * Calcula el área de un rectángulo, triángulo o círculo.
 * [1] rectángulo
 * [2] triángulo
 * [3] círculo
 * 
 * Área rectángulo: base * altura
 * Área triángulo: (base * altura) / 2
 * Área círculo: PI * radio^2
 */
import java.util.Scanner;

public class B_CalcularArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de áreas");
        System.out.println("[1] Rectángulo");
        System.out.println("[2] Triángulo");
        System.out.println("[3] Círculo");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        
        System.out.println("El área calculada es: " + calcularArea(opcion, scanner));
        scanner.close();




        
    }

    public static double calcularArea(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                System.out.print("Base: ");
                int baseRect = scanner.nextInt();
                System.out.print("Altura: ");
                int alturaRect = scanner.nextInt();
                return baseRect * alturaRect;
            
            case 2:
                System.out.print("Base: ");
                int baseTri = scanner.nextInt();
                System.out.print("Altura: ");
                int alturaTri = scanner.nextInt();
                return (baseTri * alturaTri) / 2.0;
            
            case 3:
                System.out.print("Radio: ");
                double radio = scanner.nextDouble();
                return Math.PI * radio * radio;
            
            default:
                System.out.println("Opción no válida.");
                return 0;
        }
    }
}
