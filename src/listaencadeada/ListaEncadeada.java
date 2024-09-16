/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaencadeada;

/**
 *
 * @author PC Gamer
 */
public class ListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        System.out.println("Tamanho da lista: "+lista.getTamanho());
        
        lista.adicionar("AC");
        
        System.out.println("Tamanho da lista: "+lista.getTamanho());
        
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());
        
        lista.adicionar("BC");
        System.out.println("");
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());
        
        lista.adicionar("CC");
        System.out.println("");
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());
        System.out.println("Tamanho da lista: "+lista.getTamanho());
        System.out.println("");
        
        for (int i = 0; i < lista.getTamanho(); i++){
            
            System.out.println(lista.buscar(i));
            
        }
        
        lista.adicionar("DC");
        System.out.println("");
        System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+lista.getUltimo().getValor());
        System.out.println("Tamanho da lista: "+lista.getTamanho());
        System.out.println("");
        
        for (int i = 0; i < lista.getTamanho(); i++){
            
            System.out.println(lista.buscar(i));
            
        }
        System.out.println("");
       
        lista.remover("BC");
        
         for (int i = 0; i < lista.getTamanho(); i++){
            
            System.out.println(lista.buscar(i));
            
        }
         System.out.println("");
        lista.adicionar("XC");
        
          for (int i = 0; i < lista.getTamanho(); i++){
            
            System.out.println(lista.buscar(i));
            
        }

    }
    
}
