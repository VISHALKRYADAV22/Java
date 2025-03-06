public class addition {
    public static void main(String[] args) {
        int A[][]={{2,5,4},{4,6,7},{7,8,9,}};
       int B[][]={{2,3,4},{4,5,6,},{1,3,4}};
        int  C[][]=new int[3][3];
        int j;
    
        for(int i=0;i<A.length;i++)
        {
            for(j=0;j<A.length;j++) 
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
