package method;

public class overloading {
    public static int sum(int a,int b) {
        int sum=a+b;
        return sum;
    }
    public static int sum(int a,int b,int c) {
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.err.println(sum(2,3,4));
    }
}
