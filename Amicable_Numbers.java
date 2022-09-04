import java.util.Scanner;
class Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        
        int c=0;
        for(int i=1;i<sum;i++)
        {
            if(sum%i==0)
            {
               c=c+i; 
            }
        }
        if(n==c && sum==sum)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}