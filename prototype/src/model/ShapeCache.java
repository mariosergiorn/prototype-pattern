/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mário Sergio
 */
public class ShapeCache {
    
    Map<String, Shape> sc = new HashMap<>();
    
    Circle c = new Circle();
    Square s = new Square();
    Rectangle r = new Rectangle();

    public ShapeCache(){}
    
    public void Cache(){
        sc.put("Circle", c.clonar());
        sc.put("Square", s.clonar());
        sc.put("Rectangle", r.clonar());
    }
    
    public void Map(){
        Set<String> chaves = sc.keySet();
        
        for (String chave : chaves){
                System.out.println(sc.get(chave).exibirInfo());
            }
    }
}

