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
public class Insercion {
    int pos,aux;
    public void ordenar(int[] arreglo){
        for(int i=0;i<(arreglo.length);i++){
            pos=i;
            aux=arreglo[i];
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
    }
}
