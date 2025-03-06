public class insert {
    public static void main(String[] args)
     {
         int A[]=new int[10];
         A[0]=1;
         A[1]=8;
         A[2]=7;
         A[3]=34;
         A[4]=12;
         A[5]=23;
         int n=6;
        for(int i=0; i<n; i++){
         System.out.println(A[i]+",");
        }
         System.out.println("");

         int x=33;
         int index=2;
         for (int i=n;i>index;i--){
         A[i]=A[i-1];
         A[index]=x;
         }
         for(int i=0; i<n; i++){
         System.out.println(A[i]+",");
        }
         System.out.println("");
         }
    }

