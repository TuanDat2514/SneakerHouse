/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Brand;
import sneakerHouse.sneakerHouse.repository.BrandRepository;

/**
 *
 * @author Administrator
 */
@Service
public class BrandService {
    @Autowired
    BrandRepository brandrepo;
    
    public List<Brand> listBrand(){
     return (List<Brand>) brandrepo.findAll();
    }
    public Optional<Brand> findBrand(String id_brand){
        return brandrepo.findById(id_brand);
    }
    
}
