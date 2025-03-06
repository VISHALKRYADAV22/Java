package method;

public class sum {
    public static int sum (int a, int b) {
        int add=a+b;
        return add;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int add=a+b;
        System.out.println("a+b="+add);
        int ad=sum(5,8);               
        System.out.println("a+b="+ad);
    }
}
