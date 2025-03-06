package method;
import java.util.*;
public class method3 {

    public static void calculatesum(  int num1,  int num2)//parameter or formal parameter
    {
        int sum=num1+num2;
        System.out.println("sum of two number is;"+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;
        calculatesum(a,b);//argument or actual parameter
        System.out.println("sum of two number is;"+sum);
    }
}


