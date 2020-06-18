import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ivan on 18.06.2020. All rights reserved.
 */
public class DayFormatter {

    public String format(Integer number) {
        Set<Integer> daySet = getDaySet(number);
        StringBuilder builder = new StringBuilder();
        Iterator<Integer> dayIterator = daySet.iterator();
        boolean interval = false;
        Integer newDay = null;

        while (dayIterator.hasNext()) {
            Integer day = dayIterator.next();
            if (newDay == null) {
                newDay = day;
                builder.append(newDay);
            } else if (day > newDay + 1) {
                if (interval) {
                    builder.append(newDay);
                    interval = false;
                }
                builder.append(",");
                builder.append(day);
                newDay = day;
            } else {
                interval = true;
                builder.append("-");
                if (!dayIterator.hasNext()) {
                    builder.append(day);
                }
                newDay = day;
            }
        }
        return builder.toString().replaceAll("-{2,}", "-");
    }

    private Set<Integer> getDaySet(Integer number) {
        Set<Integer> daySet = new TreeSet<>();
        while (number > 0) {
            daySet.add(number % 10);
            number /= 10;
        }
        return daySet;
    }
}
