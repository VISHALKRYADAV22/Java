import java.util.*;
public class forloop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");// if a sum of  cube a digit of anumber is equal to a number=aramstrong number
        int n=sc.nextInt();
        int r;
        int m=n;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }

            if(m==sum)
            System.out.println("it is aramstrong number");
            else
            System.out.println(" it is not a aramstrong number");
        
    }
}
