package templars.abstergo.helix;

class p {

    private final int st[];
    private int i = 0;

    p(int y) {
        st = new int[y];
    }

    void push(int d) {
        if (i == 11) {
            System.out.println("Overflow");
            return;
        } else {
            st[i] = d;

        }
        i++;
    }

    void dp1() {
        System.out.println(st[i - 1]);
    }

    void dp2() {
        System.out.println(st[i + 1]);
    }

    void pop() {
        if (i == 0) {
            System.out.println("underflow");
        } else {
            st[--i] = 0;
        }
    }
}

public class overflow {

    public static void main(String[] args) {
        p ff = new p(20);
        System.out.println("java says :-\ni have in my stack :- ");
        for (int i = 0; i < 11; i++) {
            ff.push(i);
            ff.dp1();
        }
        for (int i = 11; i > 0; i--) {
            ff.pop();
        }
        for (int i = 11; i > 0; i--) {
            ff.dp2();
        }

    }
}
