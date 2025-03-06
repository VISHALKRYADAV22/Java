//sum of n number
import java.util.*;
public class forloop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++)
        {
            sum=sum+i;
            System.out.println("sum of"+n+"Number is"+sum);
        }
    }

}
