package templars.abstergo.helix;
// @author MAC
class cube  // new data type called testing
{
    int depth;  //class objects or instances (class variables)
    int height;
    int width;
}
public class Pluton 
{
    public static void main(String[] args) 
    {
        System.out.println("java says :-");
        cube j = new cube();
        cube e;
        e = new cube();
        j.depth = 10;
        j.height = 15;
        j.width = 20;
        e.depth = 1;
        e.height = 2;
        e.width = 3;
        double vol;
        vol = j.depth*j.height*j.width;
        System.out.println("volume of cube is:"+vol);
        vol = e.depth*e.height*e.width;
        System.out.print("volume of cube is:"+vol);
    }
}


