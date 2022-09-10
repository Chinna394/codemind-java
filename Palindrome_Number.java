import java.util.Scanner;
class Num
{   public static boolean ispall(int p)
    {
        int r,rev=0,t=p;
        while(p>0)
        {
            r=p%10;
            rev=rev*10+r;
            p=p/10;
        }
        if(t==rev)
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
        int n,a,b;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          a=sc.nextInt();
          if(ispall(a))
          {
              System.out.println("True");
          }
          else
          {
              System.out.println("False");
          }
          
          
        }
    }
}