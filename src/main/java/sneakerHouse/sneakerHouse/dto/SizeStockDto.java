/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.dto;

/**
 *
 * @author Admin
 */
public class SizeStockDto {
    private Long id_product;
    private double size;
    private int gender;
    private int amount;

    public SizeStockDto(Long id_product, double size, int gender, int amount) {
        this.id_product = id_product;
        this.size = size;
        this.gender = gender;
        this.amount = amount;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
