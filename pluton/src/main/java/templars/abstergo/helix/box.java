package templars.abstergo.helix;
class box3
{
    int width;
    int depth;
    int height;
    box3()
    {
        width=height=depth=-1;
    }
    box3(int a)
    {
        width=a;
        depth=a;
        height=a;
    }
    box3(int w,int d,int h)
    {
        width=w;
        depth=d;
        height=h;
    }
    void sys()
    {
        System.out.println(width*depth*height);
    }
}
public class box 
{
    int a,b,c;
    public static void main(String[] args) 
    {
        box3 e = new box3(3);
        box z = new box();
        z.a=1;
        z.b=2;
        z.c=3;
        box3 q = new box3();
        box3 ds = new box3(z.a,z.b,z.c);
        z.a=5;
        z.b=2;
        z.c=2;
        box3 d = new box3(z.a,z.b,z.c);
        ds.sys();
        d.sys();
        e.sys();
        q.sys();
    }
}
