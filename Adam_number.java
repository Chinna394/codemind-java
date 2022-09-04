import java.util.Scanner;
class Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,ns;
        n=sc.nextInt();
        ns=n*n;
        int r1,rev1=0;
        while(n>0)
        {
            r1=n%10;
            rev1=rev1*10+r1;
            n=n/10;
        }
        int sq,r2,rev2=0;
        sq=rev1*rev1;
        while(sq>0)
        {
          r2=sq%10;
          rev2=rev2*10+r2;
          sq=sq/10;
          
        }
        if(ns==rev2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}