package templars.abstergo.helix;

class mello11 {

    static int i = 5;
    static int j = 5;

    static void mel(int a) {
        System.out.println("java says ;- " + a);
        System.out.println("i is " + i);
        System.out.println("j is " + j);
    }

    static {
        j = 4;
    }
}

public class jam {

    public static void main(String[] args) {
        mello11.mel(11);
        System.out.println("java says :-");
    }
}
