/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author PC Gamer
 */
public class elemento {
    
    private String valor;
    private elemento proximo;
    
    public elemento(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public elemento getProximo() {
        return proximo;
    }

    public void setProximo(elemento proximo) {
        this.proximo = proximo;
    }
    
    
    
    
}
