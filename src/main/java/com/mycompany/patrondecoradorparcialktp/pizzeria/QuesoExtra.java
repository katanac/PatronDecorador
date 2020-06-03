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
public class QuesoExtra extends PizzaDecorador {

    public QuesoExtra(PizzaComponente pizzaComponente) {
        super(pizzaComponente);
    }

    @Override
    public String descripcion() {
        return getPizzaComponente().descripcion() + "+ Queso extra"+ " ";
    }

    @Override
    public int precio() {
        return getPizzaComponente().precio() + 4000;
    }

}
