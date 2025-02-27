package templars.abstergo.helix;

class BOXES {

    private final int width;
    private final int depth;
    private final int height;

    BOXES(int w, int d, int h) {
        width = w;
        depth = d;
        height = h;
    }

    void send() {
        System.out.println("The vol of box is :- " + width * depth * height);
    }
}

class BOXWEIGHT extends BOXES {

    private final int weight;

    BOXWEIGHT(int a, int b, int c, int d) {
        super(a, b, c);
        weight = d;
    }

    @Override
    void send() {
        System.out.println("The weight is :- " + weight);
    }

}

class SHIPMENT extends BOXWEIGHT {

    int cost;

    SHIPMENT(int a, int b, int c, int d, int g) {
        super(a, b, c, d);
        cost = g;
    }
}

public class barto {

    public static void main(String[] args) {

        BOXES bb = new BOXES(4, 4, 4);
        BOXWEIGHT BB = new BOXWEIGHT(4, 4, 4, 2);
        SHIPMENT SS = new SHIPMENT(2, 2, 2, 2, 2);
        bb.send();
        BB.send();
        System.out.println("The cost of shipping is :- " + SS.cost);
    }

}
