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
public class InicioPizeria {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("Bienvenido a la pizzeria UMB");
        System.out.println("===============================\n");
        System.out.println("Esta siendo atendido por Tatiana Peña");
        System.out.println("Esta es la factura de su pedido:");
        System.out.println("===============================\n");

        System.out.println("Pizza de peperoni:\n");
        PizzaComponente pizzaPeperoni = new PizzaPeperoni();
        pizzaPeperoni = new QuesoExtra(pizzaPeperoni);

        System.out.println(pizzaPeperoni.descripcion());
        System.out.println("El precio de la pizza es:" + " " + pizzaPeperoni.precio());

        System.out.println("===============================\n");
        System.out.println("Pizza de hawaiana:\n");

        PizzaComponente pizzaHawaina = new PizzaHawaiana();
        pizzaHawaina = new QuesoExtra(pizzaHawaina);
        pizzaHawaina = new BordeQueso(pizzaHawaina);

        System.out.println(pizzaHawaina.descripcion());
        System.out.println("El precio de la pizza es:" + " " + pizzaHawaina.precio());

    }
}
