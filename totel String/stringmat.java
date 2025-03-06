public class stringmat {
    public static void main(String[] args) {
    String str1="abcde";
    String str2="abcbbccaabc";
    String str3="";
    String str4="acc";
    String str5="abdbdf";
    String str6="jay@gmail.com";
    // after@ we only use letter or number
    String str7="ja-y@gmail.com";
;

    System.out.println(str1.matches(".*"));
    System.out.println(str1.matches("[a-z]*"));
    System.out.println(str2.matches("[abc]*"));
    System.out.println(str2.matches("[abc]+"));
    System.out.println(str3.matches("[abc]*"));
    System.out.println(str4.matches("[abc]{3}"));
    System.out.println(str5.matches("[abdf]{3,7}"));
    System.out.println(str6.matches(".*gmail.*"));
    System.out.println(str6.matches("\\w*@gmail(.*)"));
    System.out.println(str7.matches("\\w*@gmail(.*)"));


    }
}
