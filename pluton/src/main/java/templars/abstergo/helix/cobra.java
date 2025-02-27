package templars.abstergo.helix;

class figure {

    int dim1;
    int dim2;

    figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    void area() {
        System.out.println("no dimensions specified");
    }
}

class triangle extends figure {

    triangle(int a, int b) {
        super(a, b);
    }

    @Override
    void area() {
        System.out.println("area of triangle :- " + super.dim1 * super.dim2 / 2);
    }

}

class square extends figure {

    square(int a, int b) {
        super(a, b);
    }

    @Override
    void area() {
        System.out.println("area of square :- " + super.dim1 * super.dim2);
    }

}

public class cobra {

    public static void main(String[] args) {
        figure e = new figure(0, 0);
        triangle t = new triangle(2, 2);
        square s = new square(2, 2);
        figure f;
        f = t;
        f.area();
        f = s;
        f.area();
        f = e;
        f.area();
        System.out.println(f.dim1);

    }
}
