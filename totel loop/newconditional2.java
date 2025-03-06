//find type of website and the protcol used
import java.util.*;
public class newconditional2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a url");
        String url=sc.nextLine();
        String protocol=url.substring(0, url.indexOf(":"));
        if(protocol.equals("http"))
            System.out.println("hypertext transfer Protocol");

        else if(protocol.equals("ftp"))
        System.out.println("file transfer Protocol");
        String ext=url.substring(url.lastIndexOf("."));
        if(ext.equals("com"))
        System.out.println("Commercial");
        else if (ext.equals("org"))
        System.out.println("Organisation");
        else if(ext.equals("net"))
        System.out.println("Network");
        
        
    }
}
