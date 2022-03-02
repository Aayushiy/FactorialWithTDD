import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactTest {
    @Test
    void willReturnNegOneIfNegative() {
        factorial Calc= new factorial(-1);

        int Value=Calc.calcFactorial();
        assertEquals(Value,-1);
    }

    @Test
    void willReturnOneIfZero() {
        factorial Calc= new factorial(0);
        int Value=Calc.calcFactorial();
        assertEquals(Value,1);
    }

    @Test
    void willReturn120for5() {
        factorial Calc= new factorial(5);
        int Value=Calc.calcFactorial();
        assertEquals(Value,120);
    }

    @Test
    void willReturn24for4() {
        factorial Calc=new factorial(4);
        int Value=Calc.calcFactorial();
        assertEquals(Value,24);
    }
}
