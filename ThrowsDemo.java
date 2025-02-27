public class ThrowsDemo {
    static void ttt() throws IllegalAccessException {
        System.out.println("in ttt...");
        throw new IllegalAccessException("death");
    }

    public static void main(String[] args) {
        try {
            ttt();
        } catch (IllegalAccessException e) {
            System.out.println("main ... " + e);
        }
    }
}
