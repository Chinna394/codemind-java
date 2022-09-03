import java.util.Scanner;
class Prime
{   
    public static boolean isprime(int a)
    {
    int count=0;
    for(int i=2;i<=(int)Math.sqrt(a);i++ )
      {
          if(a%i==0)
           count++;
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
    public static boolean ispalindrome(int a)
     {
         int sum=0,r;
          int temp=a;
         while(a>0)
         {
             r=a%10;
             sum=sum*10+r;
             a=a/10;
         }
         if(temp==sum)
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
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isprime(i) && ispalindrome(i))
              {
                  System.out.println(i);
                   break;
              }
        }
        
        
    }
}