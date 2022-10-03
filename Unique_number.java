import java.util.Scanner;
class Uni
{
    public static boolean isunique(int x)
    {
        int r;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            int x1,r2;
            x1=x;
            while(x1>0)
            {
                r2=x1%10;
                x1=x1/10;
                if(r==r2)
                {
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean d;
        n=sc.nextInt();
        d=isunique(n);
        if(d==true)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
        
    }
}