package tugas_7;

import java.util.Scanner;

class RekursiContoh {
    int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
}


public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RekursiContoh rk = new RekursiContoh();

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("Faktorial dari " + angka + " = " + rk.faktorial(angka));
        input.close();
    }
}
