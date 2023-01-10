/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.dto;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SizeStockDto {
    private double size;
    private int gender;
    private int amount;

    public SizeStockDto(double size, int gender, int amount) {
        this.size = size;
        this.gender = gender;
        this.amount = amount;
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
