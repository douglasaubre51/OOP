package templars.abstergo.helix;

class NewThread implements Runnable {

    Thread t;

    NewThread() {
        t = new Thread(this, "Dorry");
        System.out.println("new thread :-" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i < 0; i++) {
                System.out.println("new thread says :-\n" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupt" + e);
        }
        System.out.println("byebye");
    }
}

public class Kaz {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        NewThread nn = new NewThread();

        try {

            for (int i = 0; i < 10; i++) {
                System.out.println("main :- " + i);
                Thread.sleep(1000);
                if (i == 9) {
                    System.out.println("Bang Bang Bang ");

                }
            }
        } catch (InterruptedException e) {
            System.out.println("interrupt main");
        }
    }
}
