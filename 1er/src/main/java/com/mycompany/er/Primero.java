/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.er;

import algoritmosdeordenamineto.Burbuja;
import algoritmosdeordenamineto.BurbujaOpt;
import algoritmosdeordenamineto.Insercion;
import algoritmosdeordenamineto.Mezcla;
import algoritmosdeordenamineto.QuickSort;
import algoritmosdeordenamineto.Seleccion;
import java.util.Scanner;
        

/**
 *
 * @author pedro
 */
public class Primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        int[] arreglo = {50,70,24,14,5};
        System.out.println("1.-Burbuja\n2.-Burbuja Optimizado\n3.-Insercion\n4.-Mezcla\n5.-QuickSort\n6.-Seleccion");
        int opc;
        Scanner scan=new Scanner(System.in);
        opc=scan.nextInt();
        switch(opc){
            case 1:
                metBur(arreglo);
                System.out.println();
                break;
            case 2:
                metBurOpt(arreglo);
                System.out.println();
                break;
            case 3:
                metIns(arreglo);
                System.out.println();
                break;
            case 4:
                metMez(arreglo);
                System.out.println();
                break;
            case 5:
                metQuick(arreglo);
                System.out.println();
                break;
            case 6:
                metSel(arreglo);
                System.out.println();
                break;
        }
        
    }
    
    /*public int fibonacciRecursivo(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fibonacciRecursivo(n-1)+ fibonacciRecursivo(n-2);
        }
    }
    public static int sumaRecursiva(int n){
        int res;
        if(n==1){
            return 1;
        }else{
            res=n + sumaRecursiva(n-1);
            return res;
        }
        
}
    public static int factorial(int n){
        
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }*/
    public static void metBur(int[] arreglo){
         Burbuja burbuja1=new Burbuja();
        burbuja1.ordenar(arreglo);
    }
    public static void metBurOpt(int[] arreglo){
        BurbujaOpt Obj1=new BurbujaOpt();
        Obj1.ordenar(arreglo);
    }
    public static void metIns(int[] arreglo){
        Insercion Obj1=new Insercion();
        Obj1.ordenar(arreglo);
    }
    public static void metMez(int[] arreglo){
        Mezcla Obj1=new Mezcla();
        arreglo=Obj1.ordenar(arreglo);
    }
    public static void metQuick(int[] arreglo){
        QuickSort Obj1=new QuickSort();
        Obj1.ordenar(arreglo, 0, arreglo.length-1);
    }
    public static void metSel(int[] arreglo){
        Seleccion Obj1=new Seleccion();
        Obj1.ordenar(arreglo);
    }
}