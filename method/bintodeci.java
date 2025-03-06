package method;

public class bintodeci {
    public static int bintoDeci(int binNum) {
        int pow=0;
        int deciNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            deciNum=deciNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
    return deciNum;
    }

public static void main(String args[]){
   int result= bintoDeci(101);
   System.out.println("decimalvalue="+ result);
}
}
