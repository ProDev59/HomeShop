package com.cursan.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;


    //Contructeur
    public Bill(Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * Ajouter un produit a la liste products
     * @param product le produit a ajouter
     * @param quantity la quantité associer
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }



}
