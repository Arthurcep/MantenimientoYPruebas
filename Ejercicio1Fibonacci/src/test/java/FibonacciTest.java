import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest
{

    /**
     * Los test se encargan de probar la mayoría de casos posibles
     * Los diferentes valores con los que se pueden llamar al método 'compute' son:
     *  - 0 y 1 (Casos base)
     *  - >= 2
     *  - < 0
     */

    Fibonacci fibonacci;

    @BeforeEach
    public void inicia()
    {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciDeCeroEsCero()
    {
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeUnoEsUno()
    {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeDosEsUno()
    {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeDiezEsCincuentaYCinco()
    {
        int expectedValue = 55;
        int obtainedValue = fibonacci.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void fibonacciDeNegativoProduceExcepcion()
    {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-2));
    }
}
