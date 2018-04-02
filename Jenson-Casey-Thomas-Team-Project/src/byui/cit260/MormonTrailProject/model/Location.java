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
 * @author Isabel Jenson
 */
public class Location implements Serializable {

    private LocationType type;
    private String milepost;
    private Scene scene;
    private int row;
    private int column;
    private Boolean visited;
    private int distanceFromNauvoo;

    public Location() {
    }

    public Location(LocationType type, String milepost, Scene scene) {
        this.type = type;
        this.milepost = milepost;
        this.scene = scene;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public String getMilepost() {
        return milepost;
    }

    public void setMilepost(String milepost) {
        this.milepost = milepost;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + Objects.hashCode(this.milepost);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "type=" + type + ", milepost=" + milepost + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.milepost, other.milepost)) {
            return false;
        }
        return true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
