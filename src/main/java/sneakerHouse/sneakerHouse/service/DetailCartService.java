/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javafx.print.Collation;
import javax.transaction.Transactional;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Cart;
import sneakerHouse.sneakerHouse.entity.DetailCart;
import sneakerHouse.sneakerHouse.repository.CartRepository;
import sneakerHouse.sneakerHouse.repository.DetailCartRepository;

/**
 *
 * @author Admin
 */
@Service
public class DetailCartService {
    @Autowired
    DetailCartRepository detailCartRepository;
    @Autowired 
    CartRepository cartRepository;
    
    @Transactional
    public void addDetail(DetailCart detailCart,Long id_cart){
        Cart cart=cartRepository.getCartbyId(id_cart);
        cart.addDetail(detailCart);
    }
    
}
