package es.santander.ascender;

import java.util.ArrayList;
import java.util.List;

public class EjercicioArrays {

    /*
     * private => solo lo vamos a usar en la misma clase
     * static para poder usarlo fuera de la clase
     * final => es una constante, no se puede cambiar el valor
     */
    private static final int TAMANO = 100;

    public int[] generarArray100() {

        int[] vector100 = new int[TAMANO];

        for (int i = 0; i < TAMANO; i++) {
            vector100[i] = i;
        }

        return vector100;

    }

    public int[] invertirArray(int[] arreglo) {

        int[] arrayInicial = arreglo;

        int[] arrayCambiado = new int[arrayInicial.length];

        int contador = arrayInicial.length - 1;
        for (int i = 0; i < arrayInicial.length; i++) {

            arrayCambiado[i] = arrayInicial[contador];
            contador--;
        }
        return arrayCambiado;
    }

    public double calcularSumaArreglo(double[] arreglo) {

        double[] arregloInicial = arreglo;

        double suma = 0;

        for (int i = 0; i < arregloInicial.length; i++) {
            suma = suma + arregloInicial[i];
        }

        return suma;
    }

    public double calcularMediaArreglo(double[] arreglo) {

        double suma = calcularSumaArreglo(arreglo);

        double media = suma / arreglo.length;
        return media;
    }

    // throws solo puede ir en los metodos => el metodo solo lanza una excepcion
    public float devolverValorDelIndiceArray(float[] arreglo, int indice) throws Exception {

        // Como el indice no puede ser negativo:
        if (indice <= 0) {
            // Como no puede pasar, lanza una excepción
            throw new Exception("Me has pedido un indice negativo: " + indice);
        } else {
            if (indice >= arreglo.length) {
                throw new Exception("El indice no puede ser mayor que el número de argumentos del array: " + indice);
            }
        }

        return arreglo[indice];

    }

    public String[] buscarRepetidos(String[] arreglo1, String[] arreglo2) {

        // Compruebo cual de los arrays es más largo
        int arregloMayor = arreglo1.length;
        if (arreglo2.length > arreglo1.length) {
            arregloMayor = arreglo2.length;
        }

        // Creo un array para guardar las coincidencias
        String[] resultadosRepetidos = new String[arregloMayor];
        int contadorGuardarDatos = 0;

        // Buscamos los valores repetidos
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i].equals(arreglo2[j])) {
                    resultadosRepetidos[contadorGuardarDatos] = arreglo2[j];
                    contadorGuardarDatos++;
                }
            }
        }

        return resultadosRepetidos;

    }

    public String[] buscarRepetidosArrayList(String[] arreglo1, String[] arreglo2) {

        List<String> resultadosRepetidos = new ArrayList<>();

        // Buscamos los valores repetidos
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i].equals(arreglo2[j]) && !resultadosRepetidos.contains(arreglo1[i])) {
                    resultadosRepetidos.add(arreglo1[i]);
                    break; // Salimos del segundo bucle para evitar duplicados
                }
            }
        }

        // Se transforma la lista en un array de String
        return resultadosRepetidos.toArray(new String[0]);

    }

}
