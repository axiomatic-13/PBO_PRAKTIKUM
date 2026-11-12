package p5tugas;

public class Foreachh {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        String[] bahasa = {"Java", "Python", "C++", "JavaScript"};

        System.out.println("Isi array angka:");
        for (int item : angka) {
            System.out.println("- " + item);
        }

        System.out.println(); 

        System.out.println("isi array bahasa pemrograman:");
        for (String teks : bahasa) {
            System.out.println("- " + teks);
        }
    }
}
