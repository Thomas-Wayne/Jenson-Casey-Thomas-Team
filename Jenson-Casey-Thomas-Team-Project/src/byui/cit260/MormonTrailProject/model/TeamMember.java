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
 * @author Thomas'
 */
public class TeamMember implements Serializable {
    private String name;
    private String description;
    private String skill;
    private String stamina;
    private String healthStatus;

    public TeamMember() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getStamina() {
        return stamina;
    }

    public void setStamina(String stamina) {
        this.stamina = stamina;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.skill);
        hash = 79 * hash + Objects.hashCode(this.stamina);
        hash = 79 * hash + Objects.hashCode(this.healthStatus);
        return hash;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", description=" + description + ", skill=" + skill + ", stamina=" + stamina + ", healthStatus=" + healthStatus + '}';
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
        final TeamMember other = (TeamMember) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.skill, other.skill)) {
            return false;
        }
        if (!Objects.equals(this.stamina, other.stamina)) {
            return false;
        }
        if (!Objects.equals(this.healthStatus, other.healthStatus)) {
            return false;
        }
        return true;
    }
    
}
