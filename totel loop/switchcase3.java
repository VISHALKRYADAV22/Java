public class switchcase3 {
    public static void main(String[] args) {
        byte n=3;//we also take byte and String str
        switch(n)
        {
            case 1: System.out.println("one");//if we write in string term we use case"2" instead of case 2
            break;
            case 2:System.out.println("two");
            break;
            case 3: System.out.println("three");
            break;
            default:System.out.println("not valid");

        }

    }
}
