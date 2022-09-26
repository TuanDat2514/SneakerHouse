/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.Product;
import sneakerHouse.sneakerHouse.service.ProductService;

/**
 *
 * @author Admin
 */

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    
    @GetMapping("/all")
    public List<Product> getProduct() {
        return productService.listAll();
    }
}
