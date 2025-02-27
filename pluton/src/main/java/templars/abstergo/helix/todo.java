package templars.abstergo.helix;

class box5 {

    int width;
    int height;
    int depth;

    box5(box5 i) {
        width = i.width;
        height = i.height;
        depth = i.depth;
    }

    box5(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    box5() {
        width = -1;
        height = -1;
        depth = -1;
    }

    int compute() {
        return width * height * depth;
    }
}

class box6 extends box5 {

    int weight;

    box6(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class todo {

    public static void main(String[] args) {
        box6 kk = new box6(2, 3, 4, 5);
        box6 ll = new box6(1, 3, 4, 3);
        box5 qq = new box5(4, 1, 3);
        System.out.println(qq.compute());
        qq = kk;
        System.out.println(qq.compute());
        box5 dd = new box5(3, 3, 3);
        box5 ss = new box5();
        box5 oo = new box5(dd);
        int d = dd.compute();
        int s = ss.compute();
        int o = oo.compute();
        System.out.println("Java Says :-");
        System.out.println("pass reference: " + d);
        System.out.println("empty call: " + s);
        System.out.println("pass object: " + o);
        System.out.println("box5,1: " + kk.compute());
        System.out.println("box5,2: " + ll.compute());
        System.out.println("weight1: " + kk.weight);
        System.out.println("weight2: " + ll.weight);

    }
}
