/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Shipping;
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
    
    @PostMapping("/add")
    public void save(@RequestBody Shipping shipping){
        shippingService.save(shipping);
    }
 
}
