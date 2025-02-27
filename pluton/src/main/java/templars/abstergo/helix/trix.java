package templars.abstergo.helix;
class cubes 
{
    int depth;
    int height;
    int width;
    cubes(int a,int b,int c)
    {
        depth=a;
        height=b;
        width=c;
    }
    void display()
    {
        System.out.println(depth+""+height+""+width);
    }
} 
public class trix
{
    public static void main(String[] args) 
    {
        cubes m,n;
        m=new cubes(2,3,5);
        n=m;
        n.display();
        System.out.println("java says :-\n"+n);
    }
}
