package templars.abstergo.helix;
class boxes
{
    int w;
    int h;
    int d;
    int vol()
    {
        return w*d*h;
    }
}
public class boxe 
{
    public static void main(String[] args) 
    {
        
        boxes f;
        f= new boxes();
        f.w=1;
        f.d=2;
        f.h=3;
        System.out.print("java says:-\nvol is = "+f.vol());
    }
}
