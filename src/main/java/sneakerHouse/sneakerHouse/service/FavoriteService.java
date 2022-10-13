/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Cart;
import sneakerHouse.sneakerHouse.entity.Favorite;
import sneakerHouse.sneakerHouse.entity.User;
import sneakerHouse.sneakerHouse.repository.FavoriteRepository;
import sneakerHouse.sneakerHouse.repository.UserRepository;

/**
 *
 * @author Admin
 */
@Service
public class FavoriteService {
    @Autowired
    FavoriteRepository favoriteRepository;
    
    @Autowired
    UserRepository userRepository;
    
    @Transactional
    public void addFavorite(Favorite favorite,Long id_user){
        User user=userRepository.getUserbyId(id_user);
        user.addFavorite(favorite);
    }

    public void delete(Long id_favorite){
        favoriteRepository.deleteFavotite(id_favorite);
    }
}
