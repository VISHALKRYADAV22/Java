public class Stringliterals {
    public static void main(String[] args) {
        String str1="vishal";
        String str2=new String("vishal");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
    }
}
