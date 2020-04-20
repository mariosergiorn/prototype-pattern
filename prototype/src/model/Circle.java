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
public class Circle extends Shape {
    
    protected Circle(Circle circle){
        this.tipo = circle.getTipo();
    }
    
    public Circle(){
        this.tipo = "Circulo";
    }

    @Override
    public Shape clonar() {
        return new Circle(this);
    }

    @Override
    public String exibirInfo() {
        return "Esta forma é do tipo " + getTipo();
        
    }
    
}
