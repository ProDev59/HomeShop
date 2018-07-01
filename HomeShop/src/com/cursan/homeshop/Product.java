package com.cursan.homeshop;

public class Product {

    String name;
    String description;
    double price;

    //Constructeur

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Affiche description complète du produit
     */
    public void look(){

        System.out.println(String.format(name + " : " + price + "%n" + description));

    }

    /**
     * Ajouter le produit a la facture
     * @param bill la facture concerné
     * @param quantity la quantité du produit concerné
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
