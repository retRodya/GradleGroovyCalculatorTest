import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setCalculator() {
        calculator = new Calculator();
    }

    @Test
    void add10To5Expect15() {
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result);
    }

    @Test
    void add100to50Expect150() {
        double expected = 150;
        double result = calculator.add("100", "50");
        assertEquals(expected, result, 0.001);
    }

    @Test
    void multiply10to5Expect50() {
        double expected = 50;
        double result = calculator.multiply(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void divide10to5Expect2() {
        double result = calculator.divide(10, 5);
        double expected = 2;
        assertEquals(expected, result, 0.001);
    }

    @Test
    void square10Expect100() {
        double result = calculator.square(10);
        double expected = 100;
        assertEquals(expected, result, 0.001);
    }

    @Test
    void squareRoot4Expect2() {
        double result = calculator.squareRoot(4);
        double expected = 2;
        assertEquals(expected, result, 0.001);
    }

    @Test
    void inputIncorrectValueExpectException1() {
        boolean isException = false;
        try {
            calculator.add("dawd", "5");
        } catch (Exception e) {
            isException = true;
        }
        assertTrue(isException);
    }

    @Test
    public void inputIncorrectValueExpectException2() {
        assertThrows(Exception.class, () -> {
            calculator.add("awda10", "5");
        });
    }

    @AfterEach
    void close() {
        calculator = null;
    }
}