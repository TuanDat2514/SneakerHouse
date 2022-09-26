/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.service.BrandService;
import sneakerHouse.sneakerHouse.entity.Brand;
import sneakerHouse.sneakerHouse.repository.BrandRepository;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandRepository brandRepo;
    
    @GetMapping("/all")
    public List<?> list(){
        return (List<?>) brandRepo.findAll();
    }
    
    
}
