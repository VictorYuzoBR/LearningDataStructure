/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

/**
 *
 * @author PC Gamer
 */
public class quicksort {
    
     public static void main(String[] args) {
       
       int[] lista = {5,6,8,9,1,7,3,2};
       
       for (int i = 0; i<lista.length;i++) {
            System.out.print(lista[i]+" ");
        }
       
       aplicarquick(lista, 0, lista.length - 1);
       
         System.out.println("");
       for (int i = 0; i<lista.length;i++) {
            System.out.print(lista[i]+" ");
        }
        
    }
     
    public static void aplicarquick(int[] lista, int inicio, int fim) {
        
        if (fim <= inicio) return;
        
        int p = partir(lista,inicio,fim);
        
        aplicarquick(lista, inicio,p-1);
        aplicarquick(lista, p+1, fim);
        
       
        
        
    } 
    
    public static int partir(int[] lista, int inicio, int fim) {
        
        int p = lista[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j <= fim; j++) {
            if (lista[j] < p) {
                i++;
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
            }
        }
        i++;
        int aux = lista[i];
        lista[i] = lista[fim];
        lista[fim] = aux;
        
        return i;
    }

    
     
    
}
