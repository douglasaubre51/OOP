package templars.abstergo.helix;

class outer {

    int garp;

    outer(int g) {
        garp = g;
    }

    void osmosis() {
        inner ff = new inner();
        ff.display();
    }

    class inner {

        void display() {
            System.out.println("hello from inner " + garp);
        }
    }
}

public class leaf {

    public static void main(String[] args) {
        outer gg = new outer(10);
        gg.osmosis();
    }

}
