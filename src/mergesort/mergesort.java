/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mergesort;

/**
 *
 * @author PC Gamer
 */
public class mergesort {
    
    public static void main(String[] args) {
       
       int[] lista = {5,6,8,9,1,7,3,2,14,15,24,8,5,74};
       
       for (int i = 0; i<lista.length;i++) {
            System.out.print(lista[i]+" ");
        }
       
       MergeSort(lista);
       
        System.out.println("");
        for (int i = 0; i<lista.length;i++) {
            System.out.print(lista[i]+" ");
        }
       
   
        
    }
    
    public static void MergeSort(int[] lista) {
        
        if (lista.length <= 1 ) return;
        
        int middle = lista.length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[lista.length - middle];
        
        int i = 0;
        int j = 0;
        
        while (i < lista.length) {
            if (i < middle) {
                leftArray[i] = lista[i];
            } else {
                rightArray[j] = lista[i];
                j++;
            }
            i++;
        }
        MergeSort(leftArray);
        MergeSort(rightArray);
        merge(lista,leftArray,rightArray);
        
        
        
        
    }
    public static void merge(int[] Original, int[] left, int[] right) {
        
        int count = 0;
        int l = 0;
        int r = 0;
        int sizeleft = left.length;
        int sizeright = right.length;
        
        while (l < sizeleft && r < sizeright) {
            if (left[l] < right[r]) {
                Original[count] = left[l];
                count++;
                l++;
            } else {
                Original[count] = right[r];
                count++;
                r++;
            }
        }
        while (l < sizeleft) {
            Original[count] = left[l];
            count++;
                l++;
        }        
        while (r < sizeright) {
            Original[count] = right[r];
            count++;
                r++;
        }   
        
    }
}
