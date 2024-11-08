package es.santander.ascender;

public class EjercicioArrays {

    public int[] generarArray100(){

        int[] vector100 = new int[100];

        for(int i=0; i<vector100.length; i++){
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
    
    
}
