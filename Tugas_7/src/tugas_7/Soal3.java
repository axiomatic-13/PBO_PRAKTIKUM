package tugas_7;

import java.util.Scanner;

class TebakTanggalLahir {
    int hitungKodeLahir(int bulan, int tanggal) {
        int proses = ((bulan * 2) + 5) * 50 + tanggal;
        return proses - 250;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TebakTanggalLahir tebak = new TebakTanggalLahir();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();

        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();

        int hasil = tebak.hitungKodeLahir(bulan, tanggal);
        System.out.println("Hasil akhir = " + hasil);
        input.close();
    }
}
