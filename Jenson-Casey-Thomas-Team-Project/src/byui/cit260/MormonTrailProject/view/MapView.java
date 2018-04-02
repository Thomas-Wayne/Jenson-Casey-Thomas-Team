/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import byui.cit260.MormonTrailProject.exceptions.MapControlException;
import byui.cit260.MormonTrailProject.control.MapControl;
import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.view.ViewInterface.View;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class MapView extends View {
//private final String map;

    private String promptMessage;

    public MapView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n Enter your desired location "
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();

        //retrieve the game
        Game game = BYUICIT260MormonTrailProject.getCurrentGame();

        // retrieve the map from the game
        Map map = game.getMap();

        // retrieve the locations from map
        Location[][] locations = map.getLocations();

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getMapSymbol())) {
                        // @Team - Add try . . . catch - 6/28/2017
                        try {
                            MapControl.movePlayer(map, row, column);
                        } catch (MapControlException me) {
                            ErrorView.display(this.getClass().getName(), me.getMessage());
                        }
                        return true;
                    }
                }
            }
        }
        this.console.println("\n*** Invalid selection *** Try Again later");
        return false;
    }
}
