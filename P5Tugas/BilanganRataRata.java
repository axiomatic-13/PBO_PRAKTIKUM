package p5tugas;

import java.util.Scanner;

public class BilanganRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double jumlah = 0, bilangan;

        System.out.print("Masukkan jumlah yang ingin diinput: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan = input.nextDouble();
            jumlah += bilangan;
        }

        System.out.println("Total jumlah bilangan: " + jumlah);
        System.out.println("Rata-rata bilangan: " + (jumlah / n));
    }
}
