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
 * @author Jenson, Casey, Thomas Team
 */
public class GameMenu implements Serializable{
    
    public int daysOnTrail;
    public String pace;
    public int milesTraveled;
    public int currentMoneyBalance;
    private Character player;



    public GameMenu() {
    }

    public int getDaysOnTrail() {
        return daysOnTrail;
    }

    public void setDaysOnTrail(int daysOnTrail) {
        this.daysOnTrail = daysOnTrail;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public int getCurrentMoneyBalance() {
        return currentMoneyBalance;
    }

    public void setCurrentMoneyBalance(int currentMoneyBalance) {
        this.currentMoneyBalance = currentMoneyBalance;
    }
    
    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.daysOnTrail;
        hash = 37 * hash + Objects.hashCode(this.pace);
        hash = 37 * hash + this.milesTraveled;
        hash = 37 * hash + this.currentMoneyBalance;
        hash = 37 * hash + Objects.hashCode(this.player);
        return hash;
    }
     @Override
    public String toString() {
        String pace = null;
        return "GameMenu{" + "daysOnTrail=" + daysOnTrail + ", pace=" + pace + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" + currentMoneyBalance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameMenu other = (GameMenu) obj;
        if (this.daysOnTrail != other.daysOnTrail) {
            return false;
        }
        if (this.milesTraveled != other.milesTraveled) {
            return false;
        }
        if (this.currentMoneyBalance != other.currentMoneyBalance) {
            return false;
        }
        if (!Objects.equals(this.pace, other.pace)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }
    
}
    
          
    
            
    
