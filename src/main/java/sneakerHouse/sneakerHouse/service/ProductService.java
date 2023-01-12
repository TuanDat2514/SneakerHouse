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
    public List<Product> listProductbyGender(int gender){
        return prodRepo.getProductbyGender(gender);
    }
    public List<Product> listProductbyFilter(int gender,String color,String id_brand){
        return prodRepo.getProductbyFilter(gender,color,id_brand);
    }
    public List<Product> listProductbyBrand(String id_brand){
        return prodRepo.getProductbyBrand(id_brand);      
    }
    
    public List<Product> listProductbyColor(String color){
        return prodRepo.getProductbyColor(color);      
    }
    
    public void delete(String id_detail) {
        prodRepo.deleteById(id_detail);
    }
    
    public Product updateProdcut(Product updateProduct){
        Product oldProduct = prodRepo.getProductbyId(updateProduct.getId_product());
        if(oldProduct == null){
            return null;
        }
        if(updateProduct.getImg() != null){
            oldProduct.setImg(updateProduct.getImg());
        }
        oldProduct.setDescription(updateProduct.getDescription());
        oldProduct.setPrice(updateProduct.getPrice());
        
        return prodRepo.save(oldProduct);
    }
    
    public List<Product> searchProduct(String key){
        return prodRepo.searchProductbyName(key);
    }
}
