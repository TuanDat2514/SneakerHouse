/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Discount;
import sneakerHouse.sneakerHouse.repository.DiscountRepository;

/**
 *
 * @author Admin
 */
@Service
public class DiscountService {
    @Autowired
    DiscountRepository discountRepository;
    
    public Discount getDiscount(String code){
        return discountRepository.getDiscount(code);
    }
} 
