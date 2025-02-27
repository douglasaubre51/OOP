class ext extends Exception {
    int details;

    ext(int a) {
        details = a;
    }

    public String toString() {
        return "ext[" + details + "]";
    }
}

public class ExceptionDemo {
    static void calc(int a) throws ext {
        System.out.println("calls calc (a)");
        if (a > 10)
            throw new ext(a);
        System.out.println("normal exit");
    }

    public static void main(String[] args) {
        try {
            calc(1);
            calc(20);
        } catch (ext e) {
            System.out.printf("caught "+e);
        }
    }
}
