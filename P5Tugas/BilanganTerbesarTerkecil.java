package p5tugas;

import java.util.Scanner;

public class BilanganTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, terbesar, terkecil;
        
        System.out.print("Masukan Bilangan ke 1: ");
        bilangan  = input.nextInt();
        terbesar = bilangan;
        terkecil = bilangan;
        
        for(int i = 2; i <= 10; i++){
            System.out.print("Masukkan bilangan ke-" + i + ": ");
           bilangan = input.nextInt();
            
            if (bilangan > terbesar){
                terbesar = bilangan;
            }
            if(bilangan < terkecil){
                terkecil = bilangan;
            }
        }
        System.out.println("Bilangan terbesar nya: " + terbesar);
        System.out.println("Bilangan terkecil nya: " + terkecil);
        
    }
    
}
