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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Cart;
import sneakerHouse.sneakerHouse.service.CartService;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;
    
    @GetMapping("/all")
    public List<Cart> listCart(){
       return cartService.listCart();
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> addCart(@RequestBody Cart addCart){
        cartService.save(addCart);
        return new ResponseEntity<>(null, HttpStatus.valueOf(200));
    }
}
