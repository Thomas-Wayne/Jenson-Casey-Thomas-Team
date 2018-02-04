/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Wayne Thomas
 */
public class HotelScene implements Serializable{

    private Player player; 

    public HotelScene() {
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    @Override
    public String toString() {
        return "HotelScene{" + "player=" + player + '}';
    }

    
      
}
