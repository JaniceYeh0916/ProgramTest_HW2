import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @ParameterizedTest
    @CsvSource({
        "1.85 , 76 , 20",
        "1.78 , 65 , 20.52",
        "1.63 , 70 , 26.35",
        "1.56 , 53 , 21.78",
        "1.49 , 47 , 21.17"
    })
    void testBMI(double height , double weight , double bmi) {
        BMI user = new BMI(height , weight);
        assertEquals(bmi , user.setBmi());
    }
}