package t6_prak;
public class Nomor9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for loop standar:");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        System.out.println("\n\nMenggunakan for-each loop:");
        for (int nilai : age) {
            System.out.print(nilai + " ");
        }
    }
}
