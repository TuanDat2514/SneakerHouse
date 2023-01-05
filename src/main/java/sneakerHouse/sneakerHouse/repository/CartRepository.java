/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sneakerHouse.sneakerHouse.entity.Cart;

/**
 *
 * @author Admin
 */
@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query(value = "select c from Cart c where c.id_cart=?1 and c.total > 0")
    Cart getCartbyId(Long id_cart);
    
    @Query(value = "select c from Cart c where c.total > 0")
    List<Cart> getListCart();
    
 

	
}
