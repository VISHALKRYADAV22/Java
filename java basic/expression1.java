public class expression1 {

    public static void main(String[] args) {
        String str1="a";
        String str2="ab";
        String str3="%";       
        String str4="u";
        String str5="h";
        String str6="R";
        String str7="a";
        String str8="a5";
        String str9="k$";
        String str10="a";
        String str11="and";


        

        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
 System.out.println(str3.matches("."));
    System.out.println(str4.matches("[^abc]"));
    System.err.println(str5.matches("[a-z 0-9]"));
    System.err.println(str6.matches("[a-z 0-9]"));
    System.err.println(str7.matches("[a-z][0-9]"));
    System.err.println(str8.matches("[a-z][0-9]"));
    System.err.println(str9.matches("[a-z] [0-9]"));
    System.err.println(str10.matches("a|b"));
    System.err.println(str11.matches("and")); 
    }
}