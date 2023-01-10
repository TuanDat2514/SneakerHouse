/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.dto;

import sneakerHouse.sneakerHouse.entity.Size;

/**
 *
 * @author AS-L42
 */
public class ListSize {
    Size[] men;
    Size[] women;

    public Size[] getMen() {
        return men;
    }

    public void setMen(Size[] men) {
        this.men = men;
    }

    public Size[] getWomen() {
        return women;
    }

    public void setWomen(Size[] women) {
        this.women = women;
    }
    
    
}
