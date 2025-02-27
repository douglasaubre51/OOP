package templars.abstergo.helix;

class fate implements Runnable {

    Thread t;

    fate() {
        t = new Thread(this, "thread of fate");
        System.out.println("child of fate: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("fate: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child of fate is interrupted!");
        } finally {
            System.out.println("killing fate");
        }
    }
}

public class sanji {

    public static void main(String[] args) {
        fate f = new fate();
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("main: " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("main thread is interrupted");
        } finally {
            System.out.println("Killing main");
        }
    }
}
