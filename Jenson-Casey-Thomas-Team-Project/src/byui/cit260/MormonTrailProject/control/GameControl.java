/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Player;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author tcasey
 */
public class GameControl {

    private static Player player;

    public static Player createPlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        return player;

    }

    public static boolean savePlayer(String name) {

        if (playerName.length() < 2) {

            return false;
        }

        BYUICIT260MormonTrailProject.setPlayer(player);

        return true;
    }

    public void dailyMiles() {
        int distance = PlayControl.calcDistanceTravelDay(BYUICIT260MormonTrailProject.getCurrentGame().getPace().ordinal());
        BYUICIT260MormonTrailProject.getCurrentGame().addMilesTraveled(distance);
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        game.setPlayer(player);
        BYUICIT260MormonTrailProject.setCurrentGame(game);
    }

    public static void loadGame(Player player) {

    }

    public static void saveGame(Player player) {

    }

    public static void getHelp(Player player) {

    }

    public static void riverCrossing(Player player) {

    }

    public static void riverCrossingSceneMenuView(Player player) {

    }

    public static void riverCrossingView(Player player) {

    }

    public static void DailyTrailStopSceneMenuView(Player player) {

    }

    public static void GameMenuView(Player player) {

    }

    public static void gatheringSuccessView(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void gatheringSuccessMenuView(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
