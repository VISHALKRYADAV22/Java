//finding maximum element S
import java.util.*;
public class array5 {
    public static void main(String[] args)
     {
        int A[]={23,2,3,7,8,87};
        int max=0;
        
        for(int i=0;i<A.length;i++)
        {
            if (A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println(max);
        
        
        
    }
    
}
