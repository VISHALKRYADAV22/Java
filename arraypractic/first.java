package arraypractic;

public class first {
    public static void main(String[] args) {
        float A[]= {13.3f,45.4f,5.6f,7.6f,4.6f};
        float sum=0;
        for(float x:A){
            sum=sum+x;
        }
            System.out.println("value of sum"+ sum);
    }
}
