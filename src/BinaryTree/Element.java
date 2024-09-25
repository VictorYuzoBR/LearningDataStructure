/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author PC Gamer
 */
public class Element {
    
    private Element Right;
    private Element Left;
    private int Val;
    
    public Element(int val) {
        this.Val = val;
    }

    public Element getRight() {
        return Right;
    }

    public void setRight(Element Right) {
        this.Right = Right;
    }

    public Element getLeft() {
        return Left;
    }

    public void setLeft(Element Left) {
        this.Left = Left;
    }

    public int getVal() {
        return Val;
    }

    public void setVal(int Val) {
        this.Val = Val;
    }
    
    
    
}
