/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.entity.Product;
import sneakerHouse.sneakerHouse.repository.ProductRepository;

/**
 *
 * @author Admin
 */
@Service
public class ProductService {
    @Autowired
    ProductRepository prodRepo;
    
    public List<Product> listAll() {
        return prodRepo.findAll();
    }
    public void save(Product addProduct){
        prodRepo.save(addProduct).equals(this);
    }
    public Optional<Product> getProductbyId(String id){
        return prodRepo.findById(id);
    }
    
}
