package es.santander.ascender;

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

    public int calcularSumaArreglo(int[] arreglo) {

        int[] arregloInicial = arreglo;

        int suma = 0;

        for (int i = 0; i < arregloInicial.length; i++) {
            suma = suma + arregloInicial[i];
        }

        return suma;
    }

    public int calcularMediaArreglo(int[] arreglo) {

        int[] arregloInicial = arreglo;

        int suma = 0;
        int media = 0;

        for (int i = 0; i < arregloInicial.length; i++) {
            suma = suma + arregloInicial[i];
        }

        media = suma / arregloInicial.length;
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

}
