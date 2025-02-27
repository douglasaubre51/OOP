package templars.abstergo.helix;

class box8 {

    private final int width;

    box8(int q) {
        width = q;
    }

    void print() {
        System.out.println(width);
    }
}

class er extends box8 {

    int adr;

    er(int w, int p) {
        super(w);
        adr = p;
    }

}

public class kanjuro {

    public static void main(String[] args) {
        box8 u = new box8(10);
        er dd = new er(2, 5);
        System.out.println(dd.adr);
        u.print();
    }
}
