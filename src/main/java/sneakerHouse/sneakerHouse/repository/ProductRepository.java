/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import java.util.Collection;
import java.util.List;
import sneakerHouse.sneakerHouse.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author Admin
 */
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "select p from Product p")
    List<Product> getListProduct();
    
    @Query(value = "select p from Product p where p.gender=?1 or p.gender=2")
    List<Product> getProductbyGender(int gender);

 
}
