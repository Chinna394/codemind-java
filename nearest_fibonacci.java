import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            a=b;
            b=c;
            c=a+b;
        }
        if((n-b)<(c-n))
        {
            System.out.println(b);
        }
        else if((n-b)>(c-n))
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(b+" "+c);
        }
    }
}