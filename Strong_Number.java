import java.util.Scanner;
class Num
{   public static int strongnum(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t,r,sum=0;
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
           r=n%10;
           sum=sum+strongnum(r);
           n=n/10;
           
        }
        if(t==sum)
        {
            System.out.println("The number "+t+" is a strong number");
        }
        else
        {
            System.out.println("The number "+t+" is not a strong number");
        }
    }
}