import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    @ParameterizedTest
    @CsvSource({
        "100 , NT , 100 , US , 3100.0 , NT",
        "100 , US , 100 , NT , 103.33 , US",
        "200 , NT , 500 , NT , 700.0 , NT",
        "450 , US , 970 , US , 1420.0 , US"
    })
    void testCurrency(double amount1 , String symbol1 , double amount2 , String symbol2 , double amount , String symbol){
        Currency c1 = new Currency(amount1 , symbol1);
        Currency c2 = new Currency(amount2 , symbol2);

        Currency sum = c1.add(c2);

        assertEquals(amount , sum.amount);
        assertEquals(symbol , sum.symbol);
    }
}