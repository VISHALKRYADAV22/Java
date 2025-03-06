//cheak a number is palindrome or not 
//PALINDROME==reverse a number is equal to a number
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r;
        int rev=0;
        int m=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
        System.out.println("it is palindrome number");
        else
        System.out.println("it is not palindrome number");
        
    }
}
