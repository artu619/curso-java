import java.time.Year;
import java.util.Scanner;

public class D_Condiciones {
    

    // 1. Verificar si un número es positivo
    public static void ejercicio1() {
        int num1 = 10;
        if (num1 >0){

         System.out.println("el numero " + num1 + " es positivo." );
        }
       



    }



    // 2. Verificar si un número es negativo
    public static void ejercicio2() {
        int num2 = -10;
        if (num2 <0){
            System.out.println("el numero: " + num2 + " es negativo.");

        }

    }

    // 3. Verificar si un número es cero
    public static void ejercicio3() {
        int num3 = 0;
        if (num3 ==0){
            System.out.println("el numero: " + num3 + " es igual a cero. ");

        }

    }

    // 4. Comprobar si un número es par
    public static void ejercicio4() {
        int num4 = 2;
        if (num4 % 2==0){

            System.out.println("el numero: " + num4 + " es par.");
        }

    }

    // 5. Comprobar si un número es impar
    public static void ejercicio5() {
        int num5 = 3;
        if (num5 %2 !=0){
            System.out.println("el en numero es impar: " + num5);



        }

    }

    // 6. Verificar si una persona es mayor de edad
    public static void ejercicio6() {
        int num6 = 25;
        if (num6 >= 18) {
            System.out.println("esta persona es mayor de edad: " + num6);
        } 


    }

    // 7. Comparar dos números
    public static void ejercicio7() {
        int num7 = 20;
        int num71 = 20;
        if (num7 > num71) {
            System.out.println(num7 + " es mayor que " + num71);
        } else if (num7 < num71) {
            System.out.println(num7 + " es menor que " + num71);   
        } else {
            System.out.println(num7 + " es igual a " + num71);
        }

    }

    // 8. Validar si un número está en un rango
    public static void ejercicio8() {
        int num8 = 25;
        int min = 10;
        int max = 20;
        if (num8 >= min && num8 <= max) {
            System.out.println(num8 + " esta en rango [" + min + " , " + max + "]");
        } else {
            System.out.println(num8 + " esta fuera del rengo [" + min + " , " + max + "]");
        }


    }

    // 9. Verificar si un carácter es una vocal
    public static void ejercicio9() {
        char letra = 'A';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println(letra + " es una vocal.");
        } else {
            System.out.println(letra + " no es una vocal.");
        }



    }

    // 10. Determinar si un año es bisiesto
    public static void ejercicio10() {
        int año = 2025; // Puedes cambiar este valor para probar
        
        if (Year.isLeap(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

    }

    // 11. Evaluar si un número es positivo, negativo o cero
    public static void ejercicio11() {
        int num11 = 0; // Puedes cambiar este valor para probar

        if (num11 > 0) {
            System.out.println(num11 + " es un número positivo.");
        } else if (num11 < 0) {
            System.out.println(num11 + " es un número negativo.");
        } else {
            System.out.println("El número es cero.");
        }


    }

    // 12. Determinar si se puede acceder a un evento (mayor de edad y con entrada)
    public static void ejercicio12() {
        int edad = 30; // Cambia este valor para probar
        int entrada = 1; // Usa 1 para tener entrada, 0 para no tener entrada

        if (edad >= 18 && entrada == 1) {
            System.out.println("¡Puedes acceder al evento!");
        } else {
            System.out.println("No puedes acceder al evento.");
        }


    }

    // 13. Verificar si un número es divisible entre 3 y 5
    public static void ejercicio13() {
        int num13 = 14; // Cambia este valor para probar

        if (num13 % 3 == 0 && num13 % 5 == 0) {
            System.out.println("El número es divisible entre 3 y 5.");
        } else {
            System.out.println("El número no es divisible entre 3 y 5.");
        }

    }

    // 14. Comprobar si un número no está en un rango
    public static void ejercicio14() {
        int num14 = 55; // Cambia este valor para probar
        int limiteInferior = 10;
        int limiteSuperior = 50;

        if (num14 < limiteInferior || num14 > limiteSuperior) {
            System.out.println("El número no está en el rango.");
        } else {
            System.out.println("El número está en el rango.");
        }


    }

    // 15. Determinar el mayor de tres números
    public static void ejercicio15() {
        int num1 = 50; // Cambia este valor para probar
        int num2 = 25; // Cambia este valor para probar
        int num3 = 15; // Cambia este valor para probar

        int mayor = num1; // Asumimos que num1 es el mayor inicialmente

        if (num2 > mayor) {
            mayor = num2; // Si num2 es mayor que el valor actual de "mayor", actualizamos
        }

        if (num3 > mayor) {
            mayor = num3; // Si num3 es mayor que el valor actual de "mayor", actualizamos
        }
        System.out.println("El mayor de los tres números es: " + mayor);

    }

    // 16. Verificar si una persona puede votar (edad >= 18)
    public static void ejercicio16() {
        int edad16 = 16; // Cambia este valor para probar

        if (edad16 >= 18) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona no puede votar.");
        }


    }

    // 17. Clasificar un número como positivo par, positivo impar, negativo par o negativo impar
    public static void ejercicio17() {
        int num17 = 7; // Cambia este valor para probar

        if (num17 > 0) {
            // Si el número es positivo
            if (num17 % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        } else if (num17 < 0) {
            // Si el número es negativo
            if ( num17 % 2 == 0) {
                System.out.println("El número es negativo y par.");
            } else {
                System.out.println("El número es negativo e impar.");
            }
        } else {
            // Si el número es 0
            System.out.println("El número es 0.");
        }

    }

    // 18. Validar si una persona tiene acceso VIP (edad > 21 o paga extra)
    public static void ejercicio18() {
        int edad = 22; // Cambia este valor para probar
        int pagoExtra = 50; // Cambia este valor para probar (0 si no pagó extra)

        if (edad > 21 || pagoExtra > 0) {
            System.out.println("La persona tiene acceso VIP.");
        } else {
            System.out.println("La persona no tiene acceso VIP.");
        }

    }

    // 19. Evaluar si dos variables booleanas son verdaderas
    public static void ejercicio19() {
        int var1 = 0; // 1 es verdadero, 0 es falso
        int var2 = 0; // 1 es verdadero, 0 es falso

        if (var1 == 1 && var2 == 1) {
            System.out.println("Ambas condiciones son verdaderas.");
        } else {
            System.out.println("Al menos una de las condiciones no es verdadera.");
        }

    }

    // 20. Clasificar la nota de un examen
    public static void ejercicio20() {
        int nota = 100; // Cambia este valor para probar

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 75) {
            System.out.println("Aprobado");
        } else if (nota >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspendido");
        }

    }

    // 21. Determinar si una letra es mayúscula
    public static void ejercicio21() {
        char letra = 'C'; // Cambia este valor para probar

        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("La letra es mayúscula.");
        } else {
            System.out.println("La letra no es mayúscula.");
        }

    }

    // 22. Verificar si una letra es minúscula
    public static void ejercicio22() {
        char letra = 'a'; // Cambia este valor para probar

        if (letra >= 'a' && letra <= 'z') {
            System.out.println("La letra es minuscula.");
        } else {
            System.out.println("La letra no es minuscula.");
        }

    }

    // 23. Validar si dos contraseñas son iguales
    public static void ejercicio23() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las contraseñas
        System.out.print("Ingresa la primera contraseña: ");
        String password1 = scanner.nextLine();

        System.out.print("Ingresa la segunda contraseña: ");
        String password2 = scanner.nextLine();

        // Usar compareTo para validar si las contraseñas son iguales
        if (password1.compareTo(password2) == 0) {
            System.out.println("Las contraseñas coinciden.");
        } else {
            System.out.println("Las contraseñas no coinciden.");
        }

        scanner.close();

    }

    // 24. Verificar si un número está dentro de varios rangos posibles
    public static void ejercicio24() {
        int numero = 35;  // Cambia este valor para probar

        // Verificar si el número está dentro de varios rangos posibles
        if (numero >= 0 && numero <= 10) {
            System.out.println("El número está en el rango de 0 a 10.");
        } else if (numero > 10 && numero <= 20) {
            System.out.println("El número está en el rango de 11 a 20.");
        } else if (numero > 20 && numero <= 30) {
            System.out.println("El número está en el rango de 21 a 30.");
        } else if (numero > 30 && numero <= 40) {
            System.out.println("El número está en el rango de 31 a 40.");
        } else {
            System.out.println("El número no está en ninguno de los rangos especificados.");
        }

    }

    // 25. Llamar todos los ejercicios desde el main
    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();


        


    


        

    }

    
}  