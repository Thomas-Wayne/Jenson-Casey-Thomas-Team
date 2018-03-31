/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

import byui.cit260.MormonTrailProject.control.GameControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jenson, Casey, Thomas Team
 */
public class Game implements Serializable {

    private int daysOnTrail;
    private Pace pace;
    private int milesTraveled;
    private int currentMoneyBalance;
    private Player player;
    private Map map;
    private Inventory[] inventory;
    private ArrayList<Actor> actors;

    public Game() {
    }

    public int getDaysOnTrail() {
        return daysOnTrail;
    }

    public void setDaysOnTrail(int daysOnTrail) {
        this.daysOnTrail = daysOnTrail;
    }

    public Pace getPace() {
        return pace;
    }

    public void setPace(Pace pace) {
        this.pace = pace;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void addMilesTraveled(int miles) {
        milesTraveled += miles;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
        return "Game{" + "daysOnTrail=" + daysOnTrail + ", pace=" + pace + ", milesTraveled=" + milesTraveled + ", currentMoneyBalance=" + currentMoneyBalance + ", player=" + player + '}';
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
        final Game other = (Game) obj;
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

    public Inventory[] getInventory() {

        return inventory;

    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Actor> getActors() {

        return actors;

    }

    public void setActor(ArrayList<Actor> actors) {

        this.actors = actors;
    }

    public void saveGame(Game game) {

    }

    public void loadGame(Game game) {
        
    }
}
