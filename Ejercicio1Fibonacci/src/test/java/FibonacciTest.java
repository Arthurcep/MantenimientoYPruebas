import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest
{

    /**
     * Fibonacci:
     *
     *
     */


    @Test
    public void fibonacciDeCeroEsCero()
    {
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeUnoEsUno()
    {
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeDosEsUno()
    {
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeDiezEsCincuentaYCinco()
    {
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 55;
        int obtainedValue = fibonacci.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeNegativoProduceExcepcion()
    {
        Fibonacci fibonacci = new Fibonacci();

        assertThrows(RuntimeException.class, () -> fibonacci.compute(-2));
    }
}
