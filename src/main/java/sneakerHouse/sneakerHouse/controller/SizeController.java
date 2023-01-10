/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Size;
import sneakerHouse.sneakerHouse.repository.SizeRepository;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/size")
public class SizeController {
    @Autowired
    SizeRepository sizeRepository;
    
    @GetMapping("/getSizebyGender/{id_brand}")
     public Size[] listSize(@PathVariable String id_brand,@RequestParam int gender){
        return sizeRepository.getSize(id_brand, gender);
    }
}
