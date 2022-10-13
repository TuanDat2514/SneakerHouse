/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "detailcart")
public class DetailCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String id_product;
    private Long cart_id;
    private String img;
    private double size;
    private int quantity;
    private int price_prod;
    private int total_prod;
    private String color;
    private String name;
   
    
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "cart_id", nullable = false)
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    @JsonBackReference
//    private Cart cart;

//    public DetailCart() {
//    }
//
//    public DetailCart(Long id, String id_product, double size, int quantity, int price_prod, int total_prod) {
//        this.id = id;
//        this.id_product = id_product;
//        this.size = size;
//        this.quantity = quantity;
//        this.price_prod = price_prod;
//        this.total_prod = total_prod;
//    }

    
    public String getId_product() {
        return id_product;
    }

    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }

    
    public void setName(String name) {
        this.name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice_prod() {
        return price_prod;
    }

    public void setPrice_prod(int price_prod) {
        this.price_prod = price_prod;
    }

//    public Cart getCart() {
//        return cart;
//    }
//
//    public void setCart(Cart cart) {
//        this.cart = cart;
//    }
    
}
