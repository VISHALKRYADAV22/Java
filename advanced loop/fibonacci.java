//display fibbonacci series
//  0,1,1,2,3,5,8 we sum previous term to calculate 0and 0+1=1,1+1=2,2+1=3 and so on........
import java.util.*;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("program to fibonacci series");
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+","+b);

        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }
    }
}
