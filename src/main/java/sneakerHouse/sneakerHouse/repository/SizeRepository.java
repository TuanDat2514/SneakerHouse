/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sneakerHouse.sneakerHouse.entity.Size;

/**
 *
 * @author Admin
 */
public interface SizeRepository extends JpaRepository<Size, Long> {
    
}
