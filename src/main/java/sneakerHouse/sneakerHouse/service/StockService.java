/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sneakerHouse.sneakerHouse.dto.SizeStockDto;
import sneakerHouse.sneakerHouse.repository.StockRepository;

/**
 *
 * @author Admin
 */
@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;
    
//    public List<?> getStock(){
//        return stockRepository.getStock();
//    }
//    public List<?> getAll(){
//        return stockRepository.findAll();
//    }
}
