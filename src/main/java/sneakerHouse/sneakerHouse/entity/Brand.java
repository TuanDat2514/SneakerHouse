/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Admin
 */
@Entity
@Table(name="brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_brand")
    private String id_brand;
    
    @Column(name = "brand")
    private String brand;

    private String table_size;
    @OneToMany(mappedBy = "brand",cascade = CascadeType.ALL)
    @JsonManagedReference
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Product> products;
    
//    @OneToMany(mappedBy = "size_brand",cascade = CascadeType.ALL)
//    @JsonManagedReference
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private List<Size> size;
    
    public String getId_brand() {
        return id_brand;
    }

    public void setId_brand(String id_brand) {
        this.id_brand = id_brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
//    public List<Product> getProduct() {
//        return products;
//    }
//
//    public void setProduct(List<Product> products) {
//        this.products = products;
//    }

    public String getTable_size() {
        return table_size;
    }

    public void setTable_size(String table_size) {
        this.table_size = table_size;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
//
//    public List<Size> getSize() {
//        return size;
//    }
//
//    public void setSize(List<Size> size) {
//        this.size = size;
//    }

   

    
}
