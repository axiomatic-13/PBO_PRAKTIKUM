package p5tugas;

import java.util.Scanner;

public class Ang_Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0, ganjil = 1;

        System.out.print("Masukkan banyak angka : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }

        System.out.println("Total penjumlahan : " + total);
    }
}
