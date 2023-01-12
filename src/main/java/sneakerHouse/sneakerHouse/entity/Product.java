/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import sneakerHouse.sneakerHouse.dto.ListSize;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id_product")
    private String id_product;
    @Column(name = "id_brand")
    private String id_brand;
    @Column(name = "name")
    private String name;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "trending")
    private int trending;
    private int gender;
    private String img;
    private String sub_img;
    //ListSize listSize;
    @Column(name = "sizeMan",insertable = false,updatable = false)
    private Size[] sizeMan;
    @Column(insertable = false,updatable = false)
    private Size[] sizeWoman;
    @Column(insertable = false,updatable = false)
    private Stock[] stock;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_brand",nullable = true,updatable = false,insertable = false)
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    @JsonBackReference
//    private Brand brand;
      
//    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
//     @JsonManagedReference
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private List<Stock> stock;

    public Size[] getSizeMan() {
        return sizeMan;
    }

    public void setSizeMan(Size[] sizeMan) {
        this.sizeMan = sizeMan;
    }

    public Size[] getSizeWoman() {
        return sizeWoman;
    }

    public void setSizeWoman(Size[] sizeWoman) {
        this.sizeWoman = sizeWoman;
    }

    public Stock[] getStock() {
        return stock;
    }

    public void setStock(Stock[] stock) {
        this.stock = stock;
    }

 

//    public List<Stock> getStock() {
//        return stock;
//    }
//
//    public void setStock(List<Stock> stock) {
//        this.stock = stock;
//    }
//    
  
    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public String getId_product() {
        return id_product;
    }
    
    public String getId_brand() {
        return id_brand;
    }

    public void setId_brand(String id_brand) {
        this.id_brand = id_brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTrending() {
        return trending;
    }

    public void setTrending(int trending) {
        this.trending = trending;
    }

//    public Brand getBrand() {
//        return brand;
//    }
//
//    public void setBrand(Brand brand) {
//        this.brand = brand;
//    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSub_img() {
        return sub_img;
    }

    public void setSub_img(String sub_img) {
        this.sub_img = sub_img;
    }
    
}
