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
 * @author Thom Casey
 */
public class Event implements Serializable {

    private int healthImpact;
    private String description;

    public Event() {
    }

    public int getHealthImpact() {
        return healthImpact;
    }

    public void setHealthImpact(int healthImpact) {
        this.healthImpact = healthImpact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.healthImpact;
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Event{" + "healthImpact=" + healthImpact + ", description=" + description + '}';
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
        final Event other = (Event) obj;
        if (this.healthImpact != other.healthImpact) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

}
