package tugas_7;


public class Soal1 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Lamborgini", 2021);
        mobil1.info();
    }
    
}


class Mobil {
    String merk;
    int tahun;

    Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    void info() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}