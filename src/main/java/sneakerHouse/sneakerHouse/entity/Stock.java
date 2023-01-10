/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String id_product;
    private Long id_size;
    private int gender;
    private int amount;

//    @OneToOne(mappedBy = "stock",cascade = CascadeType.ALL)
//    private Size size;
//
//    public Size getSize() {
//        return size;
//    }
//
//    public void setSize(Size size) {
//        this.size = size;
//    }

//     @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "product_id",nullable = false)
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    @JsonBackReference
//    private Product product;
    
    public Long getId_size() {
        return id_size;
    }

    public void setId_size(Long id_size) {
        this.id_size = id_size;
    }
    
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
//
//    public Product getProduct() {
//        return product;
//    }

//    public Size getSize() {
//        return size;
//    }
//
//    public void setSize(Size size) {
//        this.size = size;
//    }
//    public void setProduct(Product product) {    
//        this.product = product;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_product() {
        return id_product;
    }

   
    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

//    public Long getId_size() {
//        return id_size;
//    }
//
//    public void setId_size(Long id_size) {
//        this.id_size = id_size;
//    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
}
