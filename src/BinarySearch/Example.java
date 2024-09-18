/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author PC Gamer
 */
public class Example {
    
    public static void main(String[] args) {
        
      int[] lista = new int[100];
      
      for (int i = 0; i < lista.length; i++){
            
          lista[i] = i+1;
         
      }
      
      int target = 2;
      
      int start = 0;
      int end = lista.length-1;
      int posi = 0;
      boolean found = false;
      
      while (start <= end) {
          int mean = (int) (end+start)/2;
          System.out.println(mean);
      
          if (lista[mean] == target) {
              found = true;
              posi = mean;
              break;
          } else if (lista[mean] < target) {
              start = mean + 1;
          } else {
              end = mean - 1;
          }
      }
      
        
       
      if (found == true) {
          System.out.println("Seu numero foi encontrado na posição "+posi);
      } else {
          System.out.println("não foi encontrado");
      }
 
    }
    
}
