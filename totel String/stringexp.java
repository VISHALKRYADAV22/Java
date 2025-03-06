public class stringexp {
    public static void main(String[] args) {
        String str1="vishalkr@gmail.com";
        int i=str1.indexOf("@");
        String uname=str1.substring(0,i);
        String domain=str1.substring(i+1,str1.length());
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);

        System.out.println("username:"+uname);
        System.out.println("domain:"+domain);
        System.out.println(domain.startsWith("gmail"));
        System.out.println(str1.indexOf("."));
        System.out.println(name.equals("gmail"));

    }
}
