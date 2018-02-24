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
public class Player implements Serializable{
    
    private String name;
    private int money;
    private int huntingSkill;
    private int gatheringSkill;
    private int dailyStaminaDraw;
    private int currentHealth;
    private ArrayList<Game> games = new ArrayList<Game>(); 

    public Player() {
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

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.money;
        hash = 11 * hash + this.huntingSkill;
        hash = 11 * hash + this.gatheringSkill;
        hash = 11 * hash + this.dailyStaminaDraw;
        hash = 11 * hash + this.currentHealth;
        hash = 11 * hash + Objects.hashCode(this.games);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", money=" + money + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", dailyStaminaDraw=" + dailyStaminaDraw + ", currentHealth=" + currentHealth + ", games=" + games + '}';
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
        final Player other = (Player) obj;
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
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
    }

    public String getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
