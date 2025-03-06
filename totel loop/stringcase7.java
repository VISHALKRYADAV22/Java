//make a menu driven for airthmetic operations
import java.util.*;
public class stringcase7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("enter 2 number");
        int x=sc.nextInt();
        int y =sc.nextInt();
        sc.nextLine();
        System.out.println("enter option in words");

        String option=sc.nextLine();
        option=option.toUpperCase();
        switch(option)
        {
      case "ADD":  System.out.println("Sum is"+(x+y));
            break;
     case"SUB" :  System.out.println("difference is"+(x-y));
            break;
      case "MUL": System.out.println("product is"+(x*y));
            break;
     case "DIV":   System.out.println("ratio is"+(x/y));
            break;
     default:   System.out.println("invalid option");
        break;

        }
    }
}
