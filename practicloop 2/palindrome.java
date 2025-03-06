import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n,rev,r;
        n=sc.nextInt();
        rev=sc.nextInt();
        n=rev;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n%10;
        }
        if (n==rev){
            System.out.println("number is palindrome");

        }
        else{
            System.out.println("not");
        }
    }
}
