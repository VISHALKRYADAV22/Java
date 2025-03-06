import java.util.*;
public class lastlec {

    public static void main(String[] args) {
        //find a number binary or not
        int a =1010011;
        String str=String.valueOf(a);
       // find a number hexadecimal or not
        String str1="123AD";
        //find a dat ain date format(dd/mm/yyyy)
        String date="01/12/2004";
        //remove special character from string
        String str3="a@b#4D*";
        //remove extra spaces from String
        String str4="abc   b   dg";
        String str5="   ad   bvf   nbb   ";
        String str6="   nnjk kjdkj  hjh    ";
        //find a number of words in a swing
        String str7="  gdgjdg kjhhn hdjk"  ;
        
        System.out.println(str.matches("[0 1]+"));
        System.out.println(str1.matches("[0-9 A-F]*+"));
        System.out.println(date.matches("[03][0-9]/[01][0-9]/[0-9]{4}"));
        System.out.println(date.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/([0-9]{4})"));
        System.out.println(str3.replaceAll("[^a-zA-az0-9]",""));
        System.out.println(str4.replaceAll("\\s",""));
        System.out.println(str5.replaceAll( "\\s+"," "));
        System.out.println(str6.replaceAll( "\\s+"," ").trim());//remove leading or tailing  spaces
        // ham yaha pe double slace ka use karenge kyoki single slace error dega
        System.err.println(str7.split("\\s"));

        
        

    }
}
