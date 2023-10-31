import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TomorrowTest {

    @ParameterizedTest
    @CsvSource({
        "1996-02-28 , 1996-02-29",
        "2000-03-23 , 2000-03-24",
        "2002-09-16 , 2002-09-17",
        "2015-07-07 , 2015-07-08",
        "2022-12-31 , 2023-01-01"
    })
    void testTomorrow(String date , String exceptedDate){
        Tomorrow d1 = new Tomorrow(date);

        assertEquals(exceptedDate , d1.checkTomorrow());
    }
}