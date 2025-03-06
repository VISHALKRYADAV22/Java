package method;

public class callbyvalue {
    public static void changeA(int a) {
         a=10;
     }
    public static void main(String[] args) {
        int a=4;
        changeA(a);
        System.out.println(a);
    }
    
    }




