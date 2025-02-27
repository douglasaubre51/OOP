package templars.abstergo.helix;

class john {

    int w;
    int d;
    int h;

    john(box45 s) {
        d = s.depth;
        w = s.width;
        h = s.height;
        s.depth++;
    }

}

class box45 {

    int width;
    int depth;
    int height;

    box45(int w, int d, int h) {
        this.width = w;
        this.depth = d;
        this.height = h;
    }

}

public class oj {

    public static void main(String[] args) {
        box45 q = new box45(2, 4, 5);
        john n = new john(q);
        System.out.println("java says :-");
        System.out.println("width = " + n.w + "\ndepth = " + n.d + "\nheight = " + n.h);
        System.out.println("new depth = " + q.depth);
    }
}
