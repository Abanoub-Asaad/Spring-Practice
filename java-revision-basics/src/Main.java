import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Enumeration daysEnum;
        Vector days = new Vector();
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        daysEnum = days.elements();
        while (daysEnum.hasMoreElements()) {
            System.out.println(daysEnum.nextElement());
        }
    }
}