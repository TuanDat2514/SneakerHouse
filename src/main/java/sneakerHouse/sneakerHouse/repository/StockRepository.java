/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.mapping.Array;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sneakerHouse.sneakerHouse.dto.SizeStockDto;
import sneakerHouse.sneakerHouse.entity.Stock;

/**s
 *
 * @author Admin
 */
public interface StockRepository extends JpaRepository<Stock, Long> {
    @Query(value="select st.id_product as id_product,s.size,s.gender,st.amount from Size s LEFT JOIN Stock st ON s.id_size=st.id Where st.id_product=?1 and s.gender=?2")
    List<?> getStock(@Param("id_product") String id_product,int gender);
    
    @Query(value="select s.size,s.gender,COALESCE(st.amount,0) from Size s left JOIN Stock st ON s.id_size=st.id_size and st.id_product=?1 where s.id_brand=?2")
    ArrayList<?> getStockProd(@Param("id_product") String id_product,String id_brand);
    
    @Query(value = "select st from Stock st where st.id_product=?1")
    Stock[] getStockbyProd(String id_product);
}
