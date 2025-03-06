//display ap series = airthmetic progression
import java.util.*;
public class ap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int d= sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        System.out.println("program to print ap series");
        System.out.println("enter  a, d,and n");
        for(int i=0; i<n; i++)
        {
            System.out.println(term+",");
            term=term+d;


        }
        

    }
}
