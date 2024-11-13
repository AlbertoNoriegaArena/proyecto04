package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EjercicioArraysTest {

    private static final int TAMANO_REQUERIDO = 100;
    private static final double DELTA = 0.00000001;

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

        int[] arrayInicial = new int[] { 10, -5, 7, 20, -8, 1, 4 };
        // int [] arrayInicial = {10, -5, 7, 20, -8, 1, 4}; => sería lo mismo que lo de
        // arriba
        int[] arrayCambiado = new int[] { 4, 1, -8, 20, 7, -5, 10 };

        // Creamos una instancia
        EjercicioArrays ejercicio1 = new EjercicioArrays();

        int[] resultado = ejercicio1.invertirArray(arrayInicial);

        // Verificamos que el array tiene el tamaño correcto
        assertEquals(ejercicio1.invertirArray(arrayInicial).length, resultado.length,
                "El tamaño del array no es correcto.");

        // Comparamos ambos arrays

        assertArrayEquals(arrayCambiado, resultado);

    }

    @Test
    public void testCalcularSumaArreglo() {
        double[] arregloInicial = new double[] { 1.6, 5.3, 3.9, 0.0 };
        double suma = 10.8;

        EjercicioArrays ejercicio3 = new EjercicioArrays();

        double resultado = ejercicio3.calcularSumaArreglo(arregloInicial);

        assertEquals(resultado, suma, DELTA); // Le metemos un delta para evitar problema de decimales
    }

    @Test
    public void testCalcularMediaArreglo() {
        double[] arregloInicial = new double[] { 1.5, 5.2, 3.7 };
        double media = 10.4 / 3;

        EjercicioArrays ejercicio4 = new EjercicioArrays();

        double resultado = ejercicio4.calcularMediaArreglo(arregloInicial);

        assertEquals(media, resultado, DELTA);
    }

    @Test
    public void testDevolverValorDelIndiceArray() throws Exception {

        EjercicioArrays ejercicio5 = new EjercicioArrays();

        float resultado = ejercicio5.devolverValorDelIndiceArray(new float[] { 1, 3.3F, 5.6F, 9.4F, -4 }, 1);

        // 3.3F => Hay que poner la F porque tienes un double y quieres un float
        assertEquals(3.3F, resultado);
    }

    @Test
    public void testDevolverValorDelIndiceArray_ConIndiceNegativo() throws Exception {

        EjercicioArrays ejercicio5 = new EjercicioArrays();

        // Hacemos que el indice que tiene que buscar sea negativo
        int indiceNegativo = -5;

        assertThrows(Exception.class, // El primer argumento tiene que ser una clase
                () -> ejercicio5.devolverValorDelIndiceArray(new float[] { 1, 3.3F, 5.6F, 9.4F, -4 }, indiceNegativo)); // funcion lambda para que funcione                                                                                         
    }

    @Test
    public void testBuscarRepetidos() throws Exception {

        EjercicioArrays cut = new EjercicioArrays();

        String[] primeraLista = { "Hola", "Adios", "Mitad" };
        String[] segundaLista = { "Adios", "Otro", "Hola" };

        String[] duplicados = cut.buscarRepetidos(primeraLista, segundaLista);

        assertArrayEquals(new String[] { "Adios", "Hola" }, duplicados);
    }

    @Test
    public void testBuscarRepetidos_ArraysNulos() throws Exception {

        EjercicioArrays cut = new EjercicioArrays();

        String[] primeraLista = { "Hola", "Adios", "Mitad" };
        String[] segundaLista = null;

        String[] duplicados = cut.buscarRepetidos(primeraLista, segundaLista);

        assertThrows(Exception.class,
                () -> cut.buscarRepetidos(primeraLista, null));
        assertThrows(Exception.class,
                () -> cut.buscarRepetidos(segundaLista, null));
    }

    @Test
    public void testBuscarRepetidosArrayList() {

        EjercicioArrays sut = new EjercicioArrays();

        String[] array1 = { "cabeza", "pie", "pierna", "brazo", "ojos" };
        String[] array2 = { "ojos", "orejas", "pie", "brazo" };

        String[] resultadoEsperado = { "brazo", "pie", "ojos" };
        String[] resultado = sut.buscarRepetidosArrayList(array1, array2);

        // Ordenamos alfabéticamente los arrays para compararlos
        Arrays.sort(resultadoEsperado);
        Arrays.sort(resultado);

        // Comprobamos que sean iguales
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testEncontrarSegundoValorMasPequeno() throws Exception {

        EjercicioArrays sut = new EjercicioArrays();

        int[] arreglo = { 1, 3, 8, -5, 120, -70, 0 };

        int valorEsperado = -5;

        assertEquals(sut.encontrarSegundoValorMasPequeno(arreglo), valorEsperado);
    }

    @Test
    public void testEncontrarSegundoValorMasPequenoSencillo() throws Exception {

        EjercicioArrays sut = new EjercicioArrays();

        int[] arreglo = { 1, 3, 8, -5, 120, -170, -120 };

        int valorEsperado = -120;

        assertEquals(sut.encontrarSegundoValorMasPequenoSencillo(arreglo), valorEsperado);
    }

    @Test
    public void testArreglosIguales(){

        EjercicioArrays sut = new EjercicioArrays();

        double [] arreglo2 = { 1.0, 3.4, 8.7, -5.9, 120.1, -170.3, -120.2 };
        double [] arreglo1 = { 1.0, 3.4, 8.7, -5.9, 120.1, -170.3, -120.2 };

        assertTrue(sut.arreglosIguales(arreglo1, arreglo2));
    }

}
