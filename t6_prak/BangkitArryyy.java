package t6_prak;

import java.util.Scanner;
import java.util.Arrays;

public class BangkitArryyy{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("\nNilai terbesar: " + max + " (pada indeks ke-" + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (pada indeks ke-" + idxMin + ")");

        int totalSemua = 0;
        for (int num : arr) {
            totalSemua += num;
        }
        double rataRata = (double) totalSemua / n;
        System.out.println("Total semua elemen: " + totalSemua);
        System.out.println("Rata-rata: " + rataRata);

        int jumlahIndeksGanjil = 0;
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                jumlahIndeksGanjil += arr[i];
            } else {
                jumlahIndeksGenap += arr[i];
            }
        }
        System.out.println("Jumlah elemen indeks ganjil (NPM Genap): " + jumlahIndeksGanjil);
        System.out.println("Jumlah elemen indeks genap (NPM Ganjil): " + jumlahIndeksGenap);

        int hasilCek = jumlahIndeksGanjil;
        String statusBilangan = (hasilCek % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Status hasil penjumlahan (" + hasilCek + ") adalah bilangan: " + statusBilangan);

        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}