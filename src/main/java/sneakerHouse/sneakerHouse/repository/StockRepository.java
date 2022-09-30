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
import sneakerHouse.sneakerHouse.dto.SizeStockDto;
import sneakerHouse.sneakerHouse.entity.Stock;

/**
 *
 * @author Admin
 */
public interface StockRepository extends JpaRepository<Stock, Long> {
    @Query(value="select st.id_product as id_product,s.size,s.gender,st.amount from Size s INNER JOIN Stock st ON s.id_size=st.id_size Where st.id_product=?1")
    List<?> getStock(@Param("id_product") String id_product);
}
