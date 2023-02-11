import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.CountOfSquares.services.SQRService;

class SQRServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void calcInExactMaxLimit(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();

        int actual = service.calcSquare(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}
