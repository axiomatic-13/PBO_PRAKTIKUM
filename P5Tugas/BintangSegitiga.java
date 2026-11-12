package p5tugas;

public class BintangSegitiga {
    public static void main(String[] args) {
        //Setengah Triangle
        System.out.println("Half Triangle");
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }                
        
        System.out.println();             
        System.out.println("Full Triangle");
        //FullTriangle
        int n = 3;
        // Bagian Atas
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        // Bagian Bawah
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
