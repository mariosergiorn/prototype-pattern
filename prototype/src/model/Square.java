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
public class Square extends Shape{
    
    protected Square(Square square){
        this.tipo = square.getTipo();
    }
    
    public Square(){
        this.tipo = "Quadrado";
    }

    @Override
    public Shape clonar() {
        return new Square(this);
    }

    @Override
    public String exibirInfo() {
        return "Esta forma é do tipo " + getTipo();
    }
}
