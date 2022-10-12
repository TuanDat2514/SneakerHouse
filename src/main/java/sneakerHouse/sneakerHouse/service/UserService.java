/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.User;
import sneakerHouse.sneakerHouse.repository.UserRepository;

/**
 *
 * @author Admin
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public Optional<User> getUser(Long id_user){
        return userRepository.findById(id_user);
    }
}
