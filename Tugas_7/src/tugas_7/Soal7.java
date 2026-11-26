package tugas_7;

import java.util.Scanner;

class DataMahasiswa {
    private String nama;
    private String npm;
    private String kelas;

    public void setData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("\n");
        System.out.println("Data Mahasiswa: ");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();

        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();

        mhs.setData(nama, npm, kelas);
        mhs.tampilkanData();
        input.close();
    }
}
