public class Fibonacci {
    public int compute(int value)
    {
        if (value < 0) throw new RuntimeException("ERROR: La posicion debe ser positiva. Valor obtenido: " + value);
        if (value < 2) return value;
        return compute(value - 1) + compute(value - 2);
    }
}
