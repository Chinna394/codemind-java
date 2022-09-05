import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
        }
        
    }
}