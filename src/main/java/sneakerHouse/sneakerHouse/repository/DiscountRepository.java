/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sneakerHouse.sneakerHouse.entity.Discount;

/**
 *
 * @author Adminkjhkj
 */
public interface DiscountRepository extends CrudRepository<Discount, Long> {
    
    @Query(value = "select d from Discount d where d.code=?1")
    Discount getDiscount(String code);
}
