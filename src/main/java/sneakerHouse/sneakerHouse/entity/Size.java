/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "size")
public class Size{
    @Id
      @GeneratedValue
     private Long id_size;
//     private String id_brand;
     private int gender;
     private double size;
//     @OneToOne(cascade = CascadeType.ALL)
//     @JoinColumn(name = "size_link")
//    private Stock stock;
     
      @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_brand",nullable = false)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JsonBackReference
    private Brand size_brand;
    public Long getId_size() {
        return id_size;
    }

    public void setId_size(Long id_size) {
        this.id_size = id_size;
    }
    

//    public String getId_brand() {
//        return id_brand;
//    }
//
//    public void setId_brand(String id_brand) {
//        this.id_brand = id_brand;
//    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
     
}
