import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println("HashSet of days of the week:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        Set<String> orderedDays = new LinkedHashSet<>(daysOfWeek);

        System.out.println("\nLinkedHashSet of days of the week (preserving order):");
        for (String day : orderedDays) {
            System.out.println(day);
        }

        System.out.println("\nIs the first Set equal to the second one? " + daysOfWeek.equals(orderedDays));
    }
}