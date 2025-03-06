public class increasing {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int B[]= new int[2*A.length];
        for(int i=0;i<2*A.length;i++){
            B[i]=A[i];
            A=B;
            B=null;
            System.out.println(A.length);
        }
}
}