//find a person is young or not
import java.util.*;
public class condition4 {
    public static void main(String[] args) {
       int age;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your age");
       age=sc.nextInt();
       if(age>=14&&age<=55) 
     // if(age<14||age>55)
       {
        System.out.println("you are young");
       }
       else
       {
        System.out.println("you are not young");
       }
    }
}
