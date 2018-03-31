/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.io.PrintWriter;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

/**
 *
 * @author Thomas'
 */
public class ErrorView {

    private static PrintWriter console = BYUICIT260MormonTrailProject.getOutFile();
    private static PrintWriter log = BYUICIT260MormonTrailProject.getLogFile();

    public static void display(String className, String errorMessage) {

        console.println(
                "\n ___Danger Will Robinson______________________________________"
                + "\n" + errorMessage
                + "\n_____________________________________________________________");

        log.printf("%n%n%s", className + "-" + errorMessage);
    }

}
