package templars.abstergo.helix;

class djem extends Thread {

    djem() {
        super("Form 5:djem so");
        System.out.println("Anakin " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Darth Vader: Luke i'm your father");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupt");
        } finally {
            System.out.println("exit anakin");
        }
    }
}

public class jackie {

    public static void main(String[] args) {
        djem d = new djem();

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("luke: nooooo");
                Thread.sleep(1000);
                djem e = new djem();
                djem f = new djem();
            }

        } catch (InterruptedException w) {
            System.out.println("main thread is interrupted");
        } finally {
            System.out.println("Killing main");
        }
    }
}
