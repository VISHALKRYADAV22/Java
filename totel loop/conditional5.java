//find grades for given marks
import java.util.*;
public class conditional5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three subject" );
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float avg=(float)(a+b+c)/3;

               if(avg>=70 )
        {
            System.out.println("Grade A");

        }
         else if(avg>=60&&avg<70)
        {
            System.out.println("Grade B");

        }
        else if(avg>=50&&avg<60)
        {
            System.out.println("grade C");

        }
        else if(avg>=40&&avg<50)
        {
            System.out.println("Grade D");

        }
        else
        {
            System.out.println("grade F");

        }
    }
}
