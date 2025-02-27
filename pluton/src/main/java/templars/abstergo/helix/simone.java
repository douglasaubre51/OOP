package templars.abstergo.helix;

class lev implements Runnable {

    String n;
    Thread t;

    lev(String name) {
        n = name;
        t = new Thread(this, n);
        System.out.println("new child");
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupt");
        } finally {
            System.out.println("nah i'll win");
        }
    }
}

public class simone {

    public static void main(String[] args) {
        lev d = new lev("d");
        lev r = new lev("r");
        lev g = new lev("g");
        System.out.println("thread d " + d.t.isAlive());
        System.out.println("thread r " + r.t.isAlive());
        System.out.println("thread g " + g.t.isAlive());

        try {
            System.out.println("Waiting");
            d.t.join();
            r.t.join();
            g.t.join();
        } catch (InterruptedException e) {
            System.out.println("error in main");
        }
        System.out.println("thread d " + d.t.isAlive());
        System.out.println("thread r " + r.t.isAlive());
        System.out.println("thread g " + g.t.isAlive());
        System.out.println("end main");

    }
}
