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
import sneakerHouse.sneakerHouse.entity.Brand;
import sneakerHouse.sneakerHouse.entity.Size;

/**
 *
 * @author Admin
 */
public interface SizeRepository extends JpaRepository<Size, Long> {
    @Query(value="select s from Size s where s.id_brand=?1 and s.gender=?2")
    List<?> getSize(@Param("id_brand") String id_brand,int gender);
}
