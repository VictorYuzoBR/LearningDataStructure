/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

/**
 *
 * @author PC Gamer
 */
public class Lista {
    
    private elemento primeiro;
    private elemento ultimo;
    private int tamanho;
    
    public Lista() {
        this.tamanho = 0;
    }
    

    public elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(elemento primeiro) {
        this.primeiro = primeiro;
    }

    public elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String valor) {
        
        elemento elem = new elemento(valor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = elem;
            this.ultimo = elem;
            tamanho++;
        }
        else {
            this.ultimo.setProximo(elem);
            this.ultimo = elem;
            tamanho++;
        }
        
    }
    
    public String buscar(int valor){
        
        elemento atual = this.primeiro; 
        if (valor > (this.tamanho - 1)) {
           
           
           String frase = "A lista é menor que o elemento requisitado";
           return frase;
            
        }
        else {
            for (int i = 0; i < valor; i++) {
                atual = atual.getProximo();
            }
            return atual.getValor();
        }
    }
    
    public void remover(String valor) {
        elemento atual = this.primeiro;
        elemento anterior = null;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valor)) {
                if (this.getTamanho() == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual = null;
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    atual = null;
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        } 
     
   
               
    }
    
}
