import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FactorialTest {

    @DisplayName("Тест расчета факториала на валидных значениях")
    @ParameterizedTest
    @CsvSource({"0, 1", "1,1", "11, 39916800", "12, 479001600"})
    void testValidValue(int value, int expected) {
        Factorial factorial = new Factorial();
        int result = factorial.getFactorial(value);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @DisplayName("Тест расчета факториала на валидных значениях")
    @ValueSource(ints = {-1, 13})
    void testNotValidValue(int value) {
        Factorial factorial = new Factorial();
        try {
            factorial.getFactorial(value);
        } catch (ArithmeticException e) {
            return;
        }
        Assertions.fail();
    }
}
