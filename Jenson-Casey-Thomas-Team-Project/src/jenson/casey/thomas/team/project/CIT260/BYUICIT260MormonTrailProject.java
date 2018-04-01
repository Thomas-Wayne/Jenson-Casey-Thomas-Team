/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenson.casey.thomas.team.project.CIT260;

import byui.cit260.MormonTrailProject.model.Game;
import byui.cit260.MormonTrailProject.model.Player;
import byui.cit260.MormonTrailProject.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jenson, Casey, and Thomas
 */
public class BYUICIT260MormonTrailProject {

    /**
     * @param args the command line arguments
     */
    private static Player player = null;
    private static Game currentGame = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BYUICIT260MormonTrailProject.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BYUICIT260MormonTrailProject.currentGame = currentGame;
    }
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogfile(PrintWriter logFile) {
        BYUICIT260MormonTrailProject.logFile = logFile;
    }

    public static void main(String[] args) {

        try {
            BYUICIT260MormonTrailProject.inFile = new BufferedReader(new InputStreamReader(System.in));
            BYUICIT260MormonTrailProject.outFile = new PrintWriter(System.out, true);
            BYUICIT260MormonTrailProject.logFile = new PrintWriter("logFile.txt");

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause:" + e.getCause()
                    + "\nMessage:" + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {

                if (BYUICIT260MormonTrailProject.inFile != null) {
                    BYUICIT260MormonTrailProject.inFile.close();
                }
                if (BYUICIT260MormonTrailProject.outFile != null) {
                    BYUICIT260MormonTrailProject.outFile.close();
                }
                if (BYUICIT260MormonTrailProject.logFile != null) {
                    BYUICIT260MormonTrailProject.logFile.close();
                }

            } catch (Exception e) {
                System.out.println("Error closing files");
                return;

            }

        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BYUICIT260MormonTrailProject.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BYUICIT260MormonTrailProject.inFile = inFile;
    }

}
