/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.DetailCart;
import sneakerHouse.sneakerHouse.entity.Shipping;
import sneakerHouse.sneakerHouse.repository.DetailCartRepository;
import sneakerHouse.sneakerHouse.service.ShippingService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/shipping")
public class ShippingController {
    @Autowired
    ShippingService shippingService;
   
    @Autowired
    DetailCartRepository detailCartRepository;
    
    @PostMapping("/add")
    public void save(@RequestBody Shipping shipping){
        shippingService.save(shipping);
    }
    
    @GetMapping("/{cart_id}")
    public Shipping getShippingbyId(@PathVariable Long cart_id){
       Shipping s =  shippingService.getShippingbyId(cart_id);
        List<DetailCart> dc = detailCartRepository.getDetailbyCart(cart_id);
           s.setDetailCart(dc);
        return s;
    }
}
