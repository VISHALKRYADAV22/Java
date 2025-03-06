 //find a given year is leap year
 import java.util.*;
public class radix2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
       int year=sc.nextInt();
       if (year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    
                    System.out.println("it is a leap year");
                }
                else{
                System.out.println("not a leap year");

            }
        }
            else{
                        System.out.println("it is aleap year");
       }
    }
    
       else
       {
        System.out.println("not a leap year");
       }
    }}

    

    

