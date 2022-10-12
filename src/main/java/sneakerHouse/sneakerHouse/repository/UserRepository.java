/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sneakerHouse.sneakerHouse.entity.User;

/**
 *
 * @author Admin
 */
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "select u from User u where u.id_user=?1")
    public User getUserbyId(Long id_user);
    
}
