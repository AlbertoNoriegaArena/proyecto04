package es.santander.ascender;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public String[] buscarRepetidos(String[] arreglo1, String[] arreglo2) throws Exception {

        // Verificar si los arreglos son nulos
        if (arreglo1 == null || arreglo2 == null) {
            throw new Exception("Las cadenas no pueden ser nulas");
        }

        // Crear un array temporal para almacenar coincidencias únicas
        String[] temporalesRepetidos = new String[Math.min(arreglo1.length, arreglo2.length)];
        int posicionArrayResultados = 0;

        // Buscar coincidencias y agregar sin duplicados
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i].equals(arreglo2[j])) {

                    boolean yaExiste = false;

                    // Verificar si el elemento ya está en temporalesRepetidos
                    for (int k = 0; k < posicionArrayResultados; k++) {
                        if (temporalesRepetidos[k].equals(arreglo1[i])) {
                            yaExiste = true;
                            break;
                        }
                    }

                    // Si no existe, agregarlo al arreglo temporal
                    if (!yaExiste) {
                        temporalesRepetidos[posicionArrayResultados] = arreglo1[i];
                        posicionArrayResultados++;
                    }
                    break; // Salir del bucle interno para evitar duplicados
                }
            }
        }

        // Crear el arreglo final con el tamaño exacto de coincidencias únicas
        String[] resultadosRepetidos = new String[posicionArrayResultados];
        System.arraycopy(temporalesRepetidos, 0, resultadosRepetidos, 0, posicionArrayResultados);

        // Ordenar el arreglo alfabéticamente
        Arrays.sort(resultadosRepetidos);

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

    public int encontrarSegundoValorMasPequeno(int arreglo[]) throws Exception {

        // necesitamos como minimo un array con dos registros
        if (arreglo == null || arreglo.length < 2) {
            throw new Exception("Por lo menos necesito dos valores en el array");
        }

        // Fijamos dos variables con el valor maximo que puedo tener un Int
        int primerValorMasBajo = Integer.MAX_VALUE;
        int segundoValorMasBajo = Integer.MAX_VALUE;

        // Si array[0] es menor que el MAX_VALUE se lo asignamos a la variable
        if (arreglo[0] < primerValorMasBajo) {
            primerValorMasBajo = arreglo[0];
        }

        // Iteramos
        for (int i = 1; i < arreglo.length; i++) {
            // menor que el segundo y menor que el primero => cambiamos el valor de las dos variables
            if (arreglo[i] < primerValorMasBajo) {
                segundoValorMasBajo = primerValorMasBajo;
                primerValorMasBajo = arreglo[i];           
            } else {
                // menor que el segundo pero mayor que el primero => solo cambiamos el segundo valor
                if (arreglo[i] != primerValorMasBajo && arreglo[i] < segundoValorMasBajo) {
                    segundoValorMasBajo = arreglo[i];
                }
            }
        }
        return segundoValorMasBajo;
    }


    public int encontrarSegundoValorMasPequenoSencillo(int arreglo[]) throws Exception {
    
        // necesitamos como minimo un array con dos registros
        if (arreglo == null || arreglo.length < 2) {
            throw new Exception("Por lo menos necesito dos valores en el array");
        }

        Arrays.sort(arreglo);

        return arreglo[1];
    }

    public boolean arreglosIguales(double[] arreglo1, double[] arreglo2) {

        boolean iguales = true;

        if (arreglo1 == null || arreglo2 == null || arreglo1.length != arreglo2.length) {
            iguales = false;
        } else {
            for (int i = 0; i < arreglo2.length; i++) {
                if (arreglo1[i] != arreglo2[i]) {
                    iguales = false;
                    break;
                }
            }
        }

        return iguales;
    }
}
