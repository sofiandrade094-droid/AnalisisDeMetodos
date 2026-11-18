import java.util.Scanner;

public class Tarea1_E8 {

    // Cuenta cuantos digitos tiene n (n >= 0).
    static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        }
        int cont = 0;
        while (n > 0) {
            cont++;
            n /= 10;
        }
        return cont;
    }

    // Calcula b elevado a e (e >= 0) sin Math.pow.
    static int potencia(int b, int e) {
        int res = 1;
        for (int i = 0; i < e; i++) {
            res *= b;
        }
        return res;
    }

    // Verdadero si la suma de cada digito elevado a la cantidad de digitos es n.
    static boolean esArmstrong(int n) {
        int k = contarDigitos(n);
        int suma = 0;
        int temp = n;
        while (temp > 0) {
            suma += potencia(temp % 10, k);
            temp /= 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero >= 0: ");
        int n = sc.nextInt();
        System.out.println(n + (esArmstrong(n) ? " es" : " no es") + " numero de Armstrong.");
    }
}