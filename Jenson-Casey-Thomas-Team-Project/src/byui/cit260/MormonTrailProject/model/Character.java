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
    
    public String Name;
    public int Money;
    public int HuntingSkill;
    public int GatheringSkill;
    public int DailyStaminaDraw;
    public int CurrentHealth;
    private ArrayList<GameMenu> games = new ArrayList<GameMenu>(); 

    

    public Character() {
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }

    public int getHuntingSkill() {
        return HuntingSkill;
    }

    public void setHuntingSkill(int HuntingSkill) {
        this.HuntingSkill = HuntingSkill;
    }

    public int getGatheringSkill() {
        return GatheringSkill;
    }

    public void setGatheringSkill(int GatheringSkill) {
        this.GatheringSkill = GatheringSkill;
    }

    public int getDailyStaminaDraw() {
        return DailyStaminaDraw;
    }

    public void setDailyStaminaDraw(int DailyStaminaDraw) {
        this.DailyStaminaDraw = DailyStaminaDraw;
    }

    public int getCurrentHealth() {
        return CurrentHealth;
    }

    public void setCurrentHealth(int CurrentHealth) {
        this.CurrentHealth = CurrentHealth;
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
        hash = 19 * hash + Objects.hashCode(this.Name);
        hash = 19 * hash + this.Money;
        hash = 19 * hash + this.HuntingSkill;
        hash = 19 * hash + this.GatheringSkill;
        hash = 19 * hash + this.DailyStaminaDraw;
        hash = 19 * hash + this.CurrentHealth;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "Name=" + Name + ", Money=" + Money + ", HuntingSkill=" + HuntingSkill + ", GatheringSkill=" + GatheringSkill + ", DailyStaminaDraw=" + DailyStaminaDraw + ", CurrentHealth=" + CurrentHealth + '}';
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
        if (this.Money != other.Money) {
            return false;
        }
        if (this.HuntingSkill != other.HuntingSkill) {
            return false;
        }
        if (this.GatheringSkill != other.GatheringSkill) {
            return false;
        }
        if (this.DailyStaminaDraw != other.DailyStaminaDraw) {
            return false;
        }
        if (this.CurrentHealth != other.CurrentHealth) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }
        
}
