//nested loop =a loop inside the loop
// if i have two nested loop its two dimensional and three nested loop its three dimensional and so on.....
//nested loop apply on all types of loop
public class nested {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)//outer loop
        {
            for(int j=1;j<=6;j++)
            {
                System.out.print("("+i+","+j+")");//inner loop

            }
            System.out.println("");

        }
    }
}
