import java.util.Scanner;
class Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d1,d2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a%(int)Math.pow(10,b);
        d1=(int)Math.log10(a)+1;
        d2=a/(int)Math.pow(10,d1-b);
        System.out.println(Math.abs(c-d2));
    }
}