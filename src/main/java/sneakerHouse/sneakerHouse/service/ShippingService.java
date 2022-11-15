/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Shipping;
import sneakerHouse.sneakerHouse.repository.ShippingRepository;

/**
 *
 * @author Admin
 */
@Service
public class ShippingService {
    @Autowired
    ShippingRepository shippingRepository;
    
    public void save(Shipping shipping){
        shippingRepository.save(shipping);
    }
}
