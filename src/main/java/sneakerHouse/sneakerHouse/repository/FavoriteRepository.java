/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.repository.CrudRepository;
import sneakerHouse.sneakerHouse.entity.Favorite;

/**
 *
 * @author Admin
 */
public interface FavoriteRepository extends CrudRepository<Favorite, Long> {
    
}
