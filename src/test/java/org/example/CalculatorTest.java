package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void Calculator_test4plus5is9(){
        int res = Calculator.calc(5,4);
        Assertions.assertEquals(9,res);
    }
    @Test
    void Calculator_test3plus3is6(){
        int res = Calculator.calc(3,3);
        Assertions.assertEquals(6,res);
    }
}
