import java.util.Scanner;

public class tabalsdemultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
    




}
