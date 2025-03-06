package method;
import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number");
       // int binNum;
       int binNum=sc.nextInt();
        int pow= 0;
        int deciNum= 0;
        while(binNum>0){
            int lastDigit=binNum%10;
            deciNum=deciNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        
        }
        System.out.println("decimal value:"+deciNum);
    }

}
