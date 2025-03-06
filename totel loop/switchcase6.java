//display type of website
import java.util.*;
public class switchcase6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter domain name");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
      //
       // String dom="google.com";
       // String ext="com";


        switch(ext){
            case "com":System.out.println("commercial");
            break;
            case"org":System.out.println("organisation");
            break;
            case"gov":System.out.println("government");
            break;
            case"net":System.out.println("network");
            break;
            
        }
        

        
    }
    
}
