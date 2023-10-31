import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @ParameterizedTest
    @CsvSource({
        "1 , 10 , 星期日",
        "3 , 23 , 星期二",
        "8 , 2 , 星期一",
        "10 , 13 , 星期三",
        "12 , 25 , 星期六"
    })
    void testWeek(int month , int day , String week) throws Week.WrongException {
        Week test1 = new Week(month , day);
        assertEquals(week , test1.checkWeek());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/week.csv", numLinesToSkip = 1)
    void testWeekFile(int month , int day , String week) throws Week.WrongException {
        Week test2 = new Week(month , day);
        assertEquals(week , test2.checkWeek());
    }

}