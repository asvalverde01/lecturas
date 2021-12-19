import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectura {

    public static int numeroReal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0;
        if (input.matches("\\d+")) { // it checks if the input line contains only digits
            number = Integer.parseInt(input);
            System.out.println(number + 1);
        } else {
            System.out.println("Incorrect number: " + input);
        }
        return number;
    }

    public static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean repeat = true;

        while (repeat) {
            try
            {
                System.out.println(mensaje);
                numero = scanner.nextInt();
                repeat = false;
            }
            catch(InputMismatchException exception)
            {
                System.out.println("ERROR: Se esperaba un valor numérico");
                scanner.next();   // or scanner.nextLine()
                repeat = true;
            }
        }
        return numero;
    }

    public static double leerDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);

        return scanner.nextDouble();
    }

    public static float leerFloat(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextFloat();
    }

    public static int leerEnteroMayorQue(String mensaje, int min) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero;
        System.out.println(mensaje);
        do {
            numeroEntero = scanner.nextInt();
        } while (numeroEntero < min);
        return numeroEntero;
    }

    public static int leerEnteroMenorQue(String mensaje, int max) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero;
        System.out.println(mensaje);
        do {
            numeroEntero = scanner.nextInt();
        } while (numeroEntero > max);
        return numeroEntero;
    }

    public static double leerDoubleMayorQue(String mensaje, int min) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println(mensaje);
        do {
            numero = scanner.nextDouble();
        } while (numero < min);
        return numero;
    }

    public static double leerDoubleMenorQue(String mensaje, int max) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println(mensaje);
        do {
            numero = scanner.nextDouble();
        } while (numero > max);
        return numero;
    }

    public static float leerFloatMayorQue(String mensaje, int min) {
        Scanner scanner = new Scanner(System.in);
        float numero;
        System.out.println(mensaje);
        do {
            numero = scanner.nextFloat();
        } while (numero < min);
        return numero;
    }

    public static float leerFloatMenorQue(String mensaje, int max) {
        Scanner scanner = new Scanner(System.in);
        float numero;
        System.out.println(mensaje);
        do {
            numero = scanner.nextFloat();
        } while (numero > max);
        return numero;
    }

    public static int leerEnteroEntre(String mensaje, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntero;
        System.out.println(mensaje);

        do {
            numeroEntero = scanner.nextInt();
        } while (numeroEntero < min || numeroEntero > max);
        return numeroEntero;
    }

    public static double leerDoubleEntre(String mensaje, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double numeroDouble;
        System.out.println(mensaje);
        do {
            numeroDouble = scanner.nextDouble();
        } while (numeroDouble < min || numeroDouble > max);
        return numeroDouble;
    }

    public static String leerString(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println(mensaje);
        string = scanner.next();
        return string;
    }

    public static String leerLinea(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println(mensaje);
        string = scanner.nextLine();
        return string;
    }

}

