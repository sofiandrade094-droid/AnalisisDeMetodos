import java.util.Scanner;

public class Tarea1_E7 {

    // Volumen de un cubo de arista "lado".
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    // Volumen de un cilindro de radio y altura dados.
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // Volumen de un prisma rectangular (largo, ancho, alto).
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    // Lee un valor positivo.
    static double leer(Scanner sc, String etiqueta) {
        double v;
        do {
            System.out.print(etiqueta + ": ");
            v = sc.nextDouble();
        } while (v <= 0);
        return v;
    }

    static void mostrarMenu() {
        System.out.println("\n--- MENU DE VOLUMENES ---");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            mostrarMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    double lado = leer(sc, "Lado");
                    System.out.printf("Volumen del cubo: %.2f%n", volumen(lado));
                    break;
                case 2:
                    double r = leer(sc, "Radio");
                    double h = leer(sc, "Altura");
                    System.out.printf("Volumen del cilindro: %.2f%n", volumen(r, h));
                    break;
                case 3:
                    double l = leer(sc, "Largo");
                    double a = leer(sc, "Ancho");
                    double al = leer(sc, "Alto");
                    System.out.printf("Volumen del prisma: %.2f%n", volumen(l, a, al));
                    break;
                case 4:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (op != 4);
    }
}