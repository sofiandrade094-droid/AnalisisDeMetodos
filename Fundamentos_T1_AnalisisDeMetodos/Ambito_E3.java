public class Ambito_E3 {
    static int total = 0;


    static int sumar(int x) {
        int parcial = x * 2;
        total += parcial;
        return parcial;
    }

    public static void main(String[] args) {
        int i;
        int ultimoParcial = 0;

        for (i = 1; i <= 3; i++) {
            ultimoParcial = sumar(i);
        }

        System.out.println(i);            
        System.out.println(ultimoParcial); 
        System.out.println(total);         
    }
}