/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patrondecoradorparcialktp.pizzeria;

/**
 *
 * @author Karen.Pena
 */
public class PizzaPeperoni extends PizzaBase{

    @Override
    public String getBasePizza() {
        return super.getBasePizza(); 
    }

    @Override
    public String getTipoQueso() {
        return super.getTipoQueso(); 
    }

    @Override
    public int precio() {
        return 10000; 
    }

    @Override
    public String descripcion() {
        return "pizza con  trocitos de peperoni y salsa bolanesa"+" ";
    }
    
    
}
