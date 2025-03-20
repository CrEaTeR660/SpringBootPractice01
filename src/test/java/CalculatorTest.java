import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Disabled //跳過test class
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);


        assertNotNull(result);
        assertTrue(result > 0);
        assertEquals(3, result); //assert斷言，我認為這兩個參數的值是一樣的
    }


    @DisplayName("測試除法問題") //自訂義描述這個方法
    @Test
    public void divide() {
        Calculator caculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            caculator.divide(1, 0);

        });
    }
}