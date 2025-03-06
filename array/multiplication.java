class multiplication {
    public static void main(String[] args) {
        int A[][]={{2,5,4},{4,6,7},{7,8,9,}};
       int B[][]={{2,3,4},{4,5,6,},{1,3,4}};
        int  C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
            {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+" ");

            }
            System.err.println("");
        }
    
        
    }
}
