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
public class QuickSort {
    public void ordenar(int[] arreglo,int primero,int ultimo){
        int i,j,pivote,aux;
        i=primero;
        j=ultimo;
        pivote=arreglo[(primero+ultimo)/2];
                do{
                    while(arreglo[i]<pivote){
                        i++;
                    }
                    while(arreglo[j]>pivote){
                        j--;
                    }
                    if(i<=j){
                        aux=arreglo[i];
                        arreglo[i]=arreglo[j];
                        arreglo[j]=aux;
                        i++;
                        j--;
                    }
                }while(i<=j);
                if(primero<j){
                    ordenar(arreglo,primero,j);
                }
                if(i<ultimo){
                    ordenar(arreglo,i,ultimo);
                }
                System.out.println();
    }
}
