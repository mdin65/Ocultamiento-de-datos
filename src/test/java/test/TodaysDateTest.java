package test;
import org.example.TodaysDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodaysDateTest {

    @Test
    public void testDateNotNull() {
        TodaysDate date = new TodaysDate();
        assertNotNull(date.getTime(), "La hora no debe ser nula");
    }

    @Test
    public void testDayRange() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getDay() >= 1 && date.getDay() <= 31, "Día debe estar entre 1 y 31");
    }

    @Test
    public void testMonthRange() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getMonth() >= 1 && date.getMonth() <= 12, "Mes debe estar entre 1 y 12");
    }

    @Test
    public void testYearGreaterThan2020() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getYear() >= 2020, "El año debe ser razonablemente reciente");
    }
}
