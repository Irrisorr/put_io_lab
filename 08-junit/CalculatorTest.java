package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        for (int i = 0; i < 10; i++) {
            int a = i;
            int b = i+2;
            int sum = a + b;
            assertEquals(sum, calculator.add(a, b));
        }
    }

    @Test
    public void testMultiply(){
        for (int i = 0; i < 10; i++) {
            int a = i;
            int b = i+2;
            int sum = a * b;
            assertEquals(sum, calculator.multiply(a, b));
        }
    }

    @Test
    public void testAddPositive(){
        assertThrows(IllegalArgumentException.class,
                () -> {calculator.addPositiveNumbers(-2, 5);});
    }
}

class FailureOrErrorTest{

    private Calculator calculator;
    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void test1(){
        assertEquals(4, calculator.add(3,2));
    }

    @Test
    public void test2(){
        int fail = 1 / 0;
    }

    @Test
    public void test3(){
        try{
            assertEquals(4, calculator.add(2,3));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println(throwable.getClass());
        }
    }

}