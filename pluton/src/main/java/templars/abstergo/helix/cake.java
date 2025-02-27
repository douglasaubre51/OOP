package templars.abstergo.helix;

class flavour {

    int vanilla = 10;
    int strawberry = 19;
    int chocolate = 12;

    void display1() {
        System.out.println("vanilla : " + vanilla);
        System.out.println("strawberry : " + strawberry);
        System.out.println("chocolate : " + chocolate);
    }
}

class newcake extends flavour {

    int redvelvet = vanilla + strawberry + chocolate;

    void display2() {
        System.out.println("The amount of flavour is : " + redvelvet);
    }
}

public class cake {

    public static void main(String[] args) {
        flavour f = new flavour();
        f.display1();
        newcake d = new newcake();
        d.display2();
    }
}
