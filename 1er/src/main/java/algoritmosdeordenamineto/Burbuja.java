/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenamineto;

/**
 *
 * @author pedro
 */
public class Burbuja {
    
    public void ordenar(int arreglo[]){
        for(int i=0; i<(arreglo.length-1); i++){ //¿Cuántas vueltas dar?
            for(int j=0; j<(arreglo.length-1); j++){ // intercambios
                if(arreglo[j] > arreglo[j+1]){
                   int aux = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = aux;
                }
           }
    }System.out.println();
}
}