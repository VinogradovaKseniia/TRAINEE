import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {
    @DataProvider
    public Object[][] getValidValues() {
        return new Object[][]{{0, 1}, {1, 1}, {11, 39916800}, {12, 479001600}};
    }

    @Test(dataProvider = "getValidValues")
    void testValidValue(Integer value, Integer expected) {
        Factorial factorial = new Factorial();
        int result = factorial.getFactorial(value);
        Assert.assertEquals(result, expected);
    }

    @DataProvider
    public Object[] getNotValidValues() {
        return new Object[]{-1, 13};
    }

    @Test(dataProvider = "getNotValidValues")
    void testNotValidValue(Integer value) {
        Factorial factorial = new Factorial();
        try {
            factorial.getFactorial(value);
        } catch (ArithmeticException e) {
            return;
        }
        Assert.fail();
    }

}
