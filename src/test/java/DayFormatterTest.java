import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ivan on 18.06.2020. All rights reserved.
 */

public class DayFormatterTest {
    private DayFormatter dayFormatter = new DayFormatter();

    @Test
    public void shouldDisplaySetOfDaysWithoutRange2() {
        assertEquals("2", dayFormatter.format(2));
    }

    @Test
    public void shouldDisplaySetOfDaysWithoutRange3() {
        assertEquals("2,4", dayFormatter.format(24));
    }

    @Test
    public void shouldDisplaySetOfDaysWithoutRange4() {
        assertEquals("1,3,5", dayFormatter.format(135));
    }


    @Test
    public void shouldDisplaySetOfDaysWithRange2() {
        assertEquals("1-3,5,7-9", dayFormatter.format(133225879));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange3() {
        assertEquals("5-6", dayFormatter.format(56));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange4() {
        assertEquals("1-3", dayFormatter.format(123));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange5() {
        assertEquals("1-2,5", dayFormatter.format(125));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange6() {
        assertEquals("1-3,6-7", dayFormatter.format(12367));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange7() {
        assertEquals("1,3-7", dayFormatter.format(134567));
    }

    @Test
    public void shouldDisplaySetOfDaysWithRange8() {
        assertEquals("1-3,5-7", dayFormatter.format(12365375));
    }

}