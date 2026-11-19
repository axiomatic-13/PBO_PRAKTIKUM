package t6_prak;

class ThreadBaru extends Thread {
    @Override
    public void run() {
        System.out.println("Thread baru sedang berjalan! Nama thread: " + Thread.currentThread().getName());
    }
}

public class TugasThread {
    public static void main(String[] args) {
        ThreadBaru t1 = new ThreadBaru();
        t1.start();
    }
}