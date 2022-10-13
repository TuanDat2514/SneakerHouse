/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sneakerHouse.sneakerHouse.entity.Favorite;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Admin
 */
public interface FavoriteRepository extends CrudRepository<Favorite, Long> {
    @Transactional
    @Modifying
    @Query(value = "delete from Favorite f where f.id=?1")
    void deleteFavotite(Long id);
}
