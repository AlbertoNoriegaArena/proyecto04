package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EjercicioArraysTest {

    private static final int TAMANO_REQUERIDO = 100;

    @Test
    public void testGenerarArray100() {

        // Creamos una instancia
        EjercicioArrays ejercicio1 = new EjercicioArrays();

        // Ejecutamos el método
        int[] resultado = ejercicio1.generarArray100();

        // Verificamos que el array tiene el tamaño correcto
        assertEquals(TAMANO_REQUERIDO, resultado.length, "El tamaño del array no es 100.");

        // Verificamos que los valores en el array son los esperados (del 0 al 99)
        for (int i = 0; i < resultado.length; i++) {
            assertEquals(i, resultado[i], "El valor en el índice " + i + " no es correcto.");
        }
    }

    @Test
    public void testInvertirArray() {

        int [] arrayInicial = new int[] {10, -5, 7, 20, -8, 1, 4};
        // int [] arrayInicial = {10, -5, 7, 20, -8, 1, 4}; => sería lo mismo que lo de arriba
        int [] arrayCambiado = new int[] {4, 1, -8, 20, 7, -5, 10};

        // Creamos una instancia
        EjercicioArrays ejercicio1 = new EjercicioArrays();

        int[] resultado = ejercicio1.invertirArray(arrayInicial);

        // Verificamos que el array tiene el tamaño correcto
        assertEquals(ejercicio1.invertirArray(arrayInicial).length, resultado.length, "El tamaño del array no es correcto.");

        // Comparamos ambos arrays
        
        assertArrayEquals(arrayCambiado, resultado);
            
    }

    @Test
    public void testCalcularSumaArreglo() {
        int [] arregloInicial = new int [] {1, 5, 3};
        int suma = 9;

        EjercicioArrays ejercicio3 = new EjercicioArrays();

        int resultado = ejercicio3.calcularSumaArreglo(arregloInicial);

        assertEquals(resultado, suma);
    }

    @Test
    public void testCalcularMediaArreglo() {
        int [] arregloInicial = new int [] {1, 5, 3};
        int media = 3;

        EjercicioArrays ejercicio4 = new EjercicioArrays();

        int resultado = ejercicio4.calcularMediaArreglo(arregloInicial);

        assertEquals(resultado, media);
    }

    @Test
    public void testDevolverValorDelIndiceArray() throws Exception {

        EjercicioArrays ejercicio5 = new EjercicioArrays();

        float resultado = ejercicio5.devolverValorDelIndiceArray(new float [] {1, 3.3F, 5.6F, 9.4F, -4}, 1);

        // 3.3F => Hay que poner la F porque tienes un double y quieres un float
        assertEquals(3.3F, resultado);
        


    }

}
