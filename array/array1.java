// package array;

public class array1 {
    public static void main(String[] args) {
         int A[]=new int[10];
         int B[]={1,2,3,4,5};
         int C[];
         C=new int[10];
         B[2]=15; //we modify the b is 3 to 15
       //  for(int i=0;i<B.length;i++)
       //  {
       //     System.out.println(B[i]);
       //  }
        // for(int i=0;i<A.length;i++){
        // System.out.println(A[i]);
        // }
       //by changing the x we can not change the value of B array
       for(int i=0;i<B.length;i++)
       {
        System.out.println(B[i]++);
       }
       for(int x:B){//for each loop
        System.out.println(x);

       }
       



    }
}
