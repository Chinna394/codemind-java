import java.util.Scanner;
class Pri
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
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
        int n,f=0;
        n=sc.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if((n%i==0) && isprime(i) && isprime(n/i) && i!=n/i)
            {
                System.out.println(i+" "+(n/i));
                f=f+1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
    }
}