
public class array6 {
public static void main(String[] args) {
        int A[]={45,6,78,7,23,98};
        int max1,max2;
         max1=max2=A[0];
         for(int i=1;i<A.length;i++)
         {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if (A[1]>max2){
                max2=A[1];
            } 
         }System.out.println("second largest number"+ max2);
    }  

} 



