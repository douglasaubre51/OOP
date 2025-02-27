package templars.abstergo.helix;

public class CurrentThreadDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Thread tt = Thread.currentThread();
        System.out.println("current Thread :-\n" + tt);
        tt.setName("Monkey D Luffy");
        System.out.println("new name for Thread :-\n" + tt);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
                if (i == 1)
                    throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            System.out.println("Bang Bang");
        } finally {
            System.out.println(tt.getName());
        }
    }
}
