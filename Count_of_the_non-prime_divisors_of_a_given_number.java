import java.util.Scanner;
class Cou
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int j=2;j<=(int)Math.sqrt(x);j++)
        {
            if(x%j==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,e=1;
        boolean d;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=i;
                d=isprime(c);
                if(d==false)
                {
                    e++;
                }
            }
        }
        System.out.println(e);
    }
}