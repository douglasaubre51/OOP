public class FinallyDemo {
    static void aa() {
        try {
            System.out.println("in aa");
            throw new RuntimeException("demo");

        } finally {
            System.out.println("aa finally");
        }
    }

    static void bb() {
        try {
            System.out.println("in bb");
            return;
        } finally {
            System.out.println("bb finally");
        }
    }

    static void cc() {
        try {
            System.out.println("in cc");
        } finally {
            System.out.println("cc finally");
        }
    }

    public static void main(String[] args) {
        try {
            aa();

        } catch (Exception e) {
            System.out.println("caught exception");
        }
        bb();
        cc();
    }
}
