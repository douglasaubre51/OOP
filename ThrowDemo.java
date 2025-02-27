public class ThrowDemo {
    static void ddd() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught in ddd " + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            ddd();
        } catch (NullPointerException e) {
            System.out.println("caught error from catch in ddd " + e);
        }

    }
}
