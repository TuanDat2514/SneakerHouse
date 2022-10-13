/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sneakerHouse.sneakerHouse.entity.DetailCart;
import sneakerHouse.sneakerHouse.repository.DetailCartRepository;
import sneakerHouse.sneakerHouse.service.DetailCartService;

/**
 *
 * @author Admin
 */
@CrossOrigin
@RestController
@RequestMapping("/detailcart")
public class DetailCartController {
    @Autowired
    DetailCartService detailCartService;
    
    @Autowired
    DetailCartRepository detailCartRepository;
    
//    @PostMapping("/add/{id_cart}")
//    public ResponseEntity<?> addDetail(@RequestBody DetailCart detailCart,@PathVariable Long id_cart){
//       detailCartService.addDetail(detailCart,id_cart);
//       return new ResponseEntity<>(null, HttpStatus.valueOf(200));
//    }
    
        @PostMapping("/add")
    public ResponseEntity<?> addDetail(@RequestBody DetailCart detailCart){
       detailCartService.addDetail(detailCart);
       return new ResponseEntity<>(detailCart, HttpStatus.valueOf(200));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDetail(@PathVariable Long id){
            detailCartService.delete(id);
        return new ResponseEntity<>(null,HttpStatus.valueOf(202));
    }
    @GetMapping("/getDetail/{cart_id}")
    public List<DetailCart> getDetail(@PathVariable Long cart_id){
       return (List<DetailCart>) detailCartRepository.getDetailbyCart(cart_id);
    }
//     @PostMapping("/update1/{id_detail}")
//    public ResponseEntity<?> put(@PathVariable Long id_detail,@RequestBody DetailCart input) {
//        Optional<DetailCart> detailOptional = detailCartRepository.findById(id_detail);
//        return detailOptional.map(detail1 -> {
//            input.setId(detail1.getId());
//            return new ResponseEntity<>(detailCartRepository.save(input), HttpStatus.valueOf(303));
//        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.valueOf(300)));
//    }
     @PutMapping("/update/{id_detail}")
    public DetailCart update(@PathVariable Long id_detail, @RequestBody DetailCart detailCart) {
        return detailCartService.update(id_detail, detailCart);
    }
}
