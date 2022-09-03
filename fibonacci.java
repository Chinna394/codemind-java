import java.util.Scanner;
class Code
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        n=n-2;
        c=a+b;
        while(n>0)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            n--;
        }
        
    }
}