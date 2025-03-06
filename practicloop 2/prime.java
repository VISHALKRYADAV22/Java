import java.util.*;
public class prime {
    public static void main(String[] args) {
        int n,count;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n; i<=n;i++){
            count=0;
            for(int j=2; j*j<=n; j++){
                if(n%j==0){
                    count++;
                    break;
            }
        }
        if(count==0){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

    }
}
}
