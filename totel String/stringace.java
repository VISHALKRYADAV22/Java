public class string
 {
    public static void main(String[] args) {
        String str1="vishal";
        String str2="jay";
        String str3="Vidhal";
        String str4="vidhal";
        System.out.println(str1.compareTo(str2));
       // difference between asc code by alphabate rule
       System.out.println(str3.compareTo(str4));
       String str5="pyramid";
       String str6="chinaa wall";
       System.out.println(str5.compareTo(str6));
       String str7="chinaa wall";
      String str8="pyramid";
      System.out.println(str7.compareTo(str8));
      String str9="the grait wall of china";
      System.out.println(str9.contains("wall"));
      String str10="the grait wall ";
      String str11=" of china";
      System.out.println(str10.concat(str11));
      System.out.println(str10+str11);

}
}