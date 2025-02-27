package templars.abstergo.helix;
//outdated code i think just like nami
/*Exception in thread "main" java.lang.NoSuchMethodError:
 'void templars.abstergo.helix.square.<init>(int)'
attemplars.abstergo.helix.tatsumaki.main(tatsumaki.java:42)*/
abstract class figure {

    int dim1;
    int dim2;

    figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();
}

class triangle extends figure {

    triangle(int a, int b) {
        super(a, b);
    }

    @Override
    void area() {
        System.out.println("The area of triangle :-\n" + super.dim1 * super.dim2 / 2);
    }
}

class square extends figure {

    square(int a) {
        super(a, a);
    }

    @Override
    void area() {
        System.out.println("The area of square :-\n" + super.dim1 * super.dim2);
    }
}

public class tatsumaki {

    public static void main(String[] args) {

        triangle t = new triangle(12, 4);
        square s = new square(5);
        figure f;
        f = t;
        f.area();
        f = s;
        f.area();

    }
}
