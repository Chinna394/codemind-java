import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int C;
        float F;
        C=sc.nextInt();
        
        F=(float)(9*C)/5+32;
        System.out.printf("%.2f",F);
    }
}