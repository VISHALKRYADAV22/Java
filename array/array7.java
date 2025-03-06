//rotation of array and left rotation of array
public class array7 {
    public static void main(String[] args) {
        int A[]={2,6,87,23,4,65,9};
        for(int x:A)
        System.out.println(x+",");
     System.out.println("");
        int temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
       A[A.length-1]=temp;
       for(int x:A)
        System.out.println(x+",");
     System.out.println("");
    }

}