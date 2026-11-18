import java.util.Scanner;
public class Tarea1_E5 {
 static final double CARGO_FIJO = 3.50;
 static final double TARIFA_BASE = 0.60; // hasta 20 m3
 static final double TARIFA_EXCESO = 1.20; // sobre 20 m3
 static final double LIMITE_BASE = 20;
 // Lee el consumo en m3 y repite hasta que sea >= 0.
 static double leerConsumo(Scanner sc) {
 double m3;
 do {
 System.out.print("Consumo (m3): ");
 m3 = sc.nextDouble();
 if (m3 < 0) {
 System.out.println("El consumo no puede ser negativo.");
 }
 } while (m3 < 0);
 return m3;
 }
 // Calcula el valor a pagar: cargo fijo + tramo base + tramo de exceso.
 static double calcularValor(double m3) {
 double base = Math.min(m3, LIMITE_BASE) * TARIFA_BASE;
 double exceso = Math.max(m3 - LIMITE_BASE, 0) * TARIFA_EXCESO;
 return CARGO_FIJO + base + exceso;
 }
 // Muestra la planilla en pantalla.
 static void mostrarPlanilla(double m3, double valor) {
 System.out.println("----- PLANILLA DE AGUA -----");
 System.out.printf("Consumo: %.2f m3%n", m3);
 System.out.printf("Cargo fijo: $%.2f%n", CARGO_FIJO);
 System.out.printf("Total a pagar: $%.2f%n", valor);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double m3 = leerConsumo(sc);
 double valor = calcularValor(m3);
 mostrarPlanilla(m3, valor);
 }
}