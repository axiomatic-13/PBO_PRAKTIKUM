package p5tugas;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi, angka = 1;
        
        System.out.print("Masukan banyak baris: ");
        tinggi = input.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
