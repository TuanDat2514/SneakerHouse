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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Discount;
import sneakerHouse.sneakerHouse.service.DiscountService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/discount")
public class DiscountController {
    @Autowired
    DiscountService discountService; 
    
    @GetMapping("/getDiscount")
    public Discount get(@RequestParam String code) {
        return discountService.getDiscount(code);
    }
    
}
