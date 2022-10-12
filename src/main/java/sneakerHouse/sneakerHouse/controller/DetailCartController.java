/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.DetailCart;
import sneakerHouse.sneakerHouse.service.DetailCartService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/detailcart")
public class DetailCartController {
    @Autowired
    DetailCartService detailCartService;
    
    @PostMapping("/add/{id_cart}")
    public ResponseEntity<?> addDetail(@RequestBody DetailCart detailCart,@PathVariable Long id_cart){
       detailCartService.addDetail(detailCart,id_cart);
       return new ResponseEntity<>(null, HttpStatus.valueOf(200));
    }
}
