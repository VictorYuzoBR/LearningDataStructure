/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author PC Gamer
 */
public class Program {
    
      public static void main(String[] args) {
          
          Element x = new Element(10);
          Tree arvore = new Tree(x);
          
          
          arvore.Add(3);
          arvore.Add(2);
          arvore.Add(1);
          arvore.Add(5);
           arvore.Add(15);
       arvore.Add(13);
       arvore.Add(16);
          arvore.Add(7);
          arvore.Add(9);
          
          
          arvore.mostrar(arvore.getRoot());
          System.out.println("");
          arvore.remove(15);
          arvore.mostrar(arvore.getRoot());
          System.out.println("");
       
       
     
         
    
        
    }
    
}
