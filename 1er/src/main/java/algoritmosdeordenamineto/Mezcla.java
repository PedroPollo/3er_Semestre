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
public class Mezcla {
  //  private int[] datos;
    
    public int[] ordenar(int[] arreglo){
       int i,j,k;
       if(arreglo.length>1){
           int nElementosIzq=arreglo.length/2;
           int nElementosDer=arreglo.length-nElementosIzq;
           int arregloIzq[]=new int[nElementosIzq];
           int arregloDer[]=new int[nElementosDer];
           for(i=0;i<nElementosIzq;i++){
               arregloIzq[i]=arreglo[i];
           }
           for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++){
               arregloDer[i-nElementosIzq]=arreglo[i];
           }
           arregloIzq=ordenar(arregloIzq);
           arregloDer=ordenar(arregloDer);
           i=0;
           j=0;
           k=0;
           while(arregloIzq.length!=j && arregloDer.length!=k){
               if(arregloIzq[j]<arregloDer[k]){
                   arreglo[i]=arregloIzq[j];
                   i++;
                   j++;
               }else{
                   arreglo[i]=arregloDer[k];
                   i++;
                   k++;
               }
           }
           while(arregloIzq.length!=j){
               arreglo[i]=arregloIzq[j];
               i++;
               j++;
           }
           while(arregloDer.length!=k){
               arreglo[i]=arregloDer[k];
               i++;
               k++;
           }
       }
       System.out.println();
       return arreglo;
    }
}
