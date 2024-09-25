/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author PC Gamer
 */
public class Tree {
    
    private Element Root;

    public Element getRoot() {
        return Root;
    }
    
    public Tree(Element Root){
        this.Root = Root;
    }
    
    public void Add(int newval) {
        Element x = new Element(newval);
        
        
        if (this.Root == null) {
            this.Root = x;
        } else {
            Element atual = this.Root;
            while(true) {
                if (x.getVal() < atual.getVal()) {
                    
                    if (atual.getLeft() != null) {
                        atual = atual.getLeft();
                    } else {
                        atual.setLeft(x);
                        break;
                    }
                    
                } else {
                    
                    if (atual.getRight() != null) {
                        atual = atual.getRight();
                    } else {
                        atual.setRight(x);
                        break;
                    }
                    
                }
            }
        }
        
        
    }
    
    public void mostrar(Element root) {
       if (root == null) {
           System.out.println("arvore vazia");
           return;
       } 
       if (root.getLeft() != null) {
           mostrar(root.getLeft());
       }
        System.out.println(root.getVal());
        if (root.getRight() != null) {
           mostrar(root.getRight());
       }
        
    }
    
    public void remove(int valor) {
        
        Element atual = this.Root;
        Element paiatual = null;
        Element substituto = null;
        Element paisubs = null;
        
        while (atual != null) {
            if (atual.getVal() == valor) {
                break;
            } else {
                paiatual = atual;
                if (valor < atual.getVal()) {
                    
                    atual = atual.getLeft();
                } else {                  
                    atual = atual.getRight();
                }
            }
           
        }
        
        if (atual != null){   
            
            if (atual.getLeft() == null && atual.getRight() == null) {
                
                if (paiatual != null) {
                    
                if (atual.getVal() < paiatual.getVal()) {
                    paiatual.setLeft(null);
                } else {
                    paiatual.setRight(null);
                }
                atual = null;
                
                 } else {
                    this.Root = null;
                }
                return;
            }
            
            if (atual.getRight() != null) {
                
                substituto = atual.getRight();
                paisubs = atual;
                while(substituto.getLeft() != null) {
                    
                    paisubs = substituto;
                    substituto = substituto.getLeft();
                    
                } 
                
                if (paiatual != null) {
                    
                    if (substituto.getVal() < paisubs.getVal()) {
                        paisubs.setLeft(null);
                    } else {
                        paisubs.setRight(null);
                    }
                    
                    substituto.setLeft(atual.getLeft());
                    
                    if (atual.getVal() < paiatual.getVal()) {
                        paiatual.setLeft(substituto);
                    } else {
                        paiatual.setRight(substituto);
                    }
                    substituto = null;
                    
                    return;
                } else {
                    
                    this.Root = substituto;
                    
                    return;
                }
                
            }
            
            
             if (atual.getLeft() != null) {
                
                substituto = atual.getLeft();
                paisubs = atual;
                while(substituto.getRight() != null) {
                    
                    paisubs = substituto;
                    substituto = substituto.getRight();
                    
                } 
                
                if (paiatual != null) {
                    
                    if (substituto.getVal() < paisubs.getVal()) {
                        paisubs.setLeft(null);
                    } else {
                        paisubs.setRight(null);
                    }
                    
                    if (atual.getVal() < paiatual.getVal()) {
                        paiatual.setLeft(substituto);
                    } else {
                        paiatual.setRight(substituto);
                    }
                    substituto = null;
                    return;
                    
                } else {
                 
                 this.Root = substituto;
                 
             }
                
            } 
            
            
            
        } else {
            System.out.println("Elemento não existe na árvore");
        }
        
        
        
    }
    
        
    
    
    
}
