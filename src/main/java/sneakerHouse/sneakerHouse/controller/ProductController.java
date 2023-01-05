/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.validation.constraints.Past;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.dto.BrandSizeDto;
import sneakerHouse.sneakerHouse.dto.Filter;
import sneakerHouse.sneakerHouse.dto.ProductSizeDto;
import sneakerHouse.sneakerHouse.entity.Brand;
import sneakerHouse.sneakerHouse.entity.Product;
import sneakerHouse.sneakerHouse.service.BrandService;
import sneakerHouse.sneakerHouse.service.ProductService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @GetMapping("/all")
    public List<Product> getProduct() {
        return productService.listAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody Product newProduct) {
        productService.save(newProduct);
        return new ResponseEntity<>(null, HttpStatus.valueOf(200));
    }
      @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDetail(@PathVariable Long id){
            productService.delete(id);
        return new ResponseEntity<>(null,HttpStatus.valueOf(202));
    }
    @GetMapping("/getProdbyId/{id_product}")
    public Optional<Product> getList(@PathVariable String id_product) {
        return productService.getProductbyId(id_product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProdbyGender(@RequestParam int gender) {
        return productService.listProductbyGender(gender);
    }
    
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product updateProduct){
        return productService.updateProdcut(updateProduct);
    }
    @GetMapping("/filter")
    public List<?> getProductbyFilter(@RequestBody Filter filter){
        if(filter.getBrand() == "" & filter.getGender() == 0){
           return productService.listProductbyColor(filter.getColor());
        }
        if(filter.getColor() == "" & filter.getGender() == 0){
           return productService.listProductbyBrand(filter.getBrand());
        }
        if(filter.getColor() == "" & filter.getBrand() == ""){
           return productService.listProductbyGender(filter.getGender());
        }
        return productService.listProductbyFilter(filter.getGender(),filter.getColor(),filter.getBrand());
    }
    
    

}
