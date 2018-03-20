/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jenson, Casey, Thomas
 */
public class Actor implements Serializable {

    private String name;
    private int health;
    private int stamina;
    private String ability;

    public Actor() {

    }

    public Actor(String name, int health, int stamina, String ability) {

        setName(name);
        setHealth(health);
        setStamina(stamina);
        setAbility(ability);

    }

    public String getName() {

        return name;

    }

    public int getHealth() {

        return health;

    }

    public int getStamina() {

        return stamina;

    }

    public String getAbility() {

        return ability;

    }

    private void setName(String name) {

        this.name = name;

    }

    private void setHealth(int health) {

        this.health = health;

    }

    private void setStamina(int stamina) {

        this.stamina = stamina;
    }

    private void setAbility(String ability) {

        this.ability = ability;

    }

}
