
import java.util.Scanner;

public class MonthToNumber {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("> ");
    String month = kb.next().trim();
    
    String abbr = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    
    int k = abbr.indexOf(month.toUpperCase());
    
    if (k == -1 || k%3 != 0 || month.length() != 3)
            System.out.println("Invalid month abbreviation");
    else
            System.out.println(month + " --> " + (k/3 + 1) );
    }
}
