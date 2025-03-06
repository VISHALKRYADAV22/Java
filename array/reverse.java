public class reverse {
    public static void main(String[] args) {
        int A[]  = {1, 2, 3, 4, 5, 6};
        int B[]=new int[6];
        for(int i=5 ;i>=0;i--){
            B[i]=A[i];
            System.out.println(B[i]);

        }
    }
    
}
