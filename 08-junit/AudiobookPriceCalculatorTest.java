package put.io.testing.audiobooks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class AudiobookPriceCalculatorTest {

    AudiobookPriceCalculator calculator = null;
    Customer customer = null;
    Audiobook audiobook = null;

    @BeforeEach
    void setUp() {
        calculator = new AudiobookPriceCalculator();
        audiobook = new Audiobook("Title", 100);
    }


    @Test
    public void test1(){
        customer = new Customer("name", Customer.LoyaltyLevel.STANDARD,false);
        calculator = new AudiobookPriceCalculator();
        assertEquals(40.0, calculator.calculate(customer, audiobook));
    }

    @Test
    public void test2(){
        customer = new Customer("name", Customer.LoyaltyLevel.STANDARD,true);
        calculator = new AudiobookPriceCalculator();
        assertEquals(10.0,calculator .calculate(customer, audiobook));
    }
    @Test
    public void test3(){
        customer = new Customer("name", Customer.LoyaltyLevel.SILVER,false);
        calculator = new AudiobookPriceCalculator();
        assertEquals(60.0,calculator.calculate(customer, audiobook));
    }
    @Test
    public void test4(){
        customer = new Customer("name", Customer.LoyaltyLevel.GOLD,false);
        calculator = new AudiobookPriceCalculator();
        assertEquals(80.0,calculator.calculate(customer, audiobook));
    }

}