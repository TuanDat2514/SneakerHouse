    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.dto.SizeStockDto;
import sneakerHouse.sneakerHouse.entity.Stock;
import sneakerHouse.sneakerHouse.repository.StockRepository;
import sneakerHouse.sneakerHouse.service.StockService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;
    @Autowired
    StockRepository stockRepository;
    
//    @GetMapping("/all")
//    public List<Stock> getStock(){
//        return (List<Stock>) stockService.getAll();
//        
//    }
     @GetMapping("/stockProduct/{id_product}")
    public ArrayList<?> getStock(@PathVariable String id_product,@RequestParam String id_brand){
        ArrayList<?> l = stockRepository.getStockProd(id_product,id_brand);
         return l;
    }
}
