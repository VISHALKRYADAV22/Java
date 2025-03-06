//find radix of a number given in a string
import java.util.*;
public class radix {
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a number");
        str=sc.nextLine();
        if(str.matches("[01]+"))
        {
            System.out.println("Binary radix=2");//binary number 0and 1
        }
         else if(str.matches("[0-7]+")){
                System.err.println("Octal Radix=8");//octal number is 1 to 7
         }
         else if(str.matches("[0-9]+"))

         {
            System.out.println("Decimal radix=10");//decimal number is 0 to 9

         }
         else if(str.matches("[0-9 A-F]+"))
         {
            System.out.println("Hexa Radix=16");//hexa decimal is Ato F and 0 to 9

         }
         else{
            System.out.println("not a number");
         }
        }

    }

    