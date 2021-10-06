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
public class BurbujaOpt {
    private int comparaciones;
    private int intercambios;
    
    public BurbujaOpt(){
        this.comparaciones=0;
        this.intercambios=0;
    }
    
    public void ordenar(int[] arreglo){
         for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - i - 1; j++)
                 { 
                   this.comparaciones++;
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp;
                       tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    this.intercambios++;
                }
            }
        }
         System.out.println();
    }
   
}
