package tugas_7;

class Civitas {
    String nama;
    String status;
    String fakultas = "Fakultas Teknik";

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Status   : " + status);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("\n");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Civitas d = new Dosen("Fadly, ST., M.Kom.");
        Civitas m = new Mahasiswa("Ricahman");
        Civitas s = new Staff("Aminah");

        d.tampilkanData();
        m.tampilkanData();
        s.tampilkanData();
    }
}
