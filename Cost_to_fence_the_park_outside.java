import java.util.Scanner;
class Cost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int L,B,W,C,A1,A2,s;
        L=sc.nextInt();
        B=sc.nextInt();
        W=sc.nextInt();
        C=sc.nextInt();
        A1=(L*B);
        A2=((2*W)+L)*((2*W)+B);
        s=(A2-A1)*C;
        System.out.println(s);
    }
}