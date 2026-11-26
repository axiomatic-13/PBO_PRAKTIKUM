package tugas_7;

public class Soal4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanIsiSumpah();
    }
}


class SumpahPemuda {
    SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    void tampilkanIsiSumpah() {
        System.out.println(" Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println(" Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println(" Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}