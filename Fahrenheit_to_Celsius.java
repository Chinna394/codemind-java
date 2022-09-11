import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        float F,C;
        F=sc.nextFloat();
        
        C=(float)((F-32)*5)/9;
        System.out.printf("%.2f",C);
    }
}