package templars.abstergo.helix;

public class arar {

    public static void main(String[] args) {
        int f []= new int[10];
        f[0] = 9;
        for (int j=1;j<10;j++) f[j] = f[j] + f[0];
        int h[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            System.out.println(h[i]);
            System.out.println(f[i]);
        }
    }
}
