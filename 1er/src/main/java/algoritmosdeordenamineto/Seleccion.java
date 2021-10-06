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
public class Seleccion {
    
    public void ordenar(int[] arreglo){
        System.out.println();
        for(int i=0;i<arreglo.length-1;i++){
            int menor=i;
            for(int j=i+1;j<arreglo.length;j++){
                if(arreglo[j]<arreglo[menor]){
                    menor=j;
                }
            }
            if(menor!=i){
                int aux=arreglo[i];
                arreglo[i]=arreglo[menor];
                arreglo[menor]=aux;
            }
        }
        System.out.println();
    }
    
}
