import java.util.Scanner;
class Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,p=1,r;
        n=sc.nextInt();
        while(n>0)
        {
          r=n%10;
          s=s+r;
          p=p*r;
          n=n/10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
           System.out.println("Not Spy Number"); 
        }
    }
}