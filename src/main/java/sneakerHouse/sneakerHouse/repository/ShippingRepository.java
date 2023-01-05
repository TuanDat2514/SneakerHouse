/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sneakerHouse.sneakerHouse.entity.Shipping;

/**
 *
 * @author Admin
 */
public interface ShippingRepository extends CrudRepository<Shipping, Long> {
    
    @Query(value = "select s from Shipping s where s.cart_id=?1")
    Shipping getShippingbyId(Long cart_id);
}
