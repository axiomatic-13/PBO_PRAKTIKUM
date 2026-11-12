package p5tugas;
public class Perbedaan {
    public static void main(String[] args) {        
       System.out.println(" i++ ");
        int i = 0;
        while (i < 5) {
            System.out.print(i++ + " "); 
        }
        
        System.out.println("\n"); 

        System.out.println(" ++i ");
        int j = 0;
        while (j < 5) {
            System.out.print(++j + " "); 
        }
        System.out.println();
    }
}
