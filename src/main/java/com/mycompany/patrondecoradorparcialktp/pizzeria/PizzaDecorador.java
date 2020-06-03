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
public abstract class PizzaDecorador implements PizzaComponente {

    private PizzaComponente pizzaComponente;

    public PizzaDecorador(PizzaComponente pizzaComponente) {
        setPizzaComponente(pizzaComponente);
    }

    public PizzaComponente getPizzaComponente() {
        return pizzaComponente;
    }

    public void setPizzaComponente(PizzaComponente pizzaComponente) {
        this.pizzaComponente = pizzaComponente;
    }

    @Override
    public int precio() {
        return 0;
    }

    @Override
    public String descripcion() {
        return "decorador";
    }

}
