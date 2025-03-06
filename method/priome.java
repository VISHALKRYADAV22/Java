package method;
import java.util.*;
public class priome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean prime=true;
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
         prime =false;
            break;
         }
        }
        if(prime && n>1*){
            System.out.println( "prime");
        }
        else{
            System.out.println( "not prime");
        }
        
    }
}
