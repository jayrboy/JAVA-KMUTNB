import java.util.Scanner;

public class EmailAddress {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print(">> "); String s = kb.nextLine();
        s=s.toLowerCase();
        int start = s.indexOf("\"mailto:");
        int stop = s.indexOf("\">", start);
        System.out.println(s.substring(start+"\"mailto:".length(), stop));
    }
}
