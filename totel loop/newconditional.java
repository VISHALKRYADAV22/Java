//Display name of a day based on number
import java.util.*;
public class newconditional {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day number");
        day=sc.nextInt();
        if(day==1)
        {
            System.out.println("monday");

        }
        else if (day==2)
            {
                System.out.println("tuesday");

            }
            else if (day==3)
            {
                System.out.println("wed");

        }
        else if (day==4)
            {
                System.out.println("thrus");


    }
    else if (day==5)
            {
                System.out.println("Friday");
            }

            else if (day==6)
            {
                System.out.println("daru party/saturday");
            }
            else if (day==7)
            {
                System.out.println("muthi day/sunday");
            }
            else{
                System.out.println("invalid day");
            }
        }}