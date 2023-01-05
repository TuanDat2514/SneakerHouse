/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Cart;
import sneakerHouse.sneakerHouse.entity.DetailCart;
import sneakerHouse.sneakerHouse.repository.CartRepository;
import sneakerHouse.sneakerHouse.service.CartService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;
    @Autowired
    CartRepository cartRepository;
    
    @GetMapping("/all")
    public List<Cart> listCart(){
       return cartService.listCart();
    }
    
    @GetMapping("/getCart/{id_cart}")
    public Cart getCart(@PathVariable Long id_cart){
        return cartService.getCart(id_cart);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> addCart(@RequestBody Cart addCart){
        cartService.save(addCart);
        return new ResponseEntity<>(addCart, HttpStatus.valueOf(200));
    }
    
    @PutMapping("/update/{id_cart}")
    public Cart update(@PathVariable Long id_cart, @RequestBody Cart cart) {
        return cartService.updateCart(id_cart, cart);
    }
    @GetMapping("/getListCart")
    public List<Cart> getListCart(){
        return cartService.getListCart();
    }
   
    
}
