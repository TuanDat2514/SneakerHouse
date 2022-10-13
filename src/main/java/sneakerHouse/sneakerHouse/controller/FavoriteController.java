/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Favorite;
import sneakerHouse.sneakerHouse.service.FavoriteService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    FavoriteService favoriteService;
    
    @PostMapping("/add/{id_user}")
    public ResponseEntity<?> addFavorite(@RequestBody Favorite favorite,@PathVariable Long id_user){
        favoriteService.addFavorite(favorite, id_user);
        return new ResponseEntity<>(favorite,HttpStatus.valueOf(200));
    }
    
    @DeleteMapping("/delete/{id_favorite}")
    public ResponseEntity<?> deleteFavorite(@PathVariable Long id_favorite){
//        favoriteService.deleteFavorite(favorite,id_user);
            favoriteService.delete(id_favorite);
            
        return new ResponseEntity<>(null,HttpStatus.valueOf(202));
    }
    
}
