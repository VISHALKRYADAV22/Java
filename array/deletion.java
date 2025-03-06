
public class deletion {
    public static void main(String[] args) {
        int A[]=new int[8];
        A[0]=2;
        A[1]=3;
        A[2]=24;
        A[3]=14;
        A[4]=15;
        int n=5;
        for(int i=0;i<n;i++){
          System.out.println(A[i]+",");
        }
        System.out.println("");
      int  index=3;
      for(int i=index;i<n-1;i++){
        A[i]=A[i+1];
      }  
      for(int i=0;i<n-1;i++){
        System.out.println(A[i]+",");
      }
      
      System.out.println("");
        
    }
}
