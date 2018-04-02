/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.control;

import byui.cit260.MormonTrailProject.exceptions.ReportControlException;
import byui.cit260.MormonTrailProject.model.Location;
import byui.cit260.MormonTrailProject.model.Map;
import byui.cit260.MormonTrailProject.model.Scene;
import byui.cit260.MormonTrailProject.view.ErrorView;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tcasey
 */
public class ReportControl {

    public static boolean sceneReport(Map map, String fileName)
            throws ReportControlException {

        boolean success = true;
        try (PrintWriter out = new PrintWriter(fileName)) {
            DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            Date date = new Date();

            out.println("\n\n             Scene Report - as of " + sdf.format(date));
            out.printf("%n%-30s%-10s", "Name", "Symbol", "Dist. from Nauvoo");
            out.printf("%n%-30s%-10s", "----", "------", "-----------------");

            for (int row = 0; row < map.getRowCount(); row++) {
                for (int column = 0; column < map.getColumnCount(); column++) {

                    Location location = map.getLocations()[row][column];
                    Scene scene = location.getScene();
                    out.printf("%n%-10s%-10s", scene.getName(),
                            scene.getMapSymbol(),
                            scene.getDistanceFromNauvoo());

                }
            }

        } catch (IOException ex) {
            ErrorView.display("ReportControl", ex.getMessage());
            success = false;
        }
        return success;
    }

}
