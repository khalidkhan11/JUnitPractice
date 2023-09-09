import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @Test
    void multiply(){
        assertEquals(20, calculator.multiply(5,4));
    }
    @RepeatedTest(5)
    void testMultiplyByZero(){
        assertEquals(0, calculator.multiply(0,5), "multiply by zero should be zero");
    }
}
