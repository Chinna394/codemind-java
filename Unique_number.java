import java.util.Scanner;
class Uni
{
    public static boolean uninum(int x)
    {
        int r;
        while(x>0)
        {
            r=x%10;
            x=x/10;
            int x1,r1;
            x1=x;
            while(x1>0)
            {
                r1=x1%10;
                x1=x1/10;
                if(r==r1)
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
        d=uninum(n);
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