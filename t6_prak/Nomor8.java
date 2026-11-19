package t6_prak;

class ThreadAnak extends Thread {
    private int nomorThread;

    public ThreadAnak(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    @Override
    public void run() {
        System.out.println("Halo dari Thread Anak ke-" + nomorThread + " (" + Thread.currentThread().getName() + ")");
    }
}

public class Nomor8 {
    public static void main(String[] args) {
        int jumlahThread = 5;

        System.out.println("Thread Utama dimulai...");
        for (int i = 1; i <= jumlahThread; i++) {
            ThreadAnak thread = new ThreadAnak(i);
            thread.start();
        }
    }
}
