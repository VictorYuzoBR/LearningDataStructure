/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HeapSort;

/**
 *
 * @author PC Gamer
 */
public class heap {

    public static void main(String[] args) {
        // TODO code application logic he
        int[] lista = new int[7];
        int[] lista2 = new int[9];
        lista2[0] = 5; lista2[1] = 1; lista2[2] = 4; lista2[3] = 0; lista2[4] = 7; lista2[5] = 5; lista2[6] = 9;lista2[7] = 15; lista2[8] = 2;
        for (int i = 0; i<lista.length;i++) {
            lista[i] = (int) Math.floor(Math.random() * 10);
        }
        
        for (int i = 0; i<lista2.length;i++) {
            System.out.print(lista2[i]+" ");
        }
        
        int n = lista2.length;
        
        for (int i = n/2 - 1; i>= 0; i--) {
            aplicarheap(lista2,n,i);
        }
        System.out.println("");
             for (int i = 0; i<lista2.length;i++) {
            System.out.print(lista2[i]+" ");
        }
             
        System.out.println("");    
         for (int j = n-1; j>0 ;j--) {
            int aux = lista2[0];
            lista2[0] = lista2[j];
            lista2[j] = aux;
            aplicarheap(lista2,j,0);
            
        }
         
          System.out.println("");
             for (int i = 0; i<lista2.length;i++) {
            System.out.print(lista2[i]+" ");
        }
        
    }
    
    
    private static void aplicarheap(int[] vetor,int n, int i){
        int raiz = i;
        int esquerda = i * 2 + 1;
        int direita = i * 2 + 2;
        
        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        
         if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
         
        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            aplicarheap(vetor,n,raiz);
           
        } 
         
    }
}
