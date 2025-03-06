import java.util.*;
public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        System.out.println("program to print gp series");
        System.out.println("enter a and r");
        for(int i=0; i<n;i++)
        {
          //  term=term*r;
            System.out.println(term);
            
            term=term*r;


        }
        
    }
}
