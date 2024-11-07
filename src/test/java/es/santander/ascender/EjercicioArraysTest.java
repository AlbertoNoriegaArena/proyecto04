package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EjercicioArraysTest {

    @Test
    public void testGenerarArray100() {

        // Creamos una instancia
        EjercicioArrays ejercicio1 = new EjercicioArrays();

        // Ejecutamos el método
        int[] resultado = ejercicio1.generarArray100();

        // Verificamos que el array tiene el tamaño correcto
        assertEquals(100, resultado.length, "El tamaño del array no es 100.");

        // Verificamos que los valores en el array son los esperados (del 0 al 99)
        for (int i = 0; i < resultado.length; i++) {
            assertEquals(i, resultado[i], "El valor en el índice " + i + " no es correcto.");
        }
    }

}