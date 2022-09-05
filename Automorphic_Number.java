import java.util.Scanner;
class Auto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,r;
        n=sc.nextInt();
        double d;
        d=(int)Math.log10(n)+1;
        sq=n*n;
        r=sq%((int)Math.pow(10,d));
        if(n==r)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}