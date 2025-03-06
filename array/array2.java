//finding sum of all element
public class array2 {
public static void main(String[] args)
 {
    int A[]={3,9,7,8,12,6,15,5,4,10};
    int sum=0;
   // for(int i=0; i<A.length;i++)
   // {
   // sum=sum+A[i];
   //  }
  //   System.out.println("sum is"+sum);
     //using foreach loop
     for(int x:A)
     {
        sum=sum+x;
     }
     System.out.println("sum is"+sum);

    
}
}
