/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Cart;
import sneakerHouse.sneakerHouse.repository.CartRepository;

/**
 *
 * @author Admin
 */
@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    public List<Cart> listCart(){
        return cartRepository.findAll();
    }
    public void save(Cart cart){
        cartRepository.save(cart);
    }
    public Cart getCart(Long id_cart){
        return cartRepository.getCartbyId(id_cart);
    }
    public Cart updateCart(Long id_cart,Cart cart){
        Cart c=cartRepository.getCartbyId(id_cart);
        if(c == null){
            return null;
        }
        c.setDiscount(cart.getDiscount());
        c.setSubtotal(cart.getSubtotal());
        c.setTotal(cart.getTotal());
        c.setId_user(cart.getId_user());
        c.setDate(cart.getDate());
        c.setStatus(cart.getStatus());
        return cartRepository.save(c);
    }
    public List<Cart> getListCart(){
        return cartRepository.getListCart();
    }
    
}
