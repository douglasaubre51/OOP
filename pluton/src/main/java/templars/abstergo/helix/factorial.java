package templars.abstergo.helix;
class rec
{
    int fg,i=1;
    rec(int a)
    {
        fg=a;
    }
    int recs()
    {
        do
        {
            if(fg==1)
            {
              return 1;
            }
            else
            {
                i=fg*i; 
                fg--;
            }
        }while(fg>1);    
        return i;
    }
}
public class factorial 
{
    public static void main(String[] args)
    {
        rec d = new rec(1);
        rec e = new rec(4);
        rec s = new rec(5);
        int ff=d.recs();
        int gg=e.recs();
        int zz=s.recs();
        System.out.println("java says :-");
        System.out.println("1 fac = "+ff);
        System.out.println("4 fac = "+gg);
        System.out.println("5 fac = "+zz);
    }
}
