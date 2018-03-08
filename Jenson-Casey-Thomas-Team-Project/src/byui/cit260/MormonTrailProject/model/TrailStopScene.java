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
public class TrailStopScene implements Serializable {

    private boolean hasNearByTown;
    private String nearbyTownName;
    private boolean hasNearbyFort;
    private String nearbyFortName;

    public TrailStopScene() {
    }

    public boolean isHasNearByTown() {
        return hasNearByTown;
    }

    public void setHasNearByTown(boolean hasNearByTown) {
        this.hasNearByTown = hasNearByTown;
    }

    public String getNearbyTownName() {
        return nearbyTownName;
    }

    public void setNearbyTownName(String nearbyTownName) {
        this.nearbyTownName = nearbyTownName;
    }

    public boolean isHasNearbyFort() {
        return hasNearbyFort;
    }

    public void setHasNearbyFort(boolean hasNearbyFort) {
        this.hasNearbyFort = hasNearbyFort;
    }

    public String getNearbyFortName() {
        return nearbyFortName;
    }

    public void setNearbyFortName(String nearbyFortName) {
        this.nearbyFortName = nearbyFortName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.hasNearByTown ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.nearbyTownName);
        hash = 97 * hash + (this.hasNearbyFort ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.nearbyFortName);
        return hash;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "hasNearByTown=" + hasNearByTown + ", nearbyTownName=" + nearbyTownName + ", hasNearbyFort=" + hasNearbyFort + ", nearbyFortName=" + nearbyFortName + '}';
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
        final TrailStopScene other = (TrailStopScene) obj;
        if (this.hasNearByTown != other.hasNearByTown) {
            return false;
        }
        if (this.hasNearbyFort != other.hasNearbyFort) {
            return false;
        }
        if (!Objects.equals(this.nearbyTownName, other.nearbyTownName)) {
            return false;
        }
        if (!Objects.equals(this.nearbyFortName, other.nearbyFortName)) {
            return false;
        }
        return true;
    }

}
