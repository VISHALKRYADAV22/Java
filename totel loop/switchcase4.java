//display name of the day based on the number
import java.util.*;
public class switchcase4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day number");

        int day=sc.nextInt();
        switch(day)
        {
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("tue");
            break;
            case 3: System.out.println("wed");
            break;
            case 4: System.out.println("thrus");
            break;
            case 5: System.out.println("fri");
            break;
            case 6: System.out.println("sat");
            break;
            case 7: System.out.println("sun");
            break;
            default: System.out.println("invalid");

        }
    }
}
