/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mário Sergio
 */
public class Rectangle extends Shape{

    protected Rectangle(Rectangle rectangle){
        this.tipo = rectangle.getTipo();
    }
    
    public Rectangle(){
        this.tipo = "Retângulo";
    }
    
    @Override
    public Shape clonar() {
        return new Rectangle(this);
    }

    @Override
    public String exibirInfo() {
        return "Esta forma é do tipo " + getTipo();
    }
    
}
