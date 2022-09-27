/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import javax.persistence.Entity;

/**
 *
 * @author Admin
 */

public class DetailCart {
    private String id_product;
    private int id_cart;
    private double size;
    private int quantity;
    private int total_prod;

    public String getId_product() {
        return id_product;
    }

    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public int getId_cart() {
        return id_cart;
    }

    public void setId_cart(int id_cart) {
        this.id_cart = id_cart;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal_prod() {
        return total_prod;
    }

    public void setTotal_prod(int total_prod) {
        this.total_prod = total_prod;
    }
    
    
}
