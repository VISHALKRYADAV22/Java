//searchimg an element
import java.util.*;

public class array4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int A[]={3,4,6,13,45,7,90};
        int key;
        System.out.println("enter the key");
        key=sc.nextInt();
        for(int i=0;i<A.length;i++)
        {
            if (A[i]==key)
            {
                System.out.println("element found at :"+i);
                return;            }
            
            }
                System.out.println("not found");
        }

    
}


    

        