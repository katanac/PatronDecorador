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
public class BordeQueso extends PizzaDecorador {

    public BordeQueso(PizzaComponente pizzaComponente) {
        super(pizzaComponente);
    }

    @Override
    public String descripcion() {
        return getPizzaComponente().descripcion() + "+ Borde de queso"+ " ";
    }

    @Override
    public int precio() {
        return getPizzaComponente().precio() + 3000;
    }

}
