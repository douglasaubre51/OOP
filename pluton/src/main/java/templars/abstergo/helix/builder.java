package templars.abstergo.helix;
class box2
{
    box2(int w,int d,int h)
    {
        System.out.println("java is building a box");
        int s=w*d*h;
        System.out.println("the vol of a given is :- "+s);
    }
}
public class builder 
{
    public static void main(String[] args) 
    {
        box2 g = new box2(10,20,15);
        box2 f = new box2(3,6,9);
        System.out.println(g);
        System.out.println(f);
    }
}
