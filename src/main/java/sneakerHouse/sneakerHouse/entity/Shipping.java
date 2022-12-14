/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long cart_id;
    String consignee;
    String consignee_phone;
    String delivery_address;
    String delivery_method;
    String payment_method;

   @OneToMany(mappedBy = "shipping",cascade = CascadeType.ALL)
   @JsonManagedReference
   @Cascade(org.hibernate.annotations.CascadeType.ALL)
   private List<DetailCart> detailCart;

    public List<DetailCart> getDetailCart() {
        return detailCart;
    }

    public void setDetailCart(List<DetailCart> detailCart) {
        this.detailCart = detailCart;
    }
    
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsignee_phone() {
        return consignee_phone;
    }

    public void setConsignee_phone(String consignee_phone) {
        this.consignee_phone = consignee_phone;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(String delivery_method) {
        this.delivery_method = delivery_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
    
    
}
