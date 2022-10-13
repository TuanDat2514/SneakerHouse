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

//    @Transactional
//    public void addDetail(DetailCart detailCart,Long id_cart){
//        Cart cart=cartRepository.getCartbyId(id_cart);
//        cart.addDetail(detailCart);
//    }
    public void addDetail(DetailCart detailCart) {
        detailCartRepository.save(detailCart);
    }
//   public void deletebyId(DetailCart detailCart,Long id_cart){
//     Cart cart=cartRepository.getCartbyId(id_cart);
//     cart.removeDetail(detailCart);
//    }
    
     
//    public List<DetailCart> getDetail(Long cart_id) {
//        return (List<DetailCart>) detailCartRepository.getDetailbyCart(cart_id);
//    }

    public void delete(Long id_detail) {
        detailCartRepository.deleteById(id_detail);
    }
    public DetailCart update(Long id_detail,DetailCart detailCart){
       DetailCart dc= detailCartRepository.findById(id_detail).orElse(null);
        if(dc==null){
            return null;
        }
        dc.setId_product(detailCart.getId_product());
        dc.setCart_id(detailCart.getCart_id());
        dc.setColor(detailCart.getColor());
        dc.setName(detailCart.getName());
        dc.setImg(detailCart.getImg());
        dc.setSize(detailCart.getSize());
        dc.setPrice_prod(detailCart.getPrice_prod());
        dc.setQuantity(detailCart.getQuantity());
        dc.setTotal_prod(detailCart.getTotal_prod());
        return detailCartRepository.save(dc);
    }
}
