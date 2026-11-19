package t6_prak;

import java.util.Scanner;

public class Rata_rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan yang akan dihitung: ");
            int n = input.nextInt();
            double[] angka = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
                total += angka[i];
            }

            double rataRata = total / n;
            System.out.println("Nilai rata-rata adalah: " + rataRata);

        } catch (Exception e) {
            System.out.println("Error: Input tidak valid! Pastikan Anda hanya memasukkan bilangan.");
        }
    }
}
