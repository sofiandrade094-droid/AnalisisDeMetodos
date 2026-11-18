public class AmbitoCorregido_E4 {
    static int total = 0;
    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
    }
    public static void main(String[] args) {
        int i;                       
        for (i = 1; i <= 3; i++) {
            sumar(i);
        }
        System.out.println(i);      
        System.out.println(total);   
        int total = 5;               
        System.out.println(total);  
    }
    
}