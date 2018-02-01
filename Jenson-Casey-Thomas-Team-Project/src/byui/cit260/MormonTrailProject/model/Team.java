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
public class Team implements Serializable{
    private String memOne;
    private String memTwo;
    private String memThree;
    private String memFour;

    public Team() {
    }

    public String getMemOne() {
        return memOne;
    }

    public void setMemOne(String memOne) {
        this.memOne = memOne;
    }

    public String getMemTwo() {
        return memTwo;
    }

    public void setMemTwo(String memTwo) {
        this.memTwo = memTwo;
    }

    public String getMemThree() {
        return memThree;
    }

    public void setMemThree(String memThree) {
        this.memThree = memThree;
    }

    public String getMemFour() {
        return memFour;
    }

    public void setMemFour(String memFour) {
        this.memFour = memFour;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.memOne);
        hash = 29 * hash + Objects.hashCode(this.memTwo);
        hash = 29 * hash + Objects.hashCode(this.memThree);
        hash = 29 * hash + Objects.hashCode(this.memFour);
        return hash;
    }

    @Override
    public String toString() {
        return "Team{" + "memOne=" + memOne + ", memTwo=" + memTwo + ", memThree=" + memThree + ", memFour=" + memFour + '}';
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
        final Team other = (Team) obj;
        if (!Objects.equals(this.memOne, other.memOne)) {
            return false;
        }
        if (!Objects.equals(this.memTwo, other.memTwo)) {
            return false;
        }
        if (!Objects.equals(this.memThree, other.memThree)) {
            return false;
        }
        if (!Objects.equals(this.memFour, other.memFour)) {
            return false;
        }
        return true;
    }
    
}
