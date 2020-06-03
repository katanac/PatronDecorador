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
public class PizzaBase implements PizzaComponente{
    
    private String basePizza;
    
    private String tipoQueso;
    
    private boolean tieneSalsa;

    
    public String getBasePizza() {
        return basePizza;
    }

    public void setBasePizza(String basePizza) {
        this.basePizza = basePizza;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public boolean isTieneSalsa() {
        return tieneSalsa;
    }

    public void setTieneSalsa(boolean tieneSalsa) {
        this.tieneSalsa = tieneSalsa;
    }

    @Override
    public int precio() {
       return 7000;
    }

    @Override
    public String descripcion() {
        return  "Esta  pizza solo tiene los ingredientes bases de una pizza";
    }
    
       
    
}
