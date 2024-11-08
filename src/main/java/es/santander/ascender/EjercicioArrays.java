package es.santander.ascender;

public class EjercicioArrays {

    /*
     * private => solo lo vamos a usar en la misma clase
     * static para poder usarlo fuera de la clase
     * final => es una constante, no se puede cambiar el valor
     */
    private static final int TAMANO = 100;

    public int[] generarArray100(){

        int[] vector100 = new int[TAMANO];

        for(int i=0; i<TAMANO; i++){
            vector100[i] = i;
        }

        return vector100;
        
    }

    public int[] invertirArray(int [] arreglo){

        int [] arrayInicial = arreglo;

        int [] arrayCambiado = new int [arrayInicial.length];


        int contador = arrayInicial.length-1;
        for(int i=0; i<arrayInicial.length; i++){

            arrayCambiado[i] = arrayInicial[contador];
            contador--;
        }
        return arrayCambiado;
    }

    public int  calcularSumaArreglo (int [] arreglo){

        int [] arregloInicial = arreglo;

        int suma = 0;
        
        
        for (int i = 0; i < arregloInicial.length; i++) {
            suma = suma + arregloInicial[i];
        }

        return suma;
    }

    public int  calcularMediaArreglo (int [] arreglo){

        int [] arregloInicial = arreglo;

        int suma = 0;
        int media = 0;
        
        for (int i = 0; i < arregloInicial.length; i++) {
            suma = suma + arregloInicial[i];
        }

        media = suma / arregloInicial.length;
        return media;
    }
    
    public int devolverValorDelIndiceArray(int [] arreglo, int indice){

        return arreglo[indice];

    }
    
}
