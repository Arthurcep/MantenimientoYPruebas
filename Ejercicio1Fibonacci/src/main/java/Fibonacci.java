public class Fibonacci {

    /**
     * Método que devuelve el número de fibonacci correspondiente a la posición pasada como parámetro
     *
     * @param posicion posicion del numero de fibonacci
     * @return número de fibonacci en la posición obtenida como parámetro
     */


    public int compute(int posicion)
    {
        if (posicion < 0) throw new RuntimeException("ERROR: La posicion debe ser positiva. Valor obtenido: " + posicion);
        if (posicion < 2) return posicion;
        return compute(posicion - 1) + compute(posicion - 2);
    }
}
