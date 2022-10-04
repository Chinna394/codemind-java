import java.util.Scanner;
class Generate
{
    public static boolean isprime(int x)
    {
        if(x<2)
        {
            return false;
        }
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
        int a,b,d;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
           if(isprime(i))
           {
               d=i;
               System.out.println(d);
           }
            
        }
        
    }
}