package method;

public class prim {
    public static boolean prime( int n) {
        boolean prime=true;
        for(int i=2;i<=n-1;i++){
            if (n%2==0){
                prime=false;
               break;       
    
            }
        }
    return prime;
    }
    public static void main(String[] args) {
    
        System.out.println(prime(4));
    }
}
