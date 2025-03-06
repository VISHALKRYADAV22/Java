package method;
public class product {
    public static int multiply( int a, int b) {
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
       int product= multiply(a,b);
        System.out.println("a*b="+ product);
        int prod=multiply(8,9);
        System.out.println("a*b="+prod);
    }
}
