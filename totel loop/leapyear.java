import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println("enter a leap year");
        if(year%4==0&&year%100!=0||year%400==0)
        {
            System.out.println("it is a leap year");

        }
        else{
            System.out.println("not aleap year");
        }
        
    }
}
