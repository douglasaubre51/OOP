package templars.abstergo.helix;
class zoan
{
    int height;
    int width;
    int depth;
    int vol()
    {
        return height*width*depth;
    }
    void set(int w,int d,int h)
    {
        height=h;
        width=w;
        depth=d;
    }
}
public class bush 
{
    public static void main(String[] args)
    {
        zoan h = new zoan();
        zoan n = new zoan();
        h.set(1,2,3);
        n.set(2,3,4);
        int v1=h.vol();
        int v2=n.vol();
        System.out.println("java says vol of box1 is :- "+v1);
        System.out.println("java says vol of box2 is :- "+v2);
    }
}
