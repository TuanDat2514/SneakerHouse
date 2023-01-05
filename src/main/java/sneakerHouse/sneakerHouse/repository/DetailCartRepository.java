/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sneakerHouse.sneakerHouse.entity.DetailCart;

/**
 *
 * @author Admin
 */

public interface DetailCartRepository extends CrudRepository<DetailCart, Long> {
//    @Transactional
//    @Modifying
//    @Query(value = "delete from Detailcart dc where dc.id=?1")
//    void deleteDetail(Long id);
    @Query("select d from DetailCart d where d.cart_id=?1")
    List<DetailCart> getDetailbyCart(Long cart_id);
}
