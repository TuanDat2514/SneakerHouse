/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Admin
 */
@Entity
public class Cart {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id_cart;
     private Long id_user;
     private String date;
     private int subtotal;
     private int discount;
     private int total;
     
//     @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
//    @JsonManagedReference
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private List<DetailCart> detailCart;

    public Cart() {
    }

    public Cart(Long id_cart, Long id_user, String date, int subtotal, int discount, int total) {
        this.id_cart = id_cart;
        this.id_user = id_user;
        this.date = date;
        this.subtotal = subtotal;
        this.discount = discount;
        this.total = total;
//        this.detailCart = detailCart;
    }
    
//     public void addDetail(DetailCart newdetailCart) {
//        detailCart.add(newdetailCart);
//        newdetailCart.setCart(this);
//    }
//     public void removeDetail(DetailCart deletedetailCart) {
//        detailCart.remove(deletedetailCart);
//       deletedetailCart.setCart(null);
//    }
    public Long getId_cart() {
        return id_cart;
    }

    public void setId_cart(Long id_cart) {
        this.id_cart = id_cart;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

//    public List<DetailCart> getDetailCart() {
//        return detailCart;
//    }
//
//    public void setDetailCart(List<DetailCart> detailCart) {
//        this.detailCart = detailCart;
//    }
     
     
}
