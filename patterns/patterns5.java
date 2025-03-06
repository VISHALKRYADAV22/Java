public class patterns5 {
    public static void main(String[] args)
     {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;//if we take place instead  of count++ is nothing it will print same number in pattern
              //  System.out.print(count+" ");
              System.out.format("%02d ",count);

            }
            System.out.println("");

        }
    }
}
