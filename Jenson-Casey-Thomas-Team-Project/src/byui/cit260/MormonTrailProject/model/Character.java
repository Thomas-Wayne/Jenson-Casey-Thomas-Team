/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 *  @author Jenson, Casey, Thomas Team
 */
public class Character implements Serializable{
    
    public String name;
    public int money;
    public int huntingSkill;
    public int gatheringSkill;
    public int dailyStaminaDraw;
    public int currentHealth;
    private ArrayList<GameMenu> games = new ArrayList<GameMenu>(); 

    

    public Character() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(int huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public int getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(int gatheringSkill) {
        this.gatheringSkill = gatheringSkill;
    }

    public int getDailyStaminaDraw() {
        return dailyStaminaDraw;
    }

    public void setDailyStaminaDraw(int dailyStaminaDraw) {
        this.dailyStaminaDraw = dailyStaminaDraw;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public ArrayList<GameMenu> getGames() {
        return games;
    }

    public void setGames(ArrayList<GameMenu> games) {
        this.games = games;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + this.money;
        hash = 19 * hash + this.huntingSkill;
        hash = 19 * hash + this.gatheringSkill;
        hash = 19 * hash + this.dailyStaminaDraw;
        hash = 19 * hash + this.currentHealth;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", money=" + money + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", dailyStaminaDraw=" + dailyStaminaDraw + ", currentHealth=" + currentHealth + '}';
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
        final Character other = (Character) obj;
        if (this.money != other.money) {
            return false;
        }
        if (this.huntingSkill != other.huntingSkill) {
            return false;
        }
        if (this.gatheringSkill != other.gatheringSkill) {
            return false;
        }
        if (this.dailyStaminaDraw != other.dailyStaminaDraw) {
            return false;
        }
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
        
}
