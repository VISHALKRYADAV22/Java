
import java.util.*;
public class average {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number a,b,c");
         a= sc.nextInt();
         b=sc.nextInt();
        c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println(average);
    }
}
